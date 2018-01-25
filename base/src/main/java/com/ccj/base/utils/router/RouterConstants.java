package com.ccj.base.utils.router;
/**
 * Created by chenchangjun on 17/8/9.
 */


public final class RouterConstants {




    /**
     * home module
     */
    public static final String HOME_MODULE_NAME="/homemodule/";
    public static final String HOME_MUDULE_FRAGMENT_HOME_HOME = HOME_MODULE_NAME+"FRAGMENT_HOME_HOME";


    /**
     * user module
     */
    public static final String USER_MODULE_NAME ="/loginmodule/";

    public static final String USER_MUDULE_FRAGMENT_HOME_USER = USER_MODULE_NAME+"FRAGMENT_HOME_USER";


    public static final String USER_MOUDLE_ACTIVITY = USER_MODULE_NAME +"LoginActivity";
    public static final String USER_SERVICE_IMPL = USER_MODULE_NAME +"LoginServiceImpl";
    public static final String USER_REGISTER_FRAGMENT = USER_MODULE_NAME +"/RegisterFragment";

    /**
     * video module
     */
    public static final String VIDEO_MODULE_NAME="/videomodule/";
    public static final String VIDEO_MUDULE_FRAGMENT_HOME_VIDEO = VIDEO_MODULE_NAME+"FRAGMENT_HOME_VIDEO";

    public static final String VIDEO_MUDULE_ACTIVITY = VIDEO_MODULE_NAME+"TakePhotoActivity";
    public static final String VIDEO_SERVICE_IMPL = VIDEO_MODULE_NAME+"VideoServiceImpl";




    /**
     * haojia module
     */
    public static final String HAOJIA_MODULE_NAME="/haojiamodule/";
    public static final String HAOJIA_MUDULE_FRAGMENT_HOME_HAOJIA = HAOJIA_MODULE_NAME+"FRAGMENT_HOME_HAOJIA";
    public static final String HAOJIA_MUDULE_ACTIVITY_HAOJIA_DETAIL = HAOJIA_MODULE_NAME+"ACTIVITY_HAOJIA_DETAIL";


}
