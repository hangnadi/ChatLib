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

public class RightChatViewHolder extends BaseRightChatViewHolder<RightChatData> {

    @BindView(R2.id.text_message)
    TextView tMessage;
    @BindView(R2.id.text_date)
    TextView tDate;
    @BindView(R2.id.text_time)
    TextView tTime;

    public RightChatViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bind(RightChatData element) {
        setRightBubbleColor(element.getBubbleColor());
        setRightMessageColor(element.getMessageColor());
        tMessage.setText(element.getMessage());
        tDate.setText(element.getDate());
        tTime.setText(element.getTime());
    }

    public void setRightMessageColor(int rightMessageColor) {
        tMessage.setTextColor(ContextCompat.getColor(getContext(), rightMessageColor));
    }

    public void setRightBubbleColor(int rightBubbleColor) {
        tMessage.setBackground(getBackgroundShape(rightBubbleColor));
    }

    private Drawable getBackgroundShape(int resourceId) {
        GradientDrawable shape = new GradientDrawable();
        shape.setShape(GradientDrawable.RECTANGLE);
        shape.setColor(ContextCompat.getColor(getContext(), resourceId));
        shape.setCornerRadii(new float[] {16, 16, 0, 0, 16, 16 , 16, 16});
        return shape;
    }
}
