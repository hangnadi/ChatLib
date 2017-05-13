package com.tokopedia.custom;

import android.view.View;
import android.widget.TextView;

import com.tokopedia.chat2.BaseLeftChatViewHolder;

import butterknife.BindView;

/**
 * Created by hangnadi on 5/12/17.
 */

public class CustomLeft extends BaseLeftChatViewHolder<LeftData> {

    @BindView(R.id.text_date)
    TextView tDate;
    @BindView(R.id.text_name)
    TextView tName;
    @BindView(R.id.text_message)
    TextView tMessage;
    @BindView(R.id.text_time)
    TextView tTime;

    public CustomLeft(View itemView) {
        super(itemView);
    }

    @Override
    public void bind(LeftData element) {
        tDate.setText(element.getDate());
        tMessage.setText(element.getMessage());
        tTime.setText(element.getTime());
        tName.setText(element.getName());
    }

}
