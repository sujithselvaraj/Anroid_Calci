package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn9,btn8,btn7,btn6,btn5,btn4,btn3,btn2,btn1,btn0;
    Button btnadd,btnsub,btndiv,btnmul,btndot,btnclear,btnequal;
    TextView txt1;
    float mValueOne,mValueTwo;
    boolean bdAddition,mSubract,bdMultiplication,bdDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn9=findViewById(R.id.btn9);
        btn8=findViewById(R.id.btn8);
        btn7=findViewById(R.id.btn7);
        btn6=findViewById(R.id.btn6);
        btn5=findViewById(R.id.btn5);
        btn4=findViewById(R.id.btn4);
        btn3=findViewById(R.id.btn3);
        btn2=findViewById(R.id.btn2);
        btn1=findViewById(R.id.btn1);
        btn0=findViewById(R.id.btn0);

        btndot=findViewById(R.id.btndot);
        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btnmul=findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);
        btnclear=findViewById(R.id.btnclear);
        btnequal=findViewById(R.id.btnequal);

        txt1=findViewById(R.id.txt1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"1");
            }
        });
    btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            txt1.setText(txt1.getText()+"2");
        }
    });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"0");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1 == null)
                {
                    txt1.setText("");
                }
                else
                {
                    mValueOne=Float.parseFloat(txt1.getText()+"");
                    bdAddition=true;
                    txt1.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(txt1.getText()+"");
                mSubract=true;
                txt1.setText("");
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(txt1.getText()+"");
                bdMultiplication=true;
                txt1.setText(null);

            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(txt1.getText()+"");
                bdDivision=true;
                txt1.setText(null);
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!txt1.equals(""))
                {
                    mValueTwo=Float.parseFloat(txt1.getText()+"");
                    if(bdAddition==true)
                    {
                        txt1.setText(mValueOne+mValueTwo+"");
                        bdAddition=false;
                    }
                    if(mSubract==true)
                    {
                        txt1.setText(mValueOne-mValueTwo+"");
                        mSubract=false;
                    }
                    if(bdMultiplication==true)
                    {
                        txt1.setText(mValueOne*mValueTwo+"");
                        bdMultiplication=false;
                    }
                    if(bdDivision==true)
                    {
                        txt1.setText(mValueOne/mValueTwo+"");
                        bdDivision=false;
                    }
                }
                else
                {
                    txt1.setText(0);
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("");
            }
        });
    }
}