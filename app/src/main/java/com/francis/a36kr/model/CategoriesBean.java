package com.francis.a36kr.model;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-17-2016
 *
 * 首页新闻资讯分类 Tab 信息实体类
 */
public class CategoriesBean {

	/**
	 * 分类 tab 名称
	 */
	private String title;

	/**
	 * 分类点击地址
	 */
	private String href;

	/**
	 * 分类类型
	 */
	private String data_type;

	public CategoriesBean(String title, String href, String data_type) {
		super();
		this.title = title;
		this.href = href;
		this.data_type = data_type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getData_type() {
		return data_type;
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

	@Override
	public String toString() {
		return "CategoriesBean [title=" + title + ", href=" + href
				+ ", data_type=" + data_type + "]";
	}
}
