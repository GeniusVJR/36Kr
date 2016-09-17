package com.francis.a36kr.model;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-16-2016
 */
public class LeftItemMenu {

	private int leftIcon;
	private String title;

	public LeftItemMenu(){

	}

	public LeftItemMenu(int leftIcon, String title) {
		this.leftIcon = leftIcon;
		this.title = title;
	}

	public int getLeftIcon() {
		return leftIcon;
	}

	public void setLeftIcon(int leftIcon) {
		this.leftIcon = leftIcon;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "LeftItemMenu{" +
				"leftIcon=" + leftIcon +
				", title='" + title + '\'' +
				'}';
	}
}
