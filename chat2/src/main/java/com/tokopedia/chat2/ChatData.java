package com.tokopedia.chat2;

/**
 * Created by hangnadi on 5/12/17.
 */

public class ChatData {

    private int type;
    private String message;
    private String date;
    private String time;

    public ChatData(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
