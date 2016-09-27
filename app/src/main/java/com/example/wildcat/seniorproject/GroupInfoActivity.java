package com.example.wildcat.seniorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.acl.Group;

public class GroupInfoActivity extends AppCompatActivity {

    private Button groupInfoPageToMainPageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_info);

        groupInfoPageToMainPageBtn = (Button) findViewById(R.id.optionsPageToMainPageBtn);
        groupInfoPageToMainPageBtn.setText("Back");
        groupInfoPageToMainPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GroupInfoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
