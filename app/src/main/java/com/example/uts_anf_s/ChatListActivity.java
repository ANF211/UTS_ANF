package com.example.uts_anf_s;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ChatListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);

        ListView listView = findViewById(R.id.listChat);
        String[] chats = {"茜: ようこそ！", "レン: わがアプリに。", "白花: 楽しんでね～"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, chats);
        listView.setAdapter(adapter);
    }
}
