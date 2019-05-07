package com.example.myapplication;

import android.content.Context;
import android.graphics.*;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyTextViewOne extends AppCompatTextView {
    private LinearGradient mLinearGradient;
    private Matrix mGradientMatrix;
    private Paint mPaint;
    private int mViewWidth = 0;
    private float mScale = 0.1f;

    private boolean mAnimating = true;

    public MyTextViewOne(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (mViewWidth == 0) {
            mViewWidth = getMeasuredWidth();
            if (mViewWidth > 0) {
                mPaint = getPaint();
                mLinearGradient = new LinearGradient(0, 0, mViewWidth, 0,
                        new int[] { 0x33ffffff, 0xffffffff, 0x33ffffff },
                        new float[] { 0.0f, 0.5f, 1.0f }, Shader.TileMode.CLAMP);
                mPaint.setShader(mLinearGradient);
                mGradientMatrix = new Matrix();
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mAnimating && mGradientMatrix != null) {
            mScale += 0.1f;
            if (mScale > 1.2f) {
                mScale = 0.1f;
            }
            mGradientMatrix.setScale(mScale, mScale, mViewWidth / 2, 0);
            mLinearGradient.setLocalMatrix(mGradientMatrix);
            postInvalidateDelayed(100);
        }
    }
}
