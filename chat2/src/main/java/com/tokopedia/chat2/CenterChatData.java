package com.tokopedia.chat2;

/**
 * Created by hangnadi on 5/12/17.
 */

public class CenterChatData extends BaseCenterChatData {

    private int messageColor;
    private int BubbleColor;

    public int getMessageColor() {
        return messageColor;
    }

    public void setMessageColor(int messageColor) {
        this.messageColor = messageColor;
    }

    public int getBubbleColor() {
        return BubbleColor;
    }

    public void setBubbleColor(int bubbleColor) {
        BubbleColor = bubbleColor;
    }

    public static CenterChatData Builder() {
        return new CenterChatData();
    }

    public CenterChatData setCenterMessage(String message) {
        setMessage(message);
        return this;
    }

    public CenterChatData setCenterDate(String date) {
        setDate(date);
        return this;
    }

    public CenterChatData setCenterTime(String time) {
        setTime(time);
        return this;
    }

    public CenterChatData build() {
        return this;
    }
}
