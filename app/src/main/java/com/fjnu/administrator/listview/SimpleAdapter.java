package com.fjnu.administrator.listview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapter extends ActionBarActivity {

    private ListView listView;
    private android.widget.SimpleAdapter simpleAdapter;
    private List<Map<String,Object>> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
        listView=(ListView)findViewById(R.id.listView);
        dataList=new ArrayList<Map<String,Object>>();
        simpleAdapter=new android.widget.SimpleAdapter(this,getData(),R.layout.item,new String[]{"text","pic"},new int[]{R.id.textView2,R.id.imageView});
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                HashMap<String,Object> map =(HashMap<String,Object>)listView.getItemAtPosition(i);
                String text=map.get("text").toString();
                Toast.makeText(SimpleAdapter.this, text, Toast.LENGTH_SHORT).show();
            }
        });

    }
    private  List<Map<String,Object>> getData()
    {
        Map<String,Object> item=new HashMap<String,Object>();
        item.put("text","Cat");
        item.put("pic",R.drawable.cat);
        dataList.add(item);

        item=new HashMap<String,Object>();
        item.put("text","Lion");
        item.put("pic", R.drawable.lion);
        dataList.add(item);

        item=new HashMap<String,Object>();
        item.put("text","Dog");
        item.put("pic", R.drawable.dog);
        dataList.add(item);

        item=new HashMap<String,Object>();
        item.put("text","Elephant");
        item.put("pic", R.drawable.elephant);
        dataList.add(item);

        item=new HashMap<String,Object>();
        item.put("text","Monkey");
        item.put("pic",R.drawable.monkey);
        dataList.add(item);

        item=new HashMap<String,Object>();
        item.put("text","Tiger");
        item.put("pic",R.drawable.tiger);
        dataList.add(item);
        return dataList;
    }
}
