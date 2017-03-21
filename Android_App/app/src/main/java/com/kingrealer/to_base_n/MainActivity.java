package com.kingrealer.to_base_n;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button goButton;
    private EditText editText1;
    private EditText editText2;
    private TextView resText;
    private int base, n;
    private String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goButton = (Button) findViewById(R.id.goButton);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        resText = (TextView)findViewById(R.id.resText);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = "";
                String check = editText1.getText().toString().trim();
                if(TextUtils.isEmpty(check)){
                    resText.setText("No data!!!");
                }
                else {
                    base = Integer.parseInt(editText1.getText().toString());
                    n = Integer.parseInt(editText2.getText().toString());
                    to_base_n(base, n);
                }
            }
        });

    }

    public void to_base_n(int base, int n){

        int temp;
        if(n >= 36){
            resText.setText("The system number is too large!!!");
            return;
        }
        temp = base % n;
        if(base >= n){
            base = (int)(base / n);
            to_base_n(base, n);
        }
        if(temp < 10)
            str += temp;
        else
            str += (char)(temp + '7');
        resText.setText(str);
    }

}
