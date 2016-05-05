package com.example.lenw.myapplication.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by LenW on 2016/5/3.
 */
public class DrawView extends View {
    public float currrentX=40;
    public float currentY=50;
    //定义并创建画笔
    Paint p=new Paint();
    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //当该组件将要绘制它的内容时回调该方法进行绘制
        super.onDraw(canvas);
//        设置画笔的颜色
        p.setColor(Color.RED);
//        绘制一个小圆
        canvas.drawCircle(currrentX,currentY,15,p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //当发生触摸屏事件时
        currrentX=event.getX();
        currentY=event.getY();
        //通知当前组件重绘自己
        invalidate();
        //返回true表明处理方法已经处理该事件
        return true;
    }
}
