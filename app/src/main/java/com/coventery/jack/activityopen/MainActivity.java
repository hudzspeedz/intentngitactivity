package com.coventery.jack.activityopen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button aButton = (Button) findViewById(R.id.button1);
        aButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("Key1", "this is the message");
                startActivity(intent);
            }
        });

        Button bButton = (Button) findViewById(R.id.button2);
        bButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText inputtext = (EditText) findViewById(R.id.inputtext);
                String test = inputtext.getText().toString();
                Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
                intent2.setFlags(intent2.FLAG_ACTIVITY_CLEAR_TOP);
                intent2.putExtra("Passthrough", "this message is from main class on create");
                intent2.putExtra("SecondText", test);
                startActivity(intent2);
            }
        });

        Button fragButton = (Button) findViewById(R.id.fragbutton);
        fragButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, Fragtivity.class);
                intent4.setFlags(intent4.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent4);
            }
        });

        Button fragdbutton = (Button) findViewById(R.id.fragdbutton);
        fragdbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(MainActivity.this, Rotatefrag.class);
                intent5.setFlags(intent5.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent5);
            }
        });

        Button layoutbutt = (Button) findViewById(R.id.layoutbutt);
        layoutbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlayout = new Intent(MainActivity.this, Layouts.class);
                intentlayout.setFlags(intentlayout.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intentlayout);
            }
        });
        Button widgetbutt = (Button) findViewById(R.id.button5);
        widgetbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentwidget = new Intent(MainActivity.this, MyWidgets.class);
                intentwidget.setFlags(intentwidget.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intentwidget);
            }
        });
        Button Progbutt = (Button) findViewById(R.id.progressbutt);
        Progbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentprogress = new Intent(MainActivity.this, ProgressBarActivity.class);
                intentprogress.setFlags(intentprogress.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intentprogress);
            }
        });

        Button ListButton = (Button) findViewById(R.id.listbutt);
        ListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainlist = new Intent(MainActivity.this, MainListActivity.class);
                mainlist.setFlags(mainlist.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(mainlist);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
