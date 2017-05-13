package com.tokopedia.chat2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import butterknife.ButterKnife;

/**
 * Created by hangnadi on 5/12/17.
 */

public abstract class BaseView extends FrameLayout {

    public BaseView(@NonNull Context context) {
        super(context);
        initView(context);
        parseAttribute(context, null);
    }

    public BaseView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
        parseAttribute(context, attrs);
    }

    protected void initView(Context context) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(getLayoutView(), this, true);
        ButterKnife.bind(this);
    }

    protected abstract int getLayoutView();

    protected void parseAttribute(Context context, AttributeSet attrs) {

    }

}
