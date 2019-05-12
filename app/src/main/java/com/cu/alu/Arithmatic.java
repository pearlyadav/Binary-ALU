package com.cu.alu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Arithmatic extends AppCompatActivity {

    TextView mResult;
    Button btn0,btn1,btnAdd,btnSub,btnMultiply,btnDivide,btnInc,btnClear,btnDelete,btnEquals;
    String s = null,temp = null;

    int Value1,Value2,temp2;

    boolean add,sub,mul,divide,inc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmatic);

        mResult = findViewById(R.id.resultView);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnInc = findViewById(R.id.btnInc);
        btnClear = findViewById(R.id.btnC);
        btnDelete = findViewById(R.id.btnDel);
        btnEquals = findViewById(R.id.btnEqual);

        mResult.setText("");

        btnAdd.setOnClickListener(new View.OnClickListener() {
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

                    add = true;
                    s = mResult.getText() + " + ";
                    mResult.setText( s );
                }

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
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

                    sub = true;
                    s = mResult.getText() + " - ";
                    mResult.setText( s );
                }

            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
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

                    mul = true;
                    s = mResult.getText() + " * ";
                    mResult.setText( s );
                }

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
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

                    divide = true;
                    s = mResult.getText() + " / ";
                    mResult.setText( s );
                }

            }
        });

        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inc = true;
                s = mResult.getText() + " ++ ";
                mResult.setText( s );

            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (add) {

                    temp = mResult.getText() + "";
                    s = temp.substring(temp.indexOf("+")+2);


                    try{
                        Value2 = Integer.parseInt(s,2);
                        temp2 = Value1 + Value2;
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }

                    s = Integer.toBinaryString(temp2) + "";
                    mResult.setText(s);
                    add=false;
                }

                if (sub){

                    temp = mResult.getText() + "";
                    s = temp.substring(temp.indexOf("-")+2);

                    try{
                        Value2 = Integer.parseInt(s,2);
                        temp2 = Value1 - Value2;
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }


                    s = Integer.toBinaryString(temp2) + "";
                    mResult.setText(s);
                    sub=false;
                }

                if (inc){

                    temp = mResult.getText() + "";
                    s = temp.substring(temp.indexOf("+")+3);


                    try{
                        Value2 = Integer.parseInt(s,2);
                        temp2 = Value2 + 1 ;
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }

                    s = Integer.toBinaryString(temp2) + "";
                    mResult.setText(s);
                    inc=false;
                }

                if (mul){

                    temp = mResult.getText() + "";
                    s = temp.substring(temp.indexOf("*")+2);

                    try {
                        Value2 = Integer.parseInt(s,2);
                        temp2 = Value1 * Value2;
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }

                    s = Integer.toBinaryString(temp2) + "";
                    mResult.setText(s);
                    mul=false;
                }

                if (divide){

                    temp = mResult.getText() + "";
                    s = temp.substring(temp.indexOf("/")+2);


                    try {
                        Value2 = Integer.parseInt(s,2);
                        temp2 = Value1 / Value2;
                    }
                    catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Expression. Please Try Again!", Toast.LENGTH_SHORT).show();
                        mResult.setText("");
                    }

                    s = Integer.toBinaryString(temp2) + "";
                    mResult.setText(s);
                    divide=false;
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
