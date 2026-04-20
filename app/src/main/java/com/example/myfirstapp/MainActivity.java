package com.example.myfirstapp;

//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class MainActivity extends AppCompatActivity {
//    private EditText edtName;
//    private Button btnClick;
//    private TextView tvResult;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_main);
//
//        edtName = findViewById(R.id.edtName);
//        btnClick = findViewById(R.id.btnClick);
//        tvResult = findViewById(R.id.tvResult);
//
//        btnClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String name = edtName.getText().toString().trim();
//
//                if (name.isEmpty()) {
//                    Toast.makeText(MainActivity.this, "Bạn chưa nhập tên kìa!", Toast.LENGTH_SHORT).show();
//                } else {
//                    tvResult.setText("Xin chào " + name + ", chúc bạn học tốt!");
//                }
//            }
//        });
//    }
//}

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        
    }
}