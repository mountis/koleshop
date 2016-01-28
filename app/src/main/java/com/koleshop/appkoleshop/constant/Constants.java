package com.koleshop.appkoleshop.constant;

/**
 * Created by gundeepsingh on 17/08/14.
 */
public class Constants {

    public static String APP_NAME = "koleshop android app";

    //device type = 0 for Android Devices
    public static int DEVICE_TYPE = 0;

    //google project id
    public static String GOOGLE_PROJECT_ID_OLD = "210363682882";
    public static String GOOGLE_PROJECT_ID = "885947438841";
    public static String GOOGLE_API_SCOPE = "audience:server:client_id:885947438841-cmjuupacclqrmd9u7a3m2e3ccsp8dmte.apps.googleusercontent.com";

    public static String SHOP_SETTINGS_PREFIX = "shop_settings_";

    public static String BUYER_SETTINGS_PREFIX = "buyer_settings_";

    public static String SESSION_TYPE_SELLER = "1";
    public static String SESSION_TYPE_BUYER = "2";

    public static String SERVER_URL = "https://koleshop-1.appspot.com/_ah/api/"; //production url
    //public static String SERVER_URL = "10.0.3.2"; //local url

    // The authority for the sync adapter's content provider
    public static String AUTHORITY = "com.kolshop.kolshop.provider";
    // An account type, in the form of a domain name
    public static String ACCOUNT_TYPE = "com.kolshop.kolshop";
    // The account name
    public static String ACCOUNT = "dummyaccount_kolshop";
    // Instance fields
    public static String GOOGLE_USER_TOKEN = "google_user_token";

    //configurable constants
    public static boolean RESET_REALM = true;
    public static boolean KOLE_CACHE_ALLOWED = true;

    public static String PUBLIC_IMAGE_URL_PREFIX = "https://storage.googleapis.com/koleshop-bucket/uploads/";
    public static String REQUEST_STATUS_PREFIX = "image_upload_status_";
    public static int IMAGE_UPLOAD_DIMENSIONS = 400;


    //Broadcast Actions
    public static final String ACTION_PRODUCT_CATEGORIES_LOAD_SUCCESS = "com.koleshop.action_product_categories_load_success";
    public static final String ACTION_PRODUCT_CATEGORIES_LOAD_FAILED = "com.koleshop.action_product_categories_load_failed";
    public static final String ACTION_PRODUCT_BRANDS_LOAD_SUCCESS = "com.koleshop.action_product_brands_load_success";
    public static final String ACTION_PRODUCT_BRANDS_LOAD_FAILED = "com.koleshop.action_product_brands_load_failed";
    public static final String ACTION_ADD_VARIETY = "com.koleshop.action_add_variety";
    public static final String ACTION_DELETE_VARIETY = "com.koleshop.action_delete_variety";
    public static final String ACTION_PROPERTY_MODIFIED = "com.koleshop.action_property_modified";
    public static final String ACTION_REQUEST_OTP = "com.koleshop.action_request_otp";
    public static final String ACTION_REQUEST_OTP_SUCCESS = "com.koleshop.action_request_otp_success";
    public static final String ACTION_REQUEST_OTP_FAILED = "com.koleshop.action_request_otp_fail";
    public static final String ACTION_VERIFY_OTP = "com.koleshop.action_verify_otp";
    public static final String ACTION_VERIFY_OTP_SUCCESS = "com.koleshop.action_verify_otp_success";
    public static final String ACTION_VERIFY_OTP_FAILED = "com.koleshop.action_verify_otp_fail";
    public static final String ACTION_OTP_RECEIVED = "com.koleshop.action_otp_received";
    public static final String ACTION_SAVE_PRODUCT = "com.koleshop.action_save_product";
    public static final String ACTION_UPDATE_PRODUCT_VARIETY_UI = "com.koleshop.action_update_product_variety_ui" ;
    public static final String ACTION_FETCH_INVENTORY_CATEGORIES = "com.koleshop.action_fetch_inventory_categories" ;
    public static final String ACTION_FETCH_INVENTORY_CATEGORIES_SUCCESS = "com.koleshop.action_fetch_inventory_categories_success" ;
    public static final String ACTION_FETCH_INVENTORY_CATEGORIES_FAILED = "com.koleshop.action_fetch_inventory_categories_failed" ;
    public static final String ACTION_FETCH_INVENTORY_SUBCATEGORIES = "com.koleshop.action_fetch_inventory_subcategories" ;
    public static final String ACTION_FETCH_INVENTORY_SUBCATEGORIES_SUCCESS = "com.koleshop.action_fetch_inventory_subcategories_success" ;
    public static final String ACTION_FETCH_INVENTORY_SUBCATEGORIES_FAILED = "com.koleshop.action_fetch_inventory_subcategories_failed" ;
    public static final String ACTION_FETCH_INVENTORY_PRODUCTS = "com.koleshop.action_fetch_inventory_products" ;
    public static final String ACTION_FETCH_INVENTORY_PRODUCTS_SUCCESS = "com.koleshop.action_fetch_inventory_products_success" ;
    public static final String ACTION_FETCH_INVENTORY_PRODUCTS_FAILED = "com.koleshop.action_fetch_inventory_products_failed" ;
    public static final String ACTION_UPDATE_INVENTORY_PRODUCT_SELECTION = "com.koleshop.action_update_inventory_product_selection" ;
    public static final String ACTION_UPDATE_INVENTORY_PRODUCT_SELECTION_SUCCESS = "com.koleshop.action_update_inventory_product_selection_success" ;
    public static final String ACTION_UPDATE_INVENTORY_PRODUCT_SELECTION_FAILURE = "com.koleshop.action_update_inventory_product_selection_failure" ;
    public static final String ACTION_NOTIFY_PRODUCT_SELECTION_VARIETY_TO_PARENT = "com.koleshop.action_notify_product_selection_variety_to_parent" ;
    public static final String ACTION_COLLAPSE_EXPANDED_PRODUCT = "com.koleshop.action_collapse_expanded_product" ;
    @Deprecated public static final String ACTION_CAPTURE_PRODUCT_VARIETY_PICTURE = "com.koleshop.action_take_product_variety_picture";
    public static final String ACTION_UPLOAD_IMAGE = "com.koleshop.action_upload_bitmap";
    public static final String ACTION_UPLOAD_IMAGE_SUCCESS = "com.koleshop.action_upload_bitmap_success";
    public static final String ACTION_UPLOAD_IMAGE_FAILED = "com.koleshop.action_upload_bitmap_failed";
    public static final String ACTION_PRODUCT_SAVE_SUCCESS = "com.koleshop.action_product_save_success";
    public static final String ACTION_PRODUCT_SAVE_FAILED = "com.koleshop.action_product_save_failed";
    public static final String ACTION_SWITCH_TO_WAREHOUSE = "com.koleshop.action_switch_to_warehouse";
    public static final String ACTION_SWITCH_BACK_TO_MY_SHOP = "com.koleshop.action_switch_back_to_myshop";
    public static final String ACTION_RELOAD_SETTINGS = "com.koleshop.action_reload_settings";

    //gcm broadcast actions
    public static final String ACTION_GCM_REGISTRATION_COMPLETE = "com.koleshop.action_gcm_registration_complete";
    public static final String ACTION_GCM_REGISTRATION_FAILED = "com.koleshop.action_gcm_registration_failed";
    public static final String ACTION_GCM_BROADCAST_INVENTORY_CREATED = "com.koleshop.action_gcm_broadcast_inventory_created";

    //Shared preferences keys
    public static final String KEY_REG_ID = "registration_id";
    public static final String KEY_REG_ID_OLD = "registration_id_old";
    public static final String KEY_USER_SESSION_TYPE = "pref_user_type";
    public static final String KEY_USER_PHONE_NUMBER = "pref_user_phone";
    public static final String KEY_SKIP_ALLOWED = "pref_skip_allowed";
    public static final String KEY_USER_ID = "pref_user_id";
    public static final String KEY_SESSION_ID = "pref_session_id";
    public static final String KEY_GOOGLE_API_TOKEN = "pref_google_api_token";
    public static final String KEY_SELLER_SETTINGS = "pref_seller_settings";
    public static final String KEY_SELLER_SETTINGS_MILLIS = "pref_seller_settings_millis";

    //Preferences Flags
    public static final String FLAG_PRODUCT_CATEGORIES_LOADED = "product_categories_loaded";
    public static final String FLAG_BRANDS_LOADED = "brands_loaded";
    public static final String FLAG_LATEST_TOKEN_AVAILABLE = "latest_token_available";
    public static final String FLAG_DEVICE_ID_SYNCED_TO_SERVER = "device_id_synced_to_server";

    public static final String PRICE_PROPERTY_NAME = "price";

    public static final int APP_CACHE_VERSION = 1;
    public static final String CACHE_ID = "cache_id_string";
    public static final String CACHE_ID_DATE = "cache_id_date";
    public static final int RAM_CACHE_SIZE = 5 * 1024 * 1024; // 5 mb
    public static final int DISK_CACHE_SIZE = 15 * 1024 * 1024; //15 mb
    public static final int RAM_CACHE_SIZE_DATE = 1 * 1024 * 1024; // 5 mb
    public static final int DISK_CACHE_SIZE_DATE = 3 * 1024 * 1024; //15 mb


    //DualCache keys and expiration time
    //global inventory cache constants
    public static final String CACHE_INVENTORY_CATEGORIES = "cache_inventory_categories";
    public static final int TIME_TO_LIVE_CATEGORY_CACHE = 5; //cache_inventory_categories will expire in 5 minutes
    public static final String CACHE_INVENTORY_SUBCATEGORIES = "cache_inventory_subcategories_"; //this key will be extended by the parent category id
    public static final int TIME_TO_LIVE_INV_SUBCAT = 5; //cache_inventory_subcategories_x will expire in 5 minutes
    public static final String CACHE_INVENTORY_PRODUCTS = "cache_inventory_products_"; //this key will be extended by the category id
    public static final int TIME_TO_LIVE_PRODUCT_CACHE = 5; //product realm cache will expire in 5 minutes
    //my inventory cache constants
    public static final String CACHE_MY_INVENTORY_CATEGORIES = "cache_my_inventory_categories";
    public static final int TIME_TO_LIVE_MY_INV_CAT = 5; //cache_my_inventory_categories will expire in 5 minutes
    public static final String CACHE_MY_INVENTORY_SUBCATEGORIES = "cache_my_inventory_subcategories_"; //this key will be extended by the parent category id
    public static final int TIME_TO_LIVE_MY_INV_SUBCAT = 5; //cache_my_inventory_subcategories_x will expire in 5 minutes
    public static final String CACHE_MY_INVENTORY_PRODUCTS = "cache_my_inventory_products_"; //this key will be extended by the category id
    public static final int TIME_TO_LIVE_MY_INV_PRODUCT = 5; //cache_my_inventory_subcategories_x will expire in 5 minutes

    //server client response statuses other than success and failure
    public static final String STATUS_KOLE_RESPONSE_CREATING_INVENTORY = "status_kole_response_creating_inventory";

    //Symbols
    public static final String INDIAN_RUPEE_SYMBOL = "\u20B9";

}
