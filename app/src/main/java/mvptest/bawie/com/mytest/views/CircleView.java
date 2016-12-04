package mvptest.bawie.com.mytest.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ZhangFanfan on 2016/12/4.
 */

public class CircleView extends View {
    private Paint mPaint;

    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setTextSize(30);
        mPaint.setColor(Color.GREEN);
        canvas.drawCircle(400,400,300,mPaint);
        mPaint.setColor(Color.BLACK);
        canvas.drawText("下一步",400,400,mPaint);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
switch(event.getAction()){
    case MotionEvent.ACTION_DOWN:

        break;
}
        return super.onTouchEvent(event);
    }
}
