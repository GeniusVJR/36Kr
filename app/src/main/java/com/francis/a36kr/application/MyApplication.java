package com.francis.a36kr.application;

import android.app.Application;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-16-2016
 */
public class MyApplication extends Application {

	private static MyApplication instance = null;

	@Override
	public void onCreate() {
		super.onCreate();
		this.instance = this;
	}

	public static MyApplication getInstance() {
		return instance;
	}
}
