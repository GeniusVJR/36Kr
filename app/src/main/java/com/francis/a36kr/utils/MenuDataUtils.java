package com.francis.a36kr.utils;

import com.francis.a36kr.R;
import com.francis.a36kr.model.LeftItemMenu;
import java.util.ArrayList;
import java.util.List;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-16-2016
 *
 * 左侧菜单 Item 数据构造
 */
public class MenuDataUtils {

	public static List<LeftItemMenu> getItemMenus(){
		List<LeftItemMenu> menus = new ArrayList<>();
		menus.add(new LeftItemMenu(R.drawable.icon_zhanghaoxinxi,"账号信息"));
		menus.add(new LeftItemMenu(R.drawable.icon_wodeguanzhu,"我的关注"));
		menus.add(new LeftItemMenu(R.drawable.icon_shoucang,"我的收藏"));
		menus.add(new LeftItemMenu(R.drawable.icon_yijianfankui,"意见反馈"));
		menus.add(new LeftItemMenu(R.drawable.icon_shezhi,"设置"));
		return menus;
	}
}
