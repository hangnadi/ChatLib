package com.tokopedia.custom;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.tokopedia.chat2.ChatView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.customview)
    ChatView chatView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        chatView.createCustomView(new CustomTypeFactory());

        LeftData leftData = new LeftData();
        leftData.setMessage("be honest with me, would you?");
        leftData.setName("My Znyc");
        leftData.setTime("19.59");
        leftData.setDate("Today");

        RightData rightData = new RightData();
        rightData.setMessage("what is it?");
        rightData.setTime("20.00");
        rightData.setDate("Today");

        CenterData centerData = new CenterData();
        centerData.setMessage("Please get outta here!!");

        chatView.addLeftMessage(leftData);
        chatView.addRightMessage(rightData);
        chatView.addCenterMessage(centerData);
    }
}
