package com.example.pawan.hidetextview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity  implements OnClickListener {

    Button show;
    Button showFor2Sec;
    Button hide;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textview);
        show=(Button)findViewById(R.id.showButton);
        showFor2Sec=(Button)findViewById(R.id.showButtonFor2Sec);
        hide=(Button)findViewById(R.id.hideButton);
        show.setOnClickListener(this);
        hide.setOnClickListener(this);
        showFor2Sec.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view ==hide) {
            tv.setVisibility(View.INVISIBLE);
        }else if (view ==showFor2Sec) {
            tv.setText("Visible For 2 sec");
            tv.postDelayed(new Runnable() {
                public void run() {
                    tv.setVisibility(View.INVISIBLE);
                }
            }, 2000);
            tv.setVisibility(View.VISIBLE);
        }else if(view ==show) {
            tv.setText("Visible");
            tv.setVisibility(View.VISIBLE);
        }
    }
}
