package com.coventery.jack.activityopen;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MainListActivity extends ListActivity {

        String[] presidentsFullName = {
                "Dwight D. Eisenhower",
                "John F. Kennedy",
                "Lyndon B. Johnson",
                "Richard Nixon",
                "Gerald Ford",
                "Jimmy Carter",
                "Ronald Reagan",
                "George H. W. Bush",
                "Bill Clinton",
                "George W. Bush",
                "Barack Obama"
        };
    String[] presidentsFirstName;

    final ArrayList<Presidents> presidents = new ArrayList<Presidents>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for (int i =0; i<presidentsFullName.length; i++)
        {
            presidents.add(new Presidents(presidentsFirstName[i],presidentsFullName[i]));
        }
        //setContentView(R.layout.activity_main_list);
        presidentsFirstName = getResources().getStringArray(R.array.first_names);
     //setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, presidents));


    }

    public void onListItemClick(ListView l,View v,int position, long id){
        //Toast.makeText(this, "This is the President " + presidents[position], Toast.LENGTH_SHORT).show();
    }

}
