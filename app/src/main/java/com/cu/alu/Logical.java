package com.cu.alu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Logical extends AppCompatActivity {

    TextView mResult;
    Button btn0,btn1,btnAnd,btnOr,btnNot,btnXor,btnLS,btnClear,btnDelete,btnEquals;
    String s = null,temp = null,xx;

    int Value1,Value2,temp2,x;

    boolean and,or,not,ls,xor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logical);

        mResult = findViewById(R.id.resultView);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btnAnd = findViewById(R.id.btnAnd);
        btnOr = findViewById(R.id.btnOr);
        btnNot = findViewById(R.id.btnNot);
        btnLS = findViewById(R.id.btnLs);
        btnXor = findViewById(R.id.btnXor);
        btnClear = findViewById(R.id.btnC);
        btnDelete = findViewById(R.id.btnDel);
        btnEquals = findViewById(R.id.btnEqual);

        mResult.setText("");

        btnAnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( mResult.getText().toString().equals("") ) {
                    Toast.makeText(getApplicationContext(),"First Operand Required!!!", Toast.LENGTH_SHORT).show();

                } else {

                    try {
                        Value1 = Integer.parseInt(mResult.getText() + "",2);
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }

                    and = true;
                    s = mResult.getText() + " && ";
                    mResult.setText( s );
                }



            }
        });

        btnOr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( mResult.getText().toString().equals("") ) {
                    Toast.makeText(getApplicationContext(),"First Operand Required!!!", Toast.LENGTH_SHORT).show();

                } else {
                    try {
                        Value1 = Integer.parseInt(mResult.getText() + "",2);
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }
                    or = true;
                    s = mResult.getText() + " || ";
                    mResult.setText( s );
                }


            }
        });

        btnNot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                not = true;
                s = mResult.getText() + "! ";
                mResult.setText( s );
            }
        });

        btnLS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( mResult.getText().toString().equals("") ) {
                    Toast.makeText(getApplicationContext(),"First Operand Required!!!", Toast.LENGTH_SHORT).show();

                } else {
                    try {
                        Value1 = Integer.parseInt(mResult.getText() + "",2);
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }
                    ls = true;
                    s = mResult.getText() + " << ";
                    mResult.setText( s );
                }


            }
        });

        btnXor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( mResult.getText().toString().equals("") ) {
                    Toast.makeText(getApplicationContext(),"First Operand Required!!!", Toast.LENGTH_SHORT).show();

                } else {
                    try {
                        Value1 = Integer.parseInt(mResult.getText() + "",2);
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }
                    xor = true;
                    s = mResult.getText() + " ^ ";
                    mResult.setText( s );
                }


            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (and) {

                    temp = mResult.getText() + "";
                    s = temp.substring(temp.indexOf("&")+3);


                    try{
                        Value2 = Integer.parseInt(s,2);
                        temp2 = Value1 & Value2;
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }

                    s = Integer.toBinaryString(temp2) + "";
                    mResult.setText(s);
                    and=false;
                }

                if (or){

                    temp = mResult.getText() + "";
                    s = temp.substring(temp.indexOf("|")+3);

                    try{
                        Value2 = Integer.parseInt(s,2);
                        temp2 = Value1 | Value2;
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }


                    s = Integer.toBinaryString(temp2) + "";
                    mResult.setText(s);
                    or=false;
                }

                if (not){

                    temp = mResult.getText() + "";
                    s = temp.substring(temp.indexOf("!")+2);


                    try{
                        Value2 = Integer.parseInt(s,2);
                        temp2 = ~Value2 ;
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }

                    s = Integer.toBinaryString(temp2) + "";
                    xx = Integer.toBinaryString(Value2);
                    x = xx.length();
                    s = s.substring(s.length() - x);
                    mResult.setText(s);
                    not=false;
                }

                if (xor){

                    temp = mResult.getText() + "";
                    s = temp.substring(temp.indexOf("^")+2);


                    try {
                        Value2 = Integer.parseInt(s,2);
                        temp2 = Value1 ^ Value2;
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }

                    s = Integer.toBinaryString(temp2) + "";
                    mResult.setText(s);
                    xor=false;
                }

                if (ls){

                    temp = mResult.getText() + "";
                    s = temp.substring(temp.indexOf("<")+3);


                    try {
                        Value2 = Integer.parseInt(s,2);
                        temp2 = Value1 << Value2;
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }

                    s = Integer.toBinaryString(temp2) + "";
                    mResult.setText(s);
                    ls=false;
                }

            }
        });



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s = mResult.getText() + "0";
                mResult.setText( s );

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s = mResult.getText() + "1";
                mResult.setText(s);

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mResult.setText("");

            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mResult.getText().toString().equals(""))
                    Toast.makeText(getApplicationContext(),"Nothing to Delete!!!", Toast.LENGTH_SHORT).show();

                else {
                    s = mResult.getText() + "";
                    s = s.substring(0, s.length() - 1);
                    mResult.setText(s);
                }

            }
        });

    }

}
