package com.coventery.jack.activityopen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent = getIntent();
        String message = intent.getStringExtra("Passthrough");
        TextView aText = (TextView) findViewById(R.id.text2);
        aText.setText(message);

        String message2 = intent.getStringExtra("SecondText");
        TextView bText = (TextView) findViewById(R.id.text3);
        bText.setText(message2);

        Button webButton = (Button) findViewById(R.id.button);
        webButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent3 = new Intent(ThirdActivity.this, WebActivity.class);
                intent3.setFlags(intent3.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent3);
            }
        });

    }

}
