package com.approsoft.tacodemo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooserActivity extends AppCompatActivity {

    Button btnCustomer, btnTeamMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooser);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
            actionBar.hide();

        btnCustomer = (Button) findViewById(R.id.btnCustomer);
        btnCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooserActivity.this, CustomerMainActivity.class));
            }
        });
        btnTeamMember = (Button) findViewById(R.id.btnTeamMember);
        btnTeamMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooserActivity.this, LoginActivity.class));
            }
        });
    }
}
