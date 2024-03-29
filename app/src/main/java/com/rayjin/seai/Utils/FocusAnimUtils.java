package com.rayjin.seai.Utils;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

public class FocusAnimUtils {

    public static void focusAnim(View view){
        float toValue = 1.05f;
        ObjectAnimator animatorX = ObjectAnimator.ofFloat(view, "scaleX", toValue);
        ObjectAnimator animatorY = ObjectAnimator.ofFloat(view, "scaleY", toValue);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300);
        animatorSet.playTogether(animatorX, animatorY);
        animatorSet.start();

    }

    public static void unFocusAnim(View view){
        float toValue = 1.0f;
        ObjectAnimator animatorX = ObjectAnimator.ofFloat(view, "scaleX", toValue);
        ObjectAnimator animatorY = ObjectAnimator.ofFloat(view, "scaleY", toValue);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300);
        animatorSet.playTogether(animatorX, animatorY);
        animatorSet.start();
    }
    /**
     * 为item添加动画
     * @param view 需要添加动画的item
     * @param scale 是否得到焦点
     * @param scaleF 缩放比例
     */
    public static void animItem(View view,boolean scale ,float scaleF){
        float toValue = 1.0f;
        if(scale) {  //得到焦点
            toValue = scaleF;
            ObjectAnimator animatorX = ObjectAnimator.ofFloat(view, "scaleX", toValue);
            ObjectAnimator animatorY = ObjectAnimator.ofFloat(view, "scaleY", toValue);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300);
            animatorSet.playTogether(animatorX, animatorY);
            animatorSet.start();
        }else{   //失去焦点
            ObjectAnimator animatorX = ObjectAnimator.ofFloat(view, "scaleX", toValue);
            ObjectAnimator animatorY = ObjectAnimator.ofFloat(view, "scaleY", toValue);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300);
            animatorSet.playTogether(animatorX, animatorY);
            animatorSet.start();
        }
    }

    /**
     * 为item添加动画
     * @param view 需要添加动画的item
     * @param scale 是否得到焦点
     * @param scaleF 缩放比例
     */
    public static void animItem(View view,boolean scale ,float scaleF, long duration){
        float toValue = 1.0f;
        if(scale) {  //得到焦点
            toValue = scaleF;
            ObjectAnimator animatorX = ObjectAnimator.ofFloat(view, "scaleX", toValue);
            ObjectAnimator animatorY = ObjectAnimator.ofFloat(view, "scaleY", toValue);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(duration);
            animatorSet.playTogether(animatorX, animatorY);
            animatorSet.start();
        }else{   //失去焦点
            ObjectAnimator animatorX = ObjectAnimator.ofFloat(view, "scaleX", toValue);
            ObjectAnimator animatorY = ObjectAnimator.ofFloat(view, "scaleY", toValue);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(duration);
            animatorSet.playTogether(animatorX, animatorY);
            animatorSet.start();
        }
    }

}