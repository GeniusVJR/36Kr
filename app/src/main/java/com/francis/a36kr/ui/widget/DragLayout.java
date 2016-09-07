package com.francis.a36kr.ui.widget;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-07-2016
 *
 *
 * 使用ViewDragHelper实现侧滑效果
 */
public class DragLayout extends FrameLayout{

	private boolean isShowShadow = true;
	//手势处理类
	private GestureDetectorCompat gestureDetector;
	//视图拖拽移动帮助类
	private ViewDragHelper dragHelper;
	//滑动监听器
	private DragListener dragListener;

	


	public DragLayout(Context context) {
		super(context);
	}

	public DragLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public DragLayout(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	/**
	 * 滑动相关毁掉接口
	 */
	public interface DragListener {
		//界面打开
		public void onOpen();
		//界面关闭
		public void onClose();
		//界面滑动过程中
		 public void onDrag(float percent);
	}


}
