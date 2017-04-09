package com.gmbdesign.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by ggamboa on 9/4/17.
 */

public class GatosTextView extends android.support.v7.widget.AppCompatTextView {


    public GatosTextView(Context context) {
        super(context);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "tender_kittens.ttf");
        this.setTypeface(typeface);
    }

    public GatosTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "tender_kittens.ttf");
        this.setTypeface(typeface);
    }

    public GatosTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "tender_kittens.ttf");
        this.setTypeface(typeface);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
