package com.example.tictoctoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tictoctoe.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    int flag = 0;
    int count = 0;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        init();
        binding.reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btn1.setText("");
                binding.btn2.setText("");
                binding.btn3.setText("");
                binding.btn4.setText("");
                binding.btn5.setText("");
                binding.btn6.setText("");
                binding.btn7.setText("");
                binding.btn8.setText("");
                binding.btn9.setText("");
                count=0;
                flag=0;
            }
        });

    }

    public void init() {

    }

    public void Check(View view) {
        Button btnCurrent = (Button) view;
        if (btnCurrent.getText().equals("")) {
            count++;

            if (flag == 0) {
                btnCurrent.setText("x");
                flag = 1;
            } else {
                btnCurrent.setText("o");
                flag = 0;
            }
            if (count > 4) {
                b1 = binding.btn1.getText().toString();
                b2 = binding.btn2.getText().toString();
                b3 = binding.btn3.getText().toString();
                b4 = binding.btn4.getText().toString();
                b5 = binding.btn5.getText().toString();
                b6 = binding.btn6.getText().toString();
                b7 = binding.btn7.getText().toString();
                b8 = binding.btn8.getText().toString();
                b9 = binding.btn9.getText().toString();

//           conditions
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
//                1
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
//                2
                    Toast.makeText(this, "Winner is " + b4, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
//                3
                    Toast.makeText(this, "Winner is " + b7, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
//                4
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
//                5
                    Toast.makeText(this, "Winner is " + b2, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
//                6
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
//                7
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
//                8
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    restart();
                }
            }
        }
    }
    public void restart()
    {
        binding.btn1.setText("");
        binding.btn2.setText("");
        binding.btn3.setText("");
        binding.btn4.setText("");
        binding.btn5.setText("");
        binding.btn6.setText("");
        binding.btn7.setText("");
        binding.btn8.setText("");
        binding.btn9.setText("");
        count=0;
        flag=0;
    }

}