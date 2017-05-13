package com.tokopedia.chat2;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

import butterknife.BindView;

/**
 * Created by hangnadi on 5/12/17.
 */

public class ChatView extends BaseView {

    @BindView(R2.id.my_recycler_view)
    RecyclerView mRecyclerView;

    private ChatAdapter adapter;
    private int leftBubbleColor;
    private int rightBubbleColor;
    private int centerBubbleColor;
    private int leftMessageColor;
    private int rightMessageColor;
    private int centerMessageColor;
    private boolean custom;

    public ChatView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        createBasicView(new TypeFactoryImpl());
    }

    protected int getLayoutView() {
        return R.layout.layout_customview_chatxy;
    }

    protected void parseAttribute(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.ChatXYZ, 0, 0);
        try {
            setBackgroundResource(typedArray.getResourceId(R.styleable.ChatXYZ_backgroundSrc, R.color.md_blue_grey_300));
            leftBubbleColor = typedArray.getResourceId(R.styleable.ChatXYZ_leftBubbleColor, R.color.md_green_300);
            rightBubbleColor = typedArray.getResourceId(R.styleable.ChatXYZ_rightBubbleColor, R.color.md_white_1000);
            centerBubbleColor = typedArray.getResourceId(R.styleable.ChatXYZ_centerBubbleColor, R.color.md_yellow_300);
            leftMessageColor = typedArray.getResourceId(R.styleable.ChatXYZ_leftMessageColor, R.color.md_white_1000);
            rightMessageColor = typedArray.getResourceId(R.styleable.ChatXYZ_rightMessageColor, R.color.md_black_1000);
            centerMessageColor = typedArray.getResourceId(R.styleable.ChatXYZ_centerMessageColor, R.color.md_black_1000);
        } finally {
            typedArray.recycle();
        }
    }

    public void addLeftMessage(BaseLeftChatData data) {
        ChatAdapter adapter = (ChatAdapter) mRecyclerView.getAdapter();
        if (!isCustom()) {
            ((LeftChatData) data).setBubbleColor(leftBubbleColor);
            ((LeftChatData) data).setMessageColor(leftMessageColor);
        }
        adapter.addNextData(data);
    }

    public void addRightMessage(BaseRightChatData data) {
        ChatAdapter adapter = (ChatAdapter) mRecyclerView.getAdapter();
        if (!isCustom()) {
            ((RightChatData) data).setBubbleColor(rightBubbleColor);
            ((RightChatData) data).setMessageColor(rightMessageColor);
        }
        adapter.addNextData(data);
    }

    public void addCenterMessage(BaseCenterChatData data) {
        ChatAdapter adapter = (ChatAdapter) mRecyclerView.getAdapter();
        if (!isCustom()) {
            ((CenterChatData) data).setBubbleColor(centerBubbleColor);
            ((CenterChatData) data).setMessageColor(centerMessageColor);
        }
        adapter.addNextData(data);
    }

    private void setCustom(boolean custom) {
        this.custom = custom;
    }

    private boolean isCustom() {
        return custom;
    }

    public void createCustomView(TypeFactory typeFactory) {
        setCustom(true);
        adapter = new ChatAdapter(typeFactory);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapter);
    }

    private void createBasicView(TypeFactory typeFactory) {
        setCustom(false);
        adapter = new ChatAdapter(typeFactory);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapter);
    }
}
