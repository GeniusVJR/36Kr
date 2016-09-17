package com.francis.a36kr.utils;

import com.francis.a36kr.model.CategoriesBean;
import java.util.ArrayList;
import java.util.List;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-17-2016
 */
public class CategoryDataUtils {

	public static List<CategoriesBean> getCategoryBeans() {

		List<CategoriesBean> beans = new ArrayList<>();
		beans.add(new CategoriesBean("全部", "http://www.36kr.com/", "全部"));
		beans.add(new CategoriesBean("氪TV", "http://www.36kr.com/columns/tv", "tv"));
		beans.add(new CategoriesBean("O2O", "http://www.36kr.com/columns/o2o", "o2o"));
		beans.add(new CategoriesBean("新硬件", "http://www.36kr.com/columns/hardware", "hardware"));
		beans.add(new CategoriesBean("Fun!!", "http://www.36kr.com/columns/fun", "fun"));
		beans.add(new CategoriesBean("企业服务", "http://www.36kr.com/columns/enterprise", "enterprise"));
		beans.add(new CategoriesBean("Fit&Health", "http://www.36kr.com/columns/sports", "sports"));
		beans.add(new CategoriesBean("在线教育", "http://www.36kr.com/columns/edu", "edu"));
		beans.add(new CategoriesBean("互联网金融", "http://www.36kr.com/columns/finance", "finance"));
		beans.add(new CategoriesBean("大公司", "http://www.36kr.com/columns/company", "company"));
		beans.add(new CategoriesBean("专栏", "http://www.36kr.com/columns/column", "column"));
		return beans;
	}
}
