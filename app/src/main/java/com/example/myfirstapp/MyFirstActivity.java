package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MyFirstActivity extends AppCompatActivity {
    TextView textView;
    private String Tag = "MyFirstActivityLog";
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        Log.i(Tag, "onCreate");

        setContentView(R.layout.activity_my_first);

        textView = findViewById(R.id.textView2);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MyFirstActivity.this, "Bạn đã nhấn vào tôi", Toast.LENGTH_LONG).show();

                Intent intent = new Intent();
                intent.setClass(MyFirstActivity.this,
                        MySecondActivity.class);

                String s = textView.getText().toString();
                intent.putExtra("data", s);

//                startActivity(intent);
                startActivityForResult(intent, MySecondActivity.RETURNFROM_MYSECONDACTIVITY);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == MySecondActivity.RETURNFROM_MYSECONDACTIVITY){
            String s = data.getStringExtra("data");
            textView.setText(s);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "onDestroy");
    }
}
