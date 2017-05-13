package com.tokopedia.chat2;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hangnadi on 5/12/17.
 */

public class CenterChatViewHolder extends BaseCenterChatViewHolder<CenterChatData> {

    @BindView(R2.id.text_message)
    TextView tMessage;
    @BindView(R2.id.text_date)
    TextView tDate;
    @BindView(R2.id.text_time)
    TextView tTime;

    public CenterChatViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bind(CenterChatData element) {
        setCenterBubbleColor(element.getBubbleColor());
        setCenterMessageColor(element.getMessageColor());
        tMessage.setText(element.getMessage());
        tDate.setText(element.getDate());
        tTime.setText(element.getTime());
    }

    public void setCenterMessageColor(int centerMessageColor) {
        tMessage.setTextColor(ContextCompat.getColor(getContext(), centerMessageColor));
    }

    public void setCenterBubbleColor(int centerBubbleColor) {
        tMessage.setBackground(getBackgroundShape(centerBubbleColor));
    }

    private Drawable getBackgroundShape(int resourceId) {
        GradientDrawable shape = new GradientDrawable();
        shape.setShape(GradientDrawable.RECTANGLE);
        shape.setColor(ContextCompat.getColor(getContext(), resourceId));
        shape.setCornerRadii(new float[] {16, 16, 16, 16, 16, 16 , 16, 16});
        return shape;
    }
}
