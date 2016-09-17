package com.francis.a36kr.common;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-16-2016
 *
 *
 * 所有的 Activity ， Fragment 可以实现这个接口，来进行一些公共的操作
 */
public interface DefineView {

	/**
	 * 初始化界面元素
	 */
	public void initView();

	/**
	 * 初始化变量
	 */
	public void initValidata();

	/**
	 * 初始化监听器
	 */
	public void initListener();

	/**
	 * 绑定数据
	 */
	public void bindData();
}
