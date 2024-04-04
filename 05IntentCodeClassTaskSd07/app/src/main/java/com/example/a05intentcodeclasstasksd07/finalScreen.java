package com.example.a05intentcodeclasstasksd07;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class finalScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_final_screen);

        Intent intent=getIntent();
        String msg1=intent.getStringExtra("v1");
        String msg2=intent.getStringExtra("v2");

        setContentView(R.layout.activity_final_screen);

        // Access the TextView by its ID
        TextView messageTextView = findViewById(R.id.messageTextView);

        // Set the text of the TextView
        messageTextView.setText("name = " + msg1+"        Email = "+msg2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}