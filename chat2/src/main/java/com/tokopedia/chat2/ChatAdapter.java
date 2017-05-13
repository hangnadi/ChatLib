package com.tokopedia.chat2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hangnadi on 5/12/17.
 */

public class ChatAdapter extends RecyclerView.Adapter<ChatViewHolder> {

    private TypeFactory typeFactory;
    private List<ChatData> elements;

    private int leftBubbleColor;
    private int rightBubbleColor;
    private int centerBubbleColor;
    private int leftMessageColor;
    private int rightMessageColor;
    private int centerMessageColor;

    public ChatAdapter(TypeFactory typeFactory) {
        this.elements = new ArrayList<>();
        this.typeFactory = typeFactory;
    }

    @SuppressLint("DefaultLocale")
    @Override
    public ChatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        switch (viewType) {
            case ChatType.LEFT_CHAT:
                return typeFactory.createLeftViewHolder(
                        LayoutInflater.from(context)
                                .inflate(typeFactory.getLayoutLeftChat(), parent, false)
                );
            case ChatType.RIGHT_CHAT:
                return typeFactory.createRightViewHolder(
                        LayoutInflater.from(context)
                                .inflate(typeFactory.getLayoutRightChat(), parent, false)
                );
            case ChatType.CENTER_CHAT:
                return typeFactory.createCenterViewHolder(
                        LayoutInflater.from(context)
                                .inflate(typeFactory.getLayoutCenterChat(), parent, false)
                );
            default:
                throw new RuntimeException(String.format("LayoutType: %d", viewType));
        }
    }

    @Override
    public int getItemViewType(int position) {
        return elements.get(position).getType();
    }

    @Override
    @SuppressWarnings("unchecked")
    public void onBindViewHolder(ChatViewHolder holder, int position) {
        holder.bind(elements.get(position));
    }

    @Override
    public int getItemCount() {
        return elements.size();
    }

    public void addNextData(ChatData data) {
        this.elements.add(data);
        notifyDataSetChanged();
    }

    public void addPreviousData(ChatData data) {
        this.elements.add(0, data);
        notifyDataSetChanged();
    }
}
