package com.tokopedia.custom;

import android.view.View;
import android.widget.TextView;

import com.tokopedia.chat2.BaseRightChatViewHolder;

import butterknife.BindView;

/**
 * Created by hangnadi on 5/12/17.
 */

public class CustomRight extends BaseRightChatViewHolder<RightData> {

    @BindView(R.id.text_date)
    TextView tDate;
    @BindView(R.id.text_message)
    TextView tMessage;
    @BindView(R.id.text_time)
    TextView tTime;

    public CustomRight(View view) {
        super(view);
    }

    @Override
    public void bind(RightData element) {
        tDate.setText(element.getDate());
        tMessage.setText(element.getMessage());
        tTime.setText(element.getTime());
    }
}
