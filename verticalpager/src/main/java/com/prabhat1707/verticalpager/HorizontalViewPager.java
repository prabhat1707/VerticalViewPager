package com.prabhat1707.verticalpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class HorizontalViewPager extends ViewPager {
    private GestureDetector xScrollDetector;

    public HorizontalViewPager(Context context) {
        super(context);
    }

    public HorizontalViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        xScrollDetector = new GestureDetector(getContext(), new XScrollDetector());
    }

    class XScrollDetector extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return Math.abs(distanceX) > Math.abs(distanceY);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (xScrollDetector.onTouchEvent(ev)) {
            super.onInterceptTouchEvent(ev);
            return true;
        }

        return super.onInterceptTouchEvent(ev);
    }
}
