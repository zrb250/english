package com.yc.english.weixin.views.utils;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shizhefei.view.indicator.Indicator;
import com.yc.english.R;
import com.yc.english.intelligent.view.fragments.IntelligentFragment;
import com.yc.english.intelligent.view.fragments.IntelligentQuestionsFragment;
import com.yc.english.weixin.views.fragments.CourseFragment;
import com.yc.english.weixin.views.fragments.CourseMoreFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangkai on 2017/9/6.
 */

public class TabsUtils {
    public static class MyAdapter extends Indicator.IndicatorAdapter {
        private Activity mContext;
        private String[] mTitles;
        private int mWidth;

        public MyAdapter(Activity context, String[] titles) {
            this(context, titles, 0);
        }

        public MyAdapter(Activity context, String[] titles, int width) {
            super();
            this.mWidth = width;
            this.mContext = context;
            this.mTitles = titles;
        }

        @Override
        public int getCount() {
            return mTitles.length;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = mContext.getLayoutInflater().inflate(R.layout.weixin_tab, parent, false);
            }
            TextView textView = (TextView) convertView;
            textView.setText(mTitles[position]);
            if (mWidth != 0) {
                textView.setWidth(mWidth);
            }
            return convertView;
        }
    }

    public static class MainFragmentAdapter extends FragmentStatePagerAdapter {
        private List<CourseFragment> courseFragments;
        private int count;

        public MainFragmentAdapter(FragmentManager fm, String[] types) {
            super(fm);
            courseFragments = new ArrayList<>();
            for (int i = 0; i < types.length; i++) {
                CourseFragment courseFragment = new CourseFragment();

                courseFragments.add(courseFragment);
            }
            count = types.length;
        }

        @Override
        public Fragment getItem(int position) {
            return courseFragments.get(position);
        }

        @Override
        public int getCount() {
            return count;
        }
    }

    public static class IntelligentFragmentAdapter extends FragmentStatePagerAdapter {
        private List<IntelligentFragment> intelligentFragments;
        private int count;

        public IntelligentFragmentAdapter(FragmentManager fm, String[] types) {
            super(fm);
            intelligentFragments = new ArrayList<>();
            for (int i = 0; i < types.length; i++) {
                IntelligentFragment intelligentFragment = new IntelligentFragment();
                intelligentFragment.setType(types[i]);
                intelligentFragments.add(intelligentFragment);
            }
            count = types.length;
        }

        @Override
        public Fragment getItem(int position) {
            return intelligentFragments.get(position);
        }

        @Override
        public int getCount() {
            return count;
        }
    }

    public static class IntelligentQuestionsFragmentAdapter extends FragmentStatePagerAdapter {
        private List<IntelligentQuestionsFragment> intelligentQuestionsFragments;
        private int count;

        public IntelligentQuestionsFragmentAdapter(FragmentManager fm, String[] types) {
            super(fm);
            intelligentQuestionsFragments = new ArrayList<>();
            for (int i = 0; i < types.length; i++) {
                IntelligentQuestionsFragment intelligentQuestionsFragment = new IntelligentQuestionsFragment();
                intelligentQuestionsFragment.setType(types[i]);
                intelligentQuestionsFragments.add(intelligentQuestionsFragment);
            }
            count = types.length;
        }

        @Override
        public Fragment getItem(int position) {
            return intelligentQuestionsFragments.get(position);
        }

        @Override
        public int getCount() {
            return count;
        }
    }

    public static class MoreFragmentAdapter extends FragmentStatePagerAdapter {
        private List<CourseMoreFragment> courseFragments;
        private int count;

        public MoreFragmentAdapter(FragmentManager fm, String[] types) {
            super(fm);
            courseFragments = new ArrayList<>();
            for (int i = 0; i < types.length; i++) {
                CourseMoreFragment courseMoreFragment = new CourseMoreFragment();
                courseMoreFragment.setType(types[i]);
                courseFragments.add(courseMoreFragment);
            }
            count = types.length;
        }

        @Override
        public Fragment getItem(int position) {
            return courseFragments.get(position);
        }

        @Override
        public int getCount() {
            return count;
        }
    }

}
