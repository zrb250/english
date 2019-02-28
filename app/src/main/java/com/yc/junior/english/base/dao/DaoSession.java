package com.yc.junior.english.base.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.yc.junior.english.group.model.bean.ClassInfo;
import com.yc.junior.english.group.model.bean.StudentInfo;
import com.yc.junior.english.read.model.domain.BookInfo;
import com.yc.junior.english.read.model.domain.GradeInfo;
import com.yc.junior.english.speak.model.bean.QuestionInfoBean;
import com.yc.junior.english.weixin.model.domain.CourseInfo;

import com.yc.junior.english.base.dao.ClassInfoDao;
import com.yc.junior.english.base.dao.StudentInfoDao;
import com.yc.junior.english.base.dao.BookInfoDao;
import com.yc.junior.english.base.dao.GradeInfoDao;
import com.yc.junior.english.base.dao.QuestionInfoBeanDao;
import com.yc.junior.english.base.dao.CourseInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig classInfoDaoConfig;
    private final DaoConfig studentInfoDaoConfig;
    private final DaoConfig bookInfoDaoConfig;
    private final DaoConfig gradeInfoDaoConfig;
    private final DaoConfig questionInfoBeanDaoConfig;
    private final DaoConfig courseInfoDaoConfig;

    private final ClassInfoDao classInfoDao;
    private final StudentInfoDao studentInfoDao;
    private final BookInfoDao bookInfoDao;
    private final GradeInfoDao gradeInfoDao;
    private final QuestionInfoBeanDao questionInfoBeanDao;
    private final CourseInfoDao courseInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        classInfoDaoConfig = daoConfigMap.get(ClassInfoDao.class).clone();
        classInfoDaoConfig.initIdentityScope(type);

        studentInfoDaoConfig = daoConfigMap.get(StudentInfoDao.class).clone();
        studentInfoDaoConfig.initIdentityScope(type);

        bookInfoDaoConfig = daoConfigMap.get(BookInfoDao.class).clone();
        bookInfoDaoConfig.initIdentityScope(type);

        gradeInfoDaoConfig = daoConfigMap.get(GradeInfoDao.class).clone();
        gradeInfoDaoConfig.initIdentityScope(type);

        questionInfoBeanDaoConfig = daoConfigMap.get(QuestionInfoBeanDao.class).clone();
        questionInfoBeanDaoConfig.initIdentityScope(type);

        courseInfoDaoConfig = daoConfigMap.get(CourseInfoDao.class).clone();
        courseInfoDaoConfig.initIdentityScope(type);

        classInfoDao = new ClassInfoDao(classInfoDaoConfig, this);
        studentInfoDao = new StudentInfoDao(studentInfoDaoConfig, this);
        bookInfoDao = new BookInfoDao(bookInfoDaoConfig, this);
        gradeInfoDao = new GradeInfoDao(gradeInfoDaoConfig, this);
        questionInfoBeanDao = new QuestionInfoBeanDao(questionInfoBeanDaoConfig, this);
        courseInfoDao = new CourseInfoDao(courseInfoDaoConfig, this);

        registerDao(ClassInfo.class, classInfoDao);
        registerDao(StudentInfo.class, studentInfoDao);
        registerDao(BookInfo.class, bookInfoDao);
        registerDao(GradeInfo.class, gradeInfoDao);
        registerDao(QuestionInfoBean.class, questionInfoBeanDao);
        registerDao(CourseInfo.class, courseInfoDao);
    }
    
    public void clear() {
        classInfoDaoConfig.clearIdentityScope();
        studentInfoDaoConfig.clearIdentityScope();
        bookInfoDaoConfig.clearIdentityScope();
        gradeInfoDaoConfig.clearIdentityScope();
        questionInfoBeanDaoConfig.clearIdentityScope();
        courseInfoDaoConfig.clearIdentityScope();
    }

    public ClassInfoDao getClassInfoDao() {
        return classInfoDao;
    }

    public StudentInfoDao getStudentInfoDao() {
        return studentInfoDao;
    }

    public BookInfoDao getBookInfoDao() {
        return bookInfoDao;
    }

    public GradeInfoDao getGradeInfoDao() {
        return gradeInfoDao;
    }

    public QuestionInfoBeanDao getQuestionInfoBeanDao() {
        return questionInfoBeanDao;
    }

    public CourseInfoDao getCourseInfoDao() {
        return courseInfoDao;
    }

}
