package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 1. Khai báo các biến đại diện cho các thành phần trên giao diện
    private EditText edtName;
    private Button btnClick;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Dòng này giúp liên kết file Java này với giao diện XML vừa tạo
        setContentView(R.layout.activity_main);

        // 2. Ánh xạ (tìm kiếm) các thành phần giao diện thông qua ID
        edtName = findViewById(R.id.edtName);
        btnClick = findViewById(R.id.btnClick);
        tvResult = findViewById(R.id.tvResult);

        // 3. Viết sự kiện khi người dùng bấm vào nút "Gửi lời chào"
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy chữ mà người dùng đã nhập
                String name = edtName.getText().toString().trim();

                // Kiểm tra xem người dùng có nhập gì chưa
                if (name.isEmpty()) {
                    // Hiện thông báo nhỏ (Toast) nếu bỏ trống
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập tên kìa!", Toast.LENGTH_SHORT).show();
                } else {
                    // Đổi nội dung của TextView thành lời chào
                    tvResult.setText("Xin chào " + name + ", chúc bạn học tốt!");
                }
            }
        });
    }
}