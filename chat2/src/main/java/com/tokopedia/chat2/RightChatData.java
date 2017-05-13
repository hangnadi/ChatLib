package com.tokopedia.chat2;

/**
 * Created by hangnadi on 5/12/17.
 */

public class RightChatData extends BaseRightChatData {

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

    public static RightChatData Builder() {
        return new RightChatData();
    }

    public RightChatData setRightMessage(String message) {
        setMessage(message);
        return this;
    }

    public RightChatData setRightDate(String date) {
        setDate(date);
        return this;
    }

    public RightChatData setRightTime(String time) {
        setTime(time);
        return this;
    }

    public RightChatData build() {
        return this;
    }
}
