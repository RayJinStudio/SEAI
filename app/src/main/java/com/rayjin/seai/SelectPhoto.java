package com.rayjin.seai;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class SelectPhoto extends PopupWindow
{
    View view;
    ImageView take,album;

    public SelectPhoto(Context mContext, View.OnClickListener itemsOnClick)
    {
        this.view = LayoutInflater.from(mContext).inflate(R.layout.selectphoto, null);
        take = view.findViewById(R.id.take);
        take.setOnClickListener(itemsOnClick);
        album = view.findViewById(R.id.album);
        album.setOnClickListener(itemsOnClick);
        this.setOutsideTouchable(true);

        this.view.setOnTouchListener(new View.OnTouchListener()
        {
            public boolean onTouch(View v, MotionEvent event)
            {
                int height = view.findViewById(R.id.menu).getTop();
                //Log.e("info","h: "+height);
                int y = (int) event.getY();
                //Log.e("info","y: "+y);
                if (event.getAction() == MotionEvent.ACTION_UP)
                {
                    if (y < height)
                    {
                        //ColorDrawable dw = new ColorDrawable(0x00ffffff);
                        //SelectPhoto.this.setBackgroundDrawable(dw);
                        dismiss();
                    }
                }
                return true;
            }
        });

        this.setContentView(this.view);
        this.setHeight(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setWidth(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setFocusable(true);
        ColorDrawable dw = new ColorDrawable(0xb0000000);
        this.setBackgroundDrawable(dw);
        this.setAnimationStyle(R.style.take_photo_anim);
    }
}