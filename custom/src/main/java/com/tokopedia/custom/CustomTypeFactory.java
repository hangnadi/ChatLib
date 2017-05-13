package com.tokopedia.custom;

import android.view.View;

import com.tokopedia.chat2.BaseCenterChatViewHolder;
import com.tokopedia.chat2.BaseLeftChatViewHolder;
import com.tokopedia.chat2.BaseRightChatViewHolder;
import com.tokopedia.chat2.TypeFactory;

/**
 * Created by hangnadi on 5/12/17.
 */

public class CustomTypeFactory implements TypeFactory {

    @Override
    public int getLayoutLeftChat() {
        return R.layout.layout_left;
    }

    @Override
    public int getLayoutRightChat() {
        return R.layout.layout_right;
    }

    @Override
    public int getLayoutCenterChat() {
        return R.layout.layout_center;
    }

    @Override
    public BaseLeftChatViewHolder createLeftViewHolder(View view) {
        return new CustomLeft(view);
    }

    @Override
    public BaseRightChatViewHolder createRightViewHolder(View view) {
        return new CustomRight(view);
    }

    @Override
    public BaseCenterChatViewHolder createCenterViewHolder(View view) {
        return new CustomCenter(view);
    }
}
