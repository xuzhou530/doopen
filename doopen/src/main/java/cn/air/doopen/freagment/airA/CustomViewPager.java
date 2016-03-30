package cn.air.doopen.freagment.airA;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * 不可滑动vewpager
 */
public class CustomViewPager extends ViewPager {
	private boolean isCanScroll = false;
	public CustomViewPager(Context context) {
		super(context);
	}
	public CustomViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	public void setScanScroll(boolean isCanScroll) {
		this.isCanScroll = isCanScroll;
	}
	@Override
	public boolean onInterceptTouchEvent(MotionEvent arg0) {
		if(isCanScroll){
			return super.onInterceptTouchEvent(arg0);
		}else{
			//false  不能左右滑动
			return false;
		}
	}
}