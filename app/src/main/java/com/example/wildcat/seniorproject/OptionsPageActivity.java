package com.example.wildcat.seniorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionsPageActivity extends AppCompatActivity {

    private Button optionsPageToMainPageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_page);

        optionsPageToMainPageBtn = (Button) findViewById(R.id.optionsPageToMainPageBtn);
        optionsPageToMainPageBtn.setText("Back");
        optionsPageToMainPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionsPageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }



}
