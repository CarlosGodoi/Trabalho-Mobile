package com.example.trabalho1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TerceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
        Button btn = (Button)findViewById(R.id.button);
    }

    public void retornaSegundaActivity(View view){
        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);
    }

    public void retornaPrincipalActivity(View view){
        Intent intent = new Intent(this, PrincipalActivity.class);
        startActivity(intent);
    }
}