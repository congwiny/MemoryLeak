package com.congwiny.memoryleak;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;

/**
 * Created by niuchong on 2018/1/4.
 */

public class DrawableUtil {
    public static Drawable colorDrawable(Resources res,
                                         @DrawableRes int drawableResId,
                                         @ColorRes int colorResId,
                                         PorterDuff.Mode mode) {
        Drawable drawable = res.getDrawable(drawableResId);
        int color = res.getColor(colorResId);
        drawable.setColorFilter(color, mode);
        return drawable;
    }
}
