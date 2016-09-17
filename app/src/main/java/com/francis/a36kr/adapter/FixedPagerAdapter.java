package com.francis.a36kr.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;
import com.francis.a36kr.model.CategoriesBean;
import java.util.List;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-17-2016
 *
 * Fragment 自定义适配器，其中管理每个页面（Fragment 集合）和 Tab 显示标题
 */
public class FixedPagerAdapter extends FragmentStatePagerAdapter{

	private List<CategoriesBean> mCategoriesBeen;

	public void setCategoriesBeen(List<CategoriesBean> categoriesBeen) {
		mCategoriesBeen = categoriesBeen;
	}

	private List<Fragment> mFragments;

	public void setFragments(List<Fragment> fragments) {
		mFragments = fragments;
	}

	public FixedPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		return mFragments.get(position);
	}

	@Override
	public int getCount() {
		return mFragments.size();
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		Fragment fragment = null;

		fragment = (Fragment) super.instantiateItem(container, position);

		return fragment;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return mCategoriesBeen.get(position % mCategoriesBeen.size()).getTitle();
	}
}
