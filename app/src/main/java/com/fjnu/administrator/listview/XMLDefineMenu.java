package com.fjnu.administrator.listview;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class XMLDefineMenu extends Activity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmldefine_menu);
        textView=(TextView)findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.font_small:
                textView.setTextSize(10);
                break;
            case R.id.font_middle:
                textView.setTextSize(16);
                break;
            case R.id.font_big:
                textView.setTextSize(20);
                break;
            case R.id.menu_normal:
                Toast.makeText(XMLDefineMenu.this,"这是普通菜单项",Toast.LENGTH_SHORT).show();
                break;
            case R.id.font_red:
                textView.setTextColor(Color.RED);
                break;
            case R.id.font_black:
                textView.setTextColor(Color.BLACK);
                break;
        }
        return true;
    }
}
