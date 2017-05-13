package com.tokopedia.chat2;

/**
 * Created by hangnadi on 5/12/17.
 */

public class LeftChatData extends BaseLeftChatData {

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

    public static LeftChatData Builder() {
        return new LeftChatData();
    }

    public LeftChatData setLeftMessage(String message) {
        setMessage(message);
        return this;
    }

    public LeftChatData setLeftDate(String date) {
        setDate(date);
        return this;
    }

    public LeftChatData setLeftTime(String time) {
        setTime(time);
        return this;
    }

    public LeftChatData build() {
        return this;
    }

}
