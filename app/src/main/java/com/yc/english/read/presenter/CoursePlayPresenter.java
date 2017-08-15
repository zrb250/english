package com.yc.english.read.presenter;

import android.content.Context;

import com.kk.securityhttp.domain.ResultInfo;
import com.yc.english.base.helper.ResultInfoHelper;
import com.yc.english.base.presenter.BasePresenter;
import com.yc.english.read.contract.CoursePlayContract;
import com.yc.english.read.model.domain.EnglishCourseInfoList;
import com.yc.english.read.model.engin.CoursePlayEngin;

import rx.Subscriber;
import rx.Subscription;

/**
 * Created by admin on 2017/8/7.
 */

public class CoursePlayPresenter extends BasePresenter<CoursePlayEngin, CoursePlayContract.View> implements CoursePlayContract.Presenter {

    public CoursePlayPresenter(Context context, CoursePlayContract.View view) {
        super(context, view);
        mEngin = new CoursePlayEngin(context);
    }

    @Override
    public void getCourseListByUnitId(int currentPage, int pageCount, String unitId) {
        mView.showLoading();
        Subscription subscribe = mEngin.getCourseListByUnitId(currentPage, pageCount, unitId).subscribe(new Subscriber<ResultInfo<EnglishCourseInfoList>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                mView.showNoNet();
            }

            @Override
            public void onNext(final ResultInfo<EnglishCourseInfoList> resultInfo) {
                ResultInfoHelper.handleResultInfo(resultInfo, new ResultInfoHelper.Callback() {
                    @Override
                    public void resultInfoEmpty(String message) {
                        mView.showNoNet();
                    }

                    @Override
                    public void resultInfoNotOk(String message) {
                        mView.showNoNet();
                    }

                    @Override
                    public void reulstInfoOk() {
                        if(resultInfo.data.getList().size() == 0){
                            mView.showNoData();
                        }else{
                            mView.showCourseListData(resultInfo.data);
                            mView.hideStateView();
                        }
                    }
                });
            }
        });

        mSubscriptions.add(subscribe);
    }

    @Override
    public void loadData(boolean forceUpdate, boolean showLoadingUI) {

    }
}
