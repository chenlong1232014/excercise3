package com.fjnu.administrator.listview;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.app.AlertDialog;

public class alertdialog extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater inflater=LayoutInflater.from(this);
        View loginview=inflater.inflate(R.layout.activity_alert_dialog,null);
        new AlertDialog.Builder(this).setView(loginview).setPositiveButton("Sign in",null).setNegativeButton("Cancle",null).show();
    }
}
