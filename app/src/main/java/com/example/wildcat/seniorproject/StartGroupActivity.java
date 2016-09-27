package com.example.wildcat.seniorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StartGroupActivity extends AppCompatActivity {

    private Button startGroupPageToMainPageBtn;
    private EditText startGroupGroupNameEditText;
    private boolean firstTimeClick = true;
    private ListView startGroupUserNameListView;
    private ArrayAdapter<String> listAdapter;
    private Button startGroupPageCreateGroupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_group);

        startGroupPageToMainPageBtn = (Button) findViewById(R.id.startGroupPageToMainPageBtn);
        startGroupPageToMainPageBtn.setText("Back");
        startGroupPageToMainPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartGroupActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        startGroupGroupNameEditText = (EditText) findViewById(R.id.startGroupGroupNameEditText);
        startGroupGroupNameEditText.setText("Enter Group Name Here");


        startGroupGroupNameEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus && firstTimeClick){
                    startGroupGroupNameEditText.setText("");
                    firstTimeClick = false;
                }
            }
        });

        startGroupPageCreateGroupBtn = (Button) findViewById(R.id.startGroupPageCreateGroupBtn);
        startGroupPageCreateGroupBtn.setText("Create Group");
        startGroupPageCreateGroupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create Group in database
            }
        });

        startGroupUserNameListView = (ListView) findViewById(R.id.startGroupUserNameListView);
        String[] userNames = new String[] {"Username 1", "Username 2"};
        List<String> userList = new ArrayList<String>(Arrays.asList(userNames));
        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,userList);
        startGroupUserNameListView.setAdapter( listAdapter );




    }






}

