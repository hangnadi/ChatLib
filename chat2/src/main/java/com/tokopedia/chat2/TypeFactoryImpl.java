package com.tokopedia.chat2;

import android.view.View;

/**
 * Created by hangnadi on 5/12/17.
 */

public class TypeFactoryImpl implements TypeFactory {

    @Override
    public int getLayoutLeftChat() {
        return R.layout.layout_their_chat_viewholder;
    }

    @Override
    public int getLayoutRightChat() {
        return R.layout.layout_my_chat_viewholder;
    }

    @Override
    public int getLayoutCenterChat() {
        return R.layout.layout_moderator_viewholder;
    }

    @Override
    public BaseLeftChatViewHolder createLeftViewHolder(View view) {
        return new LeftChatViewHolder(view);
    }

    @Override
    public BaseRightChatViewHolder createRightViewHolder(View view) {
        return new RightChatViewHolder(view);
    }

    @Override
    public BaseCenterChatViewHolder createCenterViewHolder(View view) {
        return new CenterChatViewHolder(view);
    }

}
