package com.example.wildcat.seniorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Button mainPageToOptionsPageBtn;
    private Button mainPageToStartGroupBtn;
    private ListView mainPageGroupsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPageToStartGroupBtn = (Button) findViewById(R.id.mainPageToStartGroupBtn);
        mainPageToOptionsPageBtn = (Button) findViewById(R.id.mainPageToOptionsPageBtn);



        // Options Button Code
        mainPageToStartGroupBtn = (Button) findViewById(R.id.mainPageToStartGroupBtn);
        mainPageToStartGroupBtn.setText("Start Group");
        mainPageToStartGroupBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //mainPageToStartGroupBtn.setText("WHY ISNT THIS WORKING");
                Intent intent = new Intent(MainActivity.this, StartGroupActivity.class);
                startActivity(intent);
            }
        });

        // Options Button Code
        mainPageToOptionsPageBtn = (Button) findViewById(R.id.mainPageToOptionsPageBtn);
        mainPageToOptionsPageBtn.setText("Options");
        mainPageToOptionsPageBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent1 = new Intent(MainActivity.this, OptionsPageActivity.class);
                startActivity(intent1);
            }
        });



        // Groups List View Code
        mainPageGroupsListView = (ListView) findViewById(R.id.mainPageGroupsListView);

    }
}
