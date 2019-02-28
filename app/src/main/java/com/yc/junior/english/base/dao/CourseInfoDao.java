package com.yc.junior.english.base.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.yc.junior.english.weixin.model.domain.CourseInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "COURSE_INFO".
*/
public class CourseInfoDao extends AbstractDao<CourseInfo, String> {

    public static final String TABLENAME = "COURSE_INFO";

    /**
     * Properties of entity CourseInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", true, "ID");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Url = new Property(2, String.class, "url", false, "URL");
        public final static Property Keywords = new Property(3, String.class, "keywords", false, "KEYWORDS");
        public final static Property Type_id = new Property(4, String.class, "type_id", false, "TYPE_ID");
        public final static Property Period = new Property(5, String.class, "period", false, "PERIOD");
        public final static Property Flag = new Property(6, String.class, "flag", false, "FLAG");
        public final static Property Author = new Property(7, String.class, "author", false, "AUTHOR");
        public final static Property Add_time = new Property(8, String.class, "add_time", false, "ADD_TIME");
        public final static Property Add_date = new Property(9, String.class, "add_date", false, "ADD_DATE");
        public final static Property Img = new Property(10, String.class, "img", false, "IMG");
        public final static Property Html = new Property(11, String.class, "html", false, "HTML");
        public final static Property Url_type = new Property(12, int.class, "url_type", false, "URL_TYPE");
        public final static Property UserId = new Property(13, String.class, "userId", false, "USER_ID");
        public final static Property Body = new Property(14, String.class, "body", false, "BODY");
        public final static Property Ip_num = new Property(15, String.class, "ip_num", false, "IP_NUM");
        public final static Property Pv_num = new Property(16, String.class, "pv_num", false, "PV_NUM");
        public final static Property Sort = new Property(17, String.class, "sort", false, "SORT");
        public final static Property IsChecked = new Property(18, boolean.class, "isChecked", false, "IS_CHECKED");
        public final static Property Price = new Property(19, float.class, "price", false, "PRICE");
        public final static Property MPrice = new Property(20, float.class, "mPrice", false, "M_PRICE");
        public final static Property VipPrice = new Property(21, float.class, "vipPrice", false, "VIP_PRICE");
        public final static Property GoodId = new Property(22, String.class, "goodId", false, "GOOD_ID");
        public final static Property IsPay = new Property(23, int.class, "isPay", false, "IS_PAY");
        public final static Property Is_vip = new Property(24, int.class, "is_vip", false, "IS_VIP");
        public final static Property UserHas = new Property(25, int.class, "userHas", false, "USER_HAS");
        public final static Property UserNum = new Property(26, String.class, "userNum", false, "USER_NUM");
        public final static Property UnitNum = new Property(27, String.class, "unitNum", false, "UNIT_NUM");
        public final static Property PayPrice = new Property(28, float.class, "payPrice", false, "PAY_PRICE");
        public final static Property GoodUseTimeLimit = new Property(29, int.class, "goodUseTimeLimit", false, "GOOD_USE_TIME_LIMIT");
    }


    public CourseInfoDao(DaoConfig config) {
        super(config);
    }
    
    public CourseInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"COURSE_INFO\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "\"TITLE\" TEXT," + // 1: title
                "\"URL\" TEXT," + // 2: url
                "\"KEYWORDS\" TEXT," + // 3: keywords
                "\"TYPE_ID\" TEXT," + // 4: type_id
                "\"PERIOD\" TEXT," + // 5: period
                "\"FLAG\" TEXT," + // 6: flag
                "\"AUTHOR\" TEXT," + // 7: author
                "\"ADD_TIME\" TEXT," + // 8: add_time
                "\"ADD_DATE\" TEXT," + // 9: add_date
                "\"IMG\" TEXT," + // 10: img
                "\"HTML\" TEXT," + // 11: html
                "\"URL_TYPE\" INTEGER NOT NULL ," + // 12: url_type
                "\"USER_ID\" TEXT," + // 13: userId
                "\"BODY\" TEXT," + // 14: body
                "\"IP_NUM\" TEXT," + // 15: ip_num
                "\"PV_NUM\" TEXT," + // 16: pv_num
                "\"SORT\" TEXT," + // 17: sort
                "\"IS_CHECKED\" INTEGER NOT NULL ," + // 18: isChecked
                "\"PRICE\" REAL NOT NULL ," + // 19: price
                "\"M_PRICE\" REAL NOT NULL ," + // 20: mPrice
                "\"VIP_PRICE\" REAL NOT NULL ," + // 21: vipPrice
                "\"GOOD_ID\" TEXT," + // 22: goodId
                "\"IS_PAY\" INTEGER NOT NULL ," + // 23: isPay
                "\"IS_VIP\" INTEGER NOT NULL ," + // 24: is_vip
                "\"USER_HAS\" INTEGER NOT NULL ," + // 25: userHas
                "\"USER_NUM\" TEXT," + // 26: userNum
                "\"UNIT_NUM\" TEXT," + // 27: unitNum
                "\"PAY_PRICE\" REAL NOT NULL ," + // 28: payPrice
                "\"GOOD_USE_TIME_LIMIT\" INTEGER NOT NULL );"); // 29: goodUseTimeLimit
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"COURSE_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CourseInfo entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(3, url);
        }
 
        String keywords = entity.getKeywords();
        if (keywords != null) {
            stmt.bindString(4, keywords);
        }
 
        String type_id = entity.getType_id();
        if (type_id != null) {
            stmt.bindString(5, type_id);
        }
 
        String period = entity.getPeriod();
        if (period != null) {
            stmt.bindString(6, period);
        }
 
        String flag = entity.getFlag();
        if (flag != null) {
            stmt.bindString(7, flag);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(8, author);
        }
 
        String add_time = entity.getAdd_time();
        if (add_time != null) {
            stmt.bindString(9, add_time);
        }
 
        String add_date = entity.getAdd_date();
        if (add_date != null) {
            stmt.bindString(10, add_date);
        }
 
        String img = entity.getImg();
        if (img != null) {
            stmt.bindString(11, img);
        }
 
        String html = entity.getHtml();
        if (html != null) {
            stmt.bindString(12, html);
        }
        stmt.bindLong(13, entity.getUrl_type());
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(14, userId);
        }
 
        String body = entity.getBody();
        if (body != null) {
            stmt.bindString(15, body);
        }
 
        String ip_num = entity.getIp_num();
        if (ip_num != null) {
            stmt.bindString(16, ip_num);
        }
 
        String pv_num = entity.getPv_num();
        if (pv_num != null) {
            stmt.bindString(17, pv_num);
        }
 
        String sort = entity.getSort();
        if (sort != null) {
            stmt.bindString(18, sort);
        }
        stmt.bindLong(19, entity.getIsChecked() ? 1L: 0L);
        stmt.bindDouble(20, entity.getPrice());
        stmt.bindDouble(21, entity.getMPrice());
        stmt.bindDouble(22, entity.getVipPrice());
 
        String goodId = entity.getGoodId();
        if (goodId != null) {
            stmt.bindString(23, goodId);
        }
        stmt.bindLong(24, entity.getIsPay());
        stmt.bindLong(25, entity.getIs_vip());
        stmt.bindLong(26, entity.getUserHas());
 
        String userNum = entity.getUserNum();
        if (userNum != null) {
            stmt.bindString(27, userNum);
        }
 
        String unitNum = entity.getUnitNum();
        if (unitNum != null) {
            stmt.bindString(28, unitNum);
        }
        stmt.bindDouble(29, entity.getPayPrice());
        stmt.bindLong(30, entity.getGoodUseTimeLimit());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CourseInfo entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(3, url);
        }
 
        String keywords = entity.getKeywords();
        if (keywords != null) {
            stmt.bindString(4, keywords);
        }
 
        String type_id = entity.getType_id();
        if (type_id != null) {
            stmt.bindString(5, type_id);
        }
 
        String period = entity.getPeriod();
        if (period != null) {
            stmt.bindString(6, period);
        }
 
        String flag = entity.getFlag();
        if (flag != null) {
            stmt.bindString(7, flag);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(8, author);
        }
 
        String add_time = entity.getAdd_time();
        if (add_time != null) {
            stmt.bindString(9, add_time);
        }
 
        String add_date = entity.getAdd_date();
        if (add_date != null) {
            stmt.bindString(10, add_date);
        }
 
        String img = entity.getImg();
        if (img != null) {
            stmt.bindString(11, img);
        }
 
        String html = entity.getHtml();
        if (html != null) {
            stmt.bindString(12, html);
        }
        stmt.bindLong(13, entity.getUrl_type());
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(14, userId);
        }
 
        String body = entity.getBody();
        if (body != null) {
            stmt.bindString(15, body);
        }
 
        String ip_num = entity.getIp_num();
        if (ip_num != null) {
            stmt.bindString(16, ip_num);
        }
 
        String pv_num = entity.getPv_num();
        if (pv_num != null) {
            stmt.bindString(17, pv_num);
        }
 
        String sort = entity.getSort();
        if (sort != null) {
            stmt.bindString(18, sort);
        }
        stmt.bindLong(19, entity.getIsChecked() ? 1L: 0L);
        stmt.bindDouble(20, entity.getPrice());
        stmt.bindDouble(21, entity.getMPrice());
        stmt.bindDouble(22, entity.getVipPrice());
 
        String goodId = entity.getGoodId();
        if (goodId != null) {
            stmt.bindString(23, goodId);
        }
        stmt.bindLong(24, entity.getIsPay());
        stmt.bindLong(25, entity.getIs_vip());
        stmt.bindLong(26, entity.getUserHas());
 
        String userNum = entity.getUserNum();
        if (userNum != null) {
            stmt.bindString(27, userNum);
        }
 
        String unitNum = entity.getUnitNum();
        if (unitNum != null) {
            stmt.bindString(28, unitNum);
        }
        stmt.bindDouble(29, entity.getPayPrice());
        stmt.bindLong(30, entity.getGoodUseTimeLimit());
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public CourseInfo readEntity(Cursor cursor, int offset) {
        CourseInfo entity = new CourseInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // url
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // keywords
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // type_id
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // period
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // flag
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // author
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // add_time
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // add_date
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // img
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // html
            cursor.getInt(offset + 12), // url_type
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // userId
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // body
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // ip_num
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // pv_num
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // sort
            cursor.getShort(offset + 18) != 0, // isChecked
            cursor.getFloat(offset + 19), // price
            cursor.getFloat(offset + 20), // mPrice
            cursor.getFloat(offset + 21), // vipPrice
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // goodId
            cursor.getInt(offset + 23), // isPay
            cursor.getInt(offset + 24), // is_vip
            cursor.getInt(offset + 25), // userHas
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // userNum
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // unitNum
            cursor.getFloat(offset + 28), // payPrice
            cursor.getInt(offset + 29) // goodUseTimeLimit
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CourseInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setKeywords(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setType_id(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPeriod(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setFlag(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAuthor(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setAdd_time(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setAdd_date(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setImg(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setHtml(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setUrl_type(cursor.getInt(offset + 12));
        entity.setUserId(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setBody(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setIp_num(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setPv_num(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setSort(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setIsChecked(cursor.getShort(offset + 18) != 0);
        entity.setPrice(cursor.getFloat(offset + 19));
        entity.setMPrice(cursor.getFloat(offset + 20));
        entity.setVipPrice(cursor.getFloat(offset + 21));
        entity.setGoodId(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setIsPay(cursor.getInt(offset + 23));
        entity.setIs_vip(cursor.getInt(offset + 24));
        entity.setUserHas(cursor.getInt(offset + 25));
        entity.setUserNum(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setUnitNum(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setPayPrice(cursor.getFloat(offset + 28));
        entity.setGoodUseTimeLimit(cursor.getInt(offset + 29));
     }
    
    @Override
    protected final String updateKeyAfterInsert(CourseInfo entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(CourseInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(CourseInfo entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
