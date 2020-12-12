package com.example.mapfoodltdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {
    TextView username_reset132;
    EditText password_reset132, repassword_reset132;
    Button btnconfirm132;
    DBHelper DB132;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        username_reset132 = (TextView) findViewById(R.id.username_reset_text);
        password_reset132 = (EditText) findViewById(R.id.password_reset);
        repassword_reset132 = (EditText) findViewById(R.id.repassword_reset);
        btnconfirm132 = (Button) findViewById(R.id.btnconform);
        DB132 = new DBHelper(this);

        Intent intent = getIntent();
        username_reset132.setText(intent.getStringExtra("username"));
        btnconfirm132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username_reset132.getText().toString();
                String password = password_reset132.getText().toString();
                String repassword = repassword_reset132.getText().toString();

                if (password.equals(repassword)) {
                    Boolean checkpasswordupdate = DB132.updatepassword(user, password);
                    if (checkpasswordupdate == true) {
                        Intent intent = new Intent(getApplicationContext(), Login.class);
                        startActivity(intent);
                        Toast.makeText(ResetPassword.this, "Cập nhật mật khẩu thành công", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(ResetPassword.this, "Cập nhật mật khẩu thất bại", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(ResetPassword.this, "Mật khẩu không khớp", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}