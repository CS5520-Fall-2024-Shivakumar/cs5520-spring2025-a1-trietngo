package com.example.numad25sp_trietngo;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Define object for button
    Button btn;
    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Find button with specified ID
        btn = (Button)findViewById(R.id.buttonAbout2);

        // OnClick Listener
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Set Toast
                Toast aboutToast = Toast.makeText(getApplicationContext(), "Triet Ngo: ngo.tri@northeastern.edu",
                        Toast.LENGTH_LONG);

                // Set Toast Pos to Top Center
                aboutToast.setGravity(Gravity.TOP | Gravity.CENTER_VERTICAL, 0, 0);

                // Display Toast Message
                aboutToast.show();
            }
        });

        // Exit Button
        btnExit = findViewById(R.id.buttonExit2);

        // OnClick Listener
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Finish activity
                MainActivity.this.finish();

                // Exit activity
                System.exit(0);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}