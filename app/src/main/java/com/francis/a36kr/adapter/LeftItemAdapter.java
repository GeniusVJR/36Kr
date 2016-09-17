package com.francis.a36kr.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.francis.a36kr.R;
import com.francis.a36kr.application.MyApplication;
import com.francis.a36kr.model.LeftItemMenu;
import com.francis.a36kr.utils.MenuDataUtils;
import java.util.List;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-16-2016
 *
 * 左边的菜单栏的 Adapter
 */
public class LeftItemAdapter extends BaseAdapter{

	public LayoutInflater mLayoutInflater;
	private List<LeftItemMenu> mItemMenuList;

	public LeftItemAdapter() {
		mLayoutInflater = LayoutInflater.from(MyApplication.getInstance());
		mItemMenuList = MenuDataUtils.getItemMenus();
	}

	@Override
	public int getCount() {
		return mItemMenuList != null ? mItemMenuList.size() : 0;
	}

	@Override
	public Object getItem(int i) {
		return mItemMenuList.get(i);
	}

	@Override
	public long getItemId(int i) {
		return i;
	}

	@Override
	public View getView(int i, View view, ViewGroup viewGroup) {
		Holder holder = null;
		if(view == null){
			view = mLayoutInflater.inflate(R.layout.item_left_menu_layout, null);
			holder.item_left_view_img=(ImageView)view.findViewById(R.id.item_left_view_img);
			holder.item_left_view_title=(TextView)view.findViewById(R.id.item_left_view_title);
			view.setTag(holder);
		}else {
			holder = (Holder) view.getTag();
		}
		holder.item_left_view_img.setImageResource(mItemMenuList.get(i).getLeftIcon());
		holder.item_left_view_title.setText(mItemMenuList.get(i).getTitle());
		return view;
	}


	private static class Holder{
		ImageView item_left_view_img;
		TextView item_left_view_title;
	}
}
