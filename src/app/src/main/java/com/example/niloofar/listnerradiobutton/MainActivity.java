package com.example.niloofar.listnerradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputObj=findViewById(R.id.txt_input);

        RadioButton shortObj=findViewById(R.id.rb_short);
        RadioButton longObj=findViewById(R.id.rb_long);

        RadioGroup mainObj=findViewById(R.id.rg_main);

        mainObj.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                String tmp=inputObj.getText().toString();
                if(i==R.id.rb_long){

                    Toast.makeText(getApplicationContext(),tmp,Toast.LENGTH_LONG).show();

                }else{

                    Toast.makeText(getApplicationContext(), tmp, Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
