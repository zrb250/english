package com.yc.english.main.model.domain;

import com.yc.english.base.model.Config;

/**
 * Created by zhangkai on 2017/8/1.
 */

public class URLConfig {
    public static final boolean DEBUG = Config.DEBUG;

    private static String baseUrl = "http://en.wk2.com/api/";
    private static String debugBaseUrl = "http://en.qqtn.com/api/";

    public static final String REGISTER_URL = getBaseUrl() + "user/mobile_reg";
    public static final String REGISTER_SEND_CODE_URL = getBaseUrl() + "user/reg_sendCode";
    public static final String LOGIN_URL = getBaseUrl() + "user/login";
    public static final String FORGOT_SEND_CODE_URL = getBaseUrl() + "user/forgetPwd_sendCode";
    public static final String FORGOT_URL = getBaseUrl() + "user/reset_pwd";

    public static final String POST_MESSAGE_URL = getBaseUrl() + "user/post_msg";
    public static final String UPD_MESSAGE_URL = getBaseUrl() + "user/upd";
    public static final String UPD_PWD_URL = getBaseUrl() + "user/upd_pwd";


    public static final String INDEX_URL = getBaseUrl() + "index/index";

    public static final String GET_USER_INFO_URL = getBaseUrl() + "user/info";

    public static final String SHARE_INFO_URL = getBaseUrl() + "index/share_info";

    public static final String APPIDS_URL = getBaseUrl() + "index/xfapp_list";

    public static final String NEWS_URL = getBaseUrl() + "news/search";

    public static final String NEWS_INFO_URL = getBaseUrl() + "news/info";

    public static final String WEIKE_CATEGORY_URL = getBaseUrl() + "news/getParentList";

    public static final String WEIKE_UNIT_URL = getBaseUrl() + "news/getChildList";

    public static final String MY_ORDER_URL = getBaseUrl() + "order/lists";

    public static final String Ability_score_url = getBaseUrl() + "UserTest/unitTest";

    public static final String INDEX_DIALOG_URL = getBaseUrl() + "index/adv_init";

    public static final String INDEX_MENU_URL = getBaseUrl() + "index/menu_adv";

    public static final String GUEST_REG_URL = getBaseUrl() + "user/name_reg";//游客注册

    public static final String VIP_GOOD_URL = getBaseUrl() + "vip/index";//

    public static final String ZW_INDEX_URL = getBaseUrl() + "zw/index";//作文板块首页

    public static final String ZW_SUCAINAV_URL = getBaseUrl() + "zwattr/sucainav";//作文素材

    public static final String ZW_LISTS_URL = getBaseUrl() + "zw/lists";//作文素材列表

    public static final String ZW_DETAIL_URL = getBaseUrl() + "zw/detail";//作文素材详情页

    public static final String ZW_SEARCH_URL = getBaseUrl() + "zw/search";//作文搜索

    public static final String ZW_READ_NUM_URL = getBaseUrl() + "zw/read_pv";//统计点击数量

    public static final String NEWS_READ_NUM_URL = getBaseUrl() + "news/read_pv";//新闻点击数量

    public static final String VIP_INFO_LIST_URL = getBaseUrl() + "goods/lists";//会员种类

    public static final String BIND_PHONE_URL = getBaseUrl() + "user/bind_mobile";//绑定手机号

    public static String getBaseUrl() {
        return (DEBUG ? debugBaseUrl : baseUrl);
    }

}
