package com.francis.a36kr.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import com.francis.a36kr.R;
import com.francis.a36kr.common.DefineView;
import com.francis.a36kr.model.LeftItemMenu;
import com.francis.a36kr.ui.activity.base.BaseActivity;
import com.francis.a36kr.ui.widget.DragLayout;
import com.nineoldandroids.view.ViewHelper;

public class MainActivity extends BaseActivity implements DefineView{

	private DragLayout drag_layout;
	private ImageView top_bar_icon;
	private ListView lv_left_main;

	public DragLayout getDrag_layout(){
		return drag_layout;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setStatusBar();
		initView();
		initValidata();
		initListener();
		bindData();
	}

	@Override
	public void initView() {
		drag_layout = (DragLayout) findViewById(R.id.drag_layout);
		top_bar_icon = (ImageView) findViewById(R.id.top_bar_icon);
		lv_left_main=(ListView)findViewById(R.id.lv_left_main);
	}

	@Override
	public void initValidata() {
		lv_left_main.setAdapter(new LeftItemAdapter());
	}

	@Override
	public void initListener() {
		drag_layout.setDragListener(new CustomDragListener());
		top_bar_icon.setOnClickListener(new CustomOnClickListener());
	}

	@Override
	public void bindData() {

	}


	class CustomDragListener implements DragLayout.DragListener{

		/**
		 * 界面打开
		 */
		@Override
		public void onOpen() {

		}

		/**
		 * 界面关闭
		 */
		@Override
		public void onClose() {

		}

		/**
		 * 界面进行滑动
		 * @param percent
		 */
		@Override
		public void onDrag(float percent) {
			ViewHelper.setAlpha(top_bar_icon, 1 - percent);
		}
	}

	class CustomOnClickListener implements View.OnClickListener{

		@Override
		public void onClick(View view) {
			drag_layout.open();
		}
	}
}
