package com.example.workinclass10012023;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        //paint.setColor(Color.GREEN); // pen colour
        paint.setColor(Color.parseColor("#17B978"));
        paint2.setColor(Color.BLACK);
        paint.setAntiAlias(true); // сглаживание
        paint2.setAntiAlias(true);
        paint.setStrokeWidth(10); // толщина маркера
        paint2.setStrokeWidth(10);
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE); // стиль заливки
        /*
        int y = getHeight()/2;
        int x = getWidth()/2;
        canvas.drawCircle(x, y, 150, paint);
        canvas.drawLine(100, 200, 500,200, paint);
        paint.setTextSize(100);
        canvas.drawText("bruh", 100, 700, paint);
         */
        Rect rect = new Rect(1100, 1500, 0, 2000); // земля
        canvas.drawRect(rect, paint);
        paint.setColor(Color.GRAY);
        Rect rect3 = new Rect(900, 1900, 850, 1750); // ножка лавки
        canvas.drawRect(rect3, paint);
        canvas.drawRect(rect3, paint2);
        Rect rect4 = new Rect(750, 1900, 700, 1750); // ножка лавки
        canvas.drawRect(rect4, paint);
        canvas.drawRect(rect4, paint2);
        Rect rect2 = new Rect(1000, 1800, 600, 1750); // поверхность лавки
        canvas.drawRect(rect2, paint);
        canvas.drawRect(rect2, paint2);
        paint.setColor(Color.parseColor("#685454"));
        Rect rect5 = new Rect(50, 1200, 500, 1700); // дом
        canvas.drawRect(rect5, paint);
        canvas.drawRect(rect5, paint2);
        Rect rect6 = new Rect(865, 1600, 825, 1700); // ствол дерева
        canvas.drawRect(rect6, paint);
        canvas.drawRect(rect6, paint2);
        paint.setColor(Color.GREEN);
        RectF rect7 = new RectF(700, 1000, 1000, 1600); // листва
        canvas.drawOval(rect7, paint);
        canvas.drawOval(rect7, paint2);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#685454"));
        Path path = new Path();
        path.moveTo(275, 800); // верхний угол
        path.lineTo(500, 1200); // правый угол
        path.lineTo(50, 1200); // левый угол
        path.close();
        canvas.drawPath(path, paint);
        canvas.drawPath(path, paint2);
        int y = 1050;
        int x = 275;
        canvas.drawCircle(x, y, 100, paint2);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(0, 0, 200, paint);
        int count = 0;
        int x2 = 100;
        int y2 = 500;
        while ( y2 != 0){
            canvas.drawLine(0, 0, x2, y2, paint);
            y2-=20;
            x2 +=15;
        }
        y2 = 1300;
        x2 = 299;
        paint.setColor(Color.parseColor("#F7D3BA"));
        while(count!=10) {
            canvas.drawLine(308, y2, 475, y2, paint); // horizontal
            if(count<5){
                canvas.drawLine(x2, 1300, x2, 1675, paint); // vertical
            }
            y2 += 38;
            x2 += 38;
            count++;
        }
        Rect rect9 = new Rect(300, 1300, 470, 1680);
        canvas.drawRect(rect9, paint2);
        paint.setColor(Color.parseColor("#2B2E4A"));
        count = 0;
        y2 = 1300;
        x2 = 85;
        while(count!=6) {
            canvas.drawLine(85, y2, 252, y2, paint); // horizontal
            if(count<5){
                canvas.drawLine(x2, 1300, x2, 1500, paint); // vertical
            }
            y2 += 38;
            x2 += 38;
            count++;
        }
        Rect rect8 = new Rect(80, 1300, 250, 1500);
        canvas.drawRect(rect8, paint2);
    }
}
