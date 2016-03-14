package com.koleshop.appkoleshop.util;

import android.os.AsyncTask;

import com.koleshop.appkoleshop.model.cart.ProductVarietyCount;
import com.koleshop.appkoleshop.model.parcel.SellerSettings;
import com.koleshop.appkoleshop.model.realm.Cart;
import com.koleshop.appkoleshop.model.realm.ProductVariety;
import com.koleshop.appkoleshop.singletons.CartsSingleton;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmList;
import io.realm.RealmQuery;
import io.realm.RealmResults;

/**
 * Created by Gundeep on 02/03/16.
 */
public class CartUtils {

    public static void increaseCount(String title, final ProductVariety productVariety, final SellerSettings sellerSettings) {
        Cart cart = CartsSingleton.getSharedInstance().getCart(sellerSettings);
        RealmList<ProductVarietyCount> list = cart.getProductVarietyCountList();
        boolean countIncreased = false;
        for (ProductVarietyCount provarcount : list) {
            ProductVariety currentProductVariety = provarcount.getProductVariety();
            if (currentProductVariety != null && currentProductVariety.getId().equals(productVariety.getId())) {
                provarcount.setCartCount(provarcount.getCartCount() + 1);
                provarcount.setTitle(title);
                countIncreased = true;
                break;
            }
        }
        if (!countIncreased) {
            ProductVarietyCount productVarietyCount = new ProductVarietyCount(title, productVariety, 1);
            list.add(productVarietyCount);
            cart.setProductVarietyCountList(list);
        }
        updateCart(cart);
    }

    public static void increaseCount(ProductVarietyCount productVarietyCount, SellerSettings sellerSettings) {
        increaseCount(productVarietyCount.getTitle(), productVarietyCount.getProductVariety(), sellerSettings);
    }

    public static void decreaseCount(ProductVariety productVariety, SellerSettings sellerSettings) {
        Cart cart = CartsSingleton.getSharedInstance().getCart(sellerSettings);
        List<ProductVarietyCount> list = cart.getProductVarietyCountList();
        for (ProductVarietyCount provarcount : list) {
            ProductVariety currentProductVariety = provarcount.getProductVariety();
            if (currentProductVariety != null && currentProductVariety.getId().equals(productVariety.getId())) {
                if (provarcount.getCartCount() <= 1) {
                    list.remove(provarcount);
                    if (cart.getProductVarietyCountList() == null || cart.getProductVarietyCountList().size() == 0) {
                        CartsSingleton.getSharedInstance().removeCart(cart);
                        deleteCart(cart);
                        return;
                    }
                } else {
                    provarcount.setCartCount(provarcount.getCartCount() - 1);
                }
                updateCart(cart);
                break;
            }
        }
    }

    public static int getCountOfVariety(ProductVariety productVariety, SellerSettings sellerSettings) {
        Cart cart = CartsSingleton.getSharedInstance().getCart(sellerSettings);
        List<ProductVarietyCount> list = cart.getProductVarietyCountList();
        int count = 0;
        for (ProductVarietyCount provarcount : list) {
            ProductVariety currentProductVariety = provarcount.getProductVariety();
            if (currentProductVariety != null && currentProductVariety.getId().equals(productVariety.getId())) {
                if (provarcount.getCartCount() >= 1) {
                    count = provarcount.getCartCount();
                }
                break;
            }
        }
        return count;
    }

    public static void clearCart(Cart cart) {
        List<Cart> carts = CartsSingleton.getSharedInstance().getCarts();
        if (carts != null) {
            for (int i = carts.size() - 1; i > -1; i--) {
                if (carts.get(i).getSellerId().equals(cart.getSellerId())) {
                    //cart match...remove this cart
                    carts.remove(cart);
                    deleteCart(cart);
                }
            }
        }
    }

    public static void clearAllCarts() {
        CartsSingleton.getSharedInstance().setCarts(null);

        Realm realm = Realm.getDefaultInstance();
        RealmResults<Cart> carts = realm.where(Cart.class).findAll();
        realm.beginTransaction();
        carts.clear();
        realm.commitTransaction();
        realm.close();

    }

    public static void updateCart(Cart cart) {
        new AsyncTask<Object, Void, Void>() {
            @Override
            protected Void doInBackground(Object... params) {
                Cart cart1 = (Cart) params[0];
                final Realm realm = Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.copyToRealmOrUpdate(cart1);
                realm.commitTransaction();
                realm.close();
                return null;
            }
        }.execute(cart);
    }

    public static void deleteCart(Cart cart) {
        new AsyncTask<Object, Void, Void>() {
            @Override
            protected Void doInBackground(Object... params) {
                Cart cart1 = (Cart) params[0];
                final Realm realm = Realm.getDefaultInstance();
                RealmQuery<Cart> query = realm.where(Cart.class)
                        .equalTo("sellerId", cart1.getSellerId());
                Cart realmCart = query.findFirst();
                if (realmCart == null) {
                    //this cart doesn't exist
                } else {
                    realm.beginTransaction();
                    realmCart.removeFromRealm();
                    realm.commitTransaction();
                }
                realm.close();
                return null;
            }
        }.execute(cart);
    }

}