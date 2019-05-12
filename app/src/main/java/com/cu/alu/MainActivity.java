package com.cu.alu;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mlogic,marithmatic,help,close,calculate;
    int x;
    RelativeLayout mlayout;
    Intent i;
    TextView Output;
    EditText mInput;
    PopupWindow mypopup;
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlogic = findViewById(R.id.logical);
        marithmatic = findViewById(R.id.arithmatic);
        mToolbar = findViewById(R.id.Toolbar);
        setSupportActionBar(mToolbar);

        help = mToolbar.findViewById(R.id.help);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customview = layoutInflater.inflate(R.layout.popup, null);

                close = customview.findViewById(R.id.closePopupBtn);

                mlayout = customview.findViewById(R.id.mylayout);

                mInput = customview.findViewById(R.id.innput);

                Output = customview.findViewById(R.id.displaydecimal);

                calculate = customview.findViewById(R.id.calculate);

                mlayout.setVisibility(View.VISIBLE);
                mypopup = new PopupWindow(customview,Toolbar.LayoutParams.MATCH_PARENT,Toolbar.LayoutParams.MATCH_PARENT);

                mypopup.showAtLocation(mToolbar, Gravity.CENTER,0,0);

                mypopup.setFocusable(true);
                mypopup.update();

                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if ( !mInput.getText().toString().equals("") ){

                            String s = mInput.getText().toString();

                            x = Integer.parseInt(s);

                            s = Integer.toBinaryString(x) + "";

                            Output.setText(s);

                        }

                    }
                });

                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mypopup.dismiss();
                        mlayout.setVisibility(View.GONE);

                    }
                });

            }
        });

        mlogic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(MainActivity.this,Logical.class);
                startActivity(i);

            }
        });

        marithmatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(MainActivity.this,Arithmatic.class);
                startActivity(i);

            }
        });

    }


}
