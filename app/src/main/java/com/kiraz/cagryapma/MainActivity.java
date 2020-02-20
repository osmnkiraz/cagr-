package com.kiraz.cagryapma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        aramaYap();
    }
    public void tanimla(){
        editText =(EditText) findViewById(R.id.edtPhone);
        button =(Button) findViewById(R.id.btnAramaYap);
    }
    public void aramaYap(){
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String veriAl=editText.getText().toString();
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+veriAl));
                startActivity(intent);



            }
        });
    }
}
