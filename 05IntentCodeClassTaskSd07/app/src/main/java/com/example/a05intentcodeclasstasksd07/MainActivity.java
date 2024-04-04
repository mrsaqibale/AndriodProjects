package com.example.a05intentcodeclasstasksd07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText emailEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        usernameEditText = findViewById(R.id.editTextUsername);
        emailEditText = findViewById(R.id.editTextEmail);
        Button button = (Button)findViewById(R.id.buttonSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = emailEditText.getText().toString();
                String b = usernameEditText.getText().toString();
                    Intent intent=new Intent(MainActivity.this, finalScreen.class);
                    intent.putExtra("v1", a);
                    intent.putExtra("v2", b);
                    startActivity(intent);

            }
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

//    public static void func(View v){
//        Intent intent=new Intent(, finalScreen.class);
//        intent.putExtra("v1", "Some Value");
//        intent.putExtra("v2", "Another Value");
//        startActivity(intent);
//    }
}