package com.prabhat1707.verticalpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class DoubleViewPager extends ViewPager {
    private GestureDetector xScrollDetector;

    public DoubleViewPager(Context context) {
        super(context);
        init();
    }

    private void init() {
//        setPageTransformer(true, new VerticalPageTransformer());
//        // The easiest way to get rid of the overscroll drawing that happens on the left and right
//        setOverScrollMode(OVER_SCROLL_NEVER);
    }

    public DoubleViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        xScrollDetector = new GestureDetector(getContext(), new DoubleViewPager.XScrollDetector());
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

        return super.onInterceptTouchEvent(swapXY(ev));
    }

    private MotionEvent swapXY(MotionEvent ev) {
        float width = getWidth();
        float height = getHeight();

        float newX = (ev.getY() / height) * width;
        float newY = (ev.getX() / width) * height;

        ev.setLocation(newX, newY);

        return ev;
    }
}
