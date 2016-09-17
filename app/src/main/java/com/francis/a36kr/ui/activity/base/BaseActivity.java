package com.francis.a36kr.ui.activity.base;

import android.content.Intent;
import android.icu.text.DateFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.francis.a36kr.R;
import java.lang.reflect.Field;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-07-2016
 */
public class BaseActivity extends FragmentActivity{

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		//党系统版本为 4.4 或者 4.4 以上时可以使用沉浸式状态栏
		if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
			//透明状态栏
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			//透明导航栏
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
		}
	}


	//打开 Activity
	protected void openActivity(Class<?> pClass){
		Intent intent = new Intent(this, pClass);
		startActivity(intent);
	}

	/**
	 * 设置沉浸式状态栏
	 */
	protected void setStatusBar(){
		if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
			final ViewGroup linear_bar = (ViewGroup) findViewById(R.id.bar_layout);
			final int statusHeight = getStatusBarHeight();
			linear_bar.post(new Runnable() {

				@Override
				public void run() {

					int titleHeight = linear_bar.getHeight();
					android.widget.LinearLayout.LayoutParams params = (android.widget.LinearLayout.LayoutParams) linear_bar.getLayoutParams();
					params.height = statusHeight + titleHeight;
					linear_bar.setLayoutParams(params);
				}
			});
		}
	}

	/**
	 * 获取状态栏的高度
	 */
	protected int getStatusBarHeight(){
		try {
			Class<?> c = Class.forName("com.android.internal.R$dimen");
			Object obj = c.newInstance();
			Field field = c.getField("status_bar_height");
			int x = Integer.parseInt(field.get(obj).toString());
			return getResources().getDimensionPixelSize(x);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}





}
