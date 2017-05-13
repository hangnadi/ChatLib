package com.tokopedia.custom;

import com.tokopedia.chat2.BaseLeftChatData;

import java.util.List;

/**
 * Created by hangnadi on 5/12/17.
 */

public class LeftData extends BaseLeftChatData {

    private String name;
    private List<Attachment> list;

    public LeftData() {
        super();
    }

    public List<Attachment> getList() {
        return list;
    }

    public void setList(List<Attachment> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
