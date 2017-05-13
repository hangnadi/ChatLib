package com.tokopedia.chat2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by hangnadi on 5/12/17.
 */

public abstract class ChatViewHolder<T extends ChatData> extends RecyclerView.ViewHolder {

    public ChatViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    protected Context getContext() {
        return itemView.getContext();
    }

    public abstract void bind(T element);
}
