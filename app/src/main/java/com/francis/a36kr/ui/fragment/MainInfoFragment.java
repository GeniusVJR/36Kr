package com.francis.a36kr.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.francis.a36kr.R;
import com.francis.a36kr.common.DefineView;
import com.francis.a36kr.model.CategoriesBean;
import com.francis.a36kr.ui.fragment.adapter.FixedPagerAdapter;
import com.francis.a36kr.ui.fragment.base.BaseFragment;
import com.francis.a36kr.utils.CategoryDataUtils;
import java.util.List;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-16-2016
 */
public class MainInfoFragment extends BaseFragment implements DefineView{

	private View mView;
	private TabLayout tab_layout;
	private ViewPager info_viewpager;
	private FixedPagerAdapter mFixedPagerAdapter;
	private List<Fragment> mFragments;
	private static List<CategoriesBean> categoriesBeans = CategoryDataUtils.getCategoryBeans();

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

		if(mView == null){
			mView = inflater.inflate(R.layout.main_info_fragment_layout, container, false);
			initView();
			initValidata();
			initListener();
			bindData();
		}
		return mView;
	}

	@Override
	public void initView() {
		tab_layout=(TabLayout)mView.findViewById(R.id.tab_layout);
		info_viewpager=(ViewPager)mView.findViewById(R.id.info_viewpager);
	}

	@Override
	public void initValidata() {

	}

	@Override
	public void initListener() {

	}

	@Override
	public void bindData() {

	}
}
