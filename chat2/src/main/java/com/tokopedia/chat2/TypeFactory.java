package com.tokopedia.chat2;

import android.support.annotation.LayoutRes;
import android.view.View;

/**
 * Created by hangnadi on 5/12/17.
 */

public interface TypeFactory {

    @LayoutRes
    int getLayoutLeftChat();

    @LayoutRes
    int getLayoutRightChat();

    @LayoutRes
    int getLayoutCenterChat();

    BaseLeftChatViewHolder createLeftViewHolder(View view);

    BaseRightChatViewHolder createRightViewHolder(View view);

    BaseCenterChatViewHolder createCenterViewHolder(View view);
}
