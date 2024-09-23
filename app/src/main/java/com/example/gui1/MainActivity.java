package com.example.gui1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txtHT = findViewById(R.id.txtHT);
    TextView txtA = findViewById(R.id.txtA);
    TextView txtB = findViewById(R.id.txtB);
    Button btn_tong = findViewById(R.id.btn_tong);
    Button btn_hieu = findViewById(R.id.btn_hieu);
    Button btn_tich = findViewById(R.id.btn_tich);
    Button btn_thuong = findViewById(R.id.btn_thuong);
    Button btn_uoc = findViewById(R.id.btn_ucln);
    Button btn_thoat = findViewById(R.id.btn_thoat);
    int x = Integer.parseInt(txtA.getText().toString());
    int y = Integer.parseInt(txtB.getText().toString());

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    private void innitControl(){
        btn_tong.setOnClickListener(view -> {
            int tong = x + y;
            txtHT.setText(String.valueOf(tong));
        });
        btn_hieu.setOnClickListener(view -> {
            int hieu = x - y;
            txtHT.setText(String.valueOf(hieu));
        });
        btn_tich.setOnClickListener(view -> {
            int tich = x * y;
            txtHT.setText(String.valueOf(tich));
        });
        btn_thuong.setOnClickListener(view -> {
            int thuong = x / y;
            txtHT.setText(String.valueOf(thuong));
        });

        btn_uoc.setOnClickListener(view -> {
            int ucln = gcd(x,y);
            txtHT.setText(String.valueOf(ucln));
        });
        btn_thoat.setOnClickListener(view -> {
            finish();
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        innitControl();
    }
}