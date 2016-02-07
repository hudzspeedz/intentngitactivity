package com.coventery.jack.activityopen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

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
                intent.putExtra("Key1","this is the message");
                startActivity(intent);
            }
        });

        Button bButton = (Button) findViewById(R.id.button2);
        bButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String test = "Useing a string to change text";
                Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
                intent2.setFlags(intent2.FLAG_ACTIVITY_CLEAR_TOP);
                intent2.putExtra("Passthrough", "this message is from main class on create");
                intent2.putExtra("SecondText",test);
                startActivity(intent2);
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
