package com.fjnu.administrator.listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {

    private ListView listView;
    private SimpleAdapter simpleAdapter;
    private List<Map<String,Object>> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_simpleAdapter=(Button)findViewById(R.id.simpleadapter);
        btn_simpleAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.fjnu.administrator.listview.SimpleAdapter.class);
                startActivity(intent);
            }
        });

        Button btn_alertdialog=(Button)findViewById(R.id.alertdialog);
        btn_alertdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, alertdialog.class);
                startActivity(intent);
            }
        });

        Button btn_xmldefinemenu=(Button)findViewById(R.id.xmldefinemenu);
        btn_xmldefinemenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, XMLDefineMenu.class);
                startActivity(intent);
            }
        });

        Button btn_actionmode=(Button)findViewById(R.id.context);
        btn_actionmode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, actionmode.class);
                startActivity(intent);
            }
        });


    }

}
