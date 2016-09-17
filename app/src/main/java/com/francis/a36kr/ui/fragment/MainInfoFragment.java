package com.francis.a36kr.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.francis.a36kr.ui.fragment.base.BaseFragment;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-16-2016
 */
public class MainInfoFragment extends BaseFragment{

	private View mView;
	private TabLayout tab_layout;
	private ViewPager info_viewpager;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return super.onCreateView(inflater, container, savedInstanceState);
	}
}
