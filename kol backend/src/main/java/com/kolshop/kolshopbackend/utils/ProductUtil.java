package com.kolshop.kolshopbackend.utils;

import com.kolshop.kolshopbackend.beans.Product;
import com.kolshop.kolshopbackend.beans.ProductInfoPackage;
import com.kolshop.kolshopbackend.beans.ProductVariety;
import com.kolshop.kolshopbackend.beans.ProductVarietyAttribute;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gundeep on 14/05/15.
 */
public class ProductUtil {

    public static List<Product> getProductList(List<ProductInfoPackage> packages)
    {
        List<Product> listOfProducts = new ArrayList<>();

        for(ProductInfoPackage packazze:packages)
        {
            if(!productAlreadyExistsInList(listOfProducts, packazze))
            {
                Product pro = new Product(packazze);
                List<ProductVariety> productVariety = makeProductVariety(pro, packages);
                pro.setProductVarieties(productVariety);
                listOfProducts.add(pro);
            }

        }
        return listOfProducts;
    }

    private static List<ProductVariety> makeProductVariety(Product product, List<ProductInfoPackage> packages) {

        List<ProductVariety> productVarieties = new ArrayList<>();

        for(ProductInfoPackage packaze : packages)
        {
            if(!productVarietyAlreadyExists(productVarieties, packaze) && packaze.getProductId() == product.getId())
            {
                ProductVariety proVar = new ProductVariety(packaze);
                List<ProductVarietyAttribute> productVarietyAttributes = makeProductVarietyAttributes(proVar, packages);
                proVar.setProductVarietyAttributes(productVarietyAttributes);
                productVarieties.add(proVar);
            }
        }

        return productVarieties;

    }

    private static List<ProductVarietyAttribute> makeProductVarietyAttributes(ProductVariety proVar, List<ProductInfoPackage> packages) {
        List<ProductVarietyAttribute> productVarietyAttributes = new ArrayList<>();

        for(ProductInfoPackage packaze : packages)
        {
            if(!productVarietyAttributeAlreadyExists(productVarietyAttributes, packaze) && packaze.getProductVarietyId() == proVar.getId())
            {
                ProductVarietyAttribute proVarAttr = new ProductVarietyAttribute(packaze);
                productVarietyAttributes.add(proVarAttr);
            }
        }

        return productVarietyAttributes;

    }

    private static boolean productAlreadyExistsInList(List<Product> listOfProducts, ProductInfoPackage packazze) {

        for(Product pro : listOfProducts)
        {
            if(pro.getId() == packazze.getProductId())
            {
                return true;
            }
        }
        return false;
    }

    private static boolean productVarietyAlreadyExists(List<ProductVariety> productVarieties, ProductInfoPackage packaze) {

        for(ProductVariety proVar : productVarieties)
        {
            if(proVar.getId() == packaze.getProductVarietyId())
            {
                return true;
            }
        }

        return false;

    }

    private static boolean productVarietyAttributeAlreadyExists(List<ProductVarietyAttribute> productVarietyAttributes, ProductInfoPackage packaze) {

        for(ProductVarietyAttribute proVarAttr : productVarietyAttributes)
        {
            if(proVarAttr.getId() == packaze.getAttributeId())
            {
                return true;
            }
        }

        return false;

    }

}
