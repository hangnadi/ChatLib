package com.tokopedia.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tokopedia.chat2.CenterChatData;
import com.tokopedia.chat2.ChatView;
import com.tokopedia.chat2.LeftChatData;
import com.tokopedia.chat2.RightChatData;

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

        chatView.addLeftMessage(
                LeftChatData.Builder()
                        .setLeftMessage("something happen")
                        .setLeftDate("12/14/2017")
                        .setLeftTime("17:01")
                        .build()
        );
        chatView.addRightMessage(
                RightChatData.Builder()
                        .setRightMessage("give me something bro")
                        .setRightDate("12/14/2017")
                        .setRightTime("17:04")
                        .build()
        );

        chatView.addCenterMessage(
                CenterChatData.Builder()
                        .setCenterMessage("give me something bro")
                        .setCenterDate("12/14/2017")
                        .setCenterTime("17:04")
                        .build()
        );
    }

}
