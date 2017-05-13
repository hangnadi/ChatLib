package com.tokopedia.custom;

import android.view.View;
import android.widget.TextView;

import com.tokopedia.chat2.BaseCenterChatViewHolder;

import butterknife.BindView;


/**
 * Created by hangnadi on 5/12/17.
 */

public class CustomCenter extends BaseCenterChatViewHolder<CenterData> {

    @BindView(R.id.text_message)
    TextView tMessage;

    public CustomCenter(View view) {
        super(view);
    }

    @Override
    public void bind(CenterData element) {
        tMessage.setText(element.getMessage());
    }

}
