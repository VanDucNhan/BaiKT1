package com.google.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("SignIn",MODE_PRIVATE);
        CheckBox ckbghinho = (CheckBox) findViewById(R.id.ckbghinhotaikhoan);
        Button btnlogin = (Button) findViewById(R.id.btnLogin);
        TextView phone = (TextView) findViewById(R.id.txtPhone);
        TextView pass = (TextView) findViewById(R.id.txtPassWord);

        phone.setText(sharedPreferences.getString("phone",""));
        pass.setText(sharedPreferences.getString("matkhau",""));
        ckbghinho.setChecked(sharedPreferences.getBoolean("checked",false));

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phonee = phone.getText().toString();
                String passs = pass.getText().toString();
                if(phonee.equals("0899885260") && passs.equals("nhan")){
                    Toast.makeText(MainActivity.this,"Đăng nhập thành công!",Toast.LENGTH_SHORT).show();
                    if(ckbghinho.isChecked()){
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("phone",phonee);
                        editor.putString("matkhau",passs);
                        editor.putBoolean("checked",true);
                        editor.commit();
                    }else{
                        SharedPreferences.Editor  editor = sharedPreferences.edit();
                        editor.remove("phone");
                        editor.remove("matkhau");
                        editor.remove("checked");
                        editor.commit();
                    }
                    Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(intent);;

                }else{
                    Toast.makeText(MainActivity.this,"Đăng nhập không thành công!",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}