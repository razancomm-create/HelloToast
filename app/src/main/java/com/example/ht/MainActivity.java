
package com.example.ht;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;
import android.content.res.ColorStateList;
public class MainActivity extends AppCompatActivity {
    TextView countText;
    Button countButton;
    Button zeroButton;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countText = findViewById(R.id.text_display_count);
        countButton = findViewById(R.id.button_count);
        zeroButton = findViewById(R.id.button_zero);

        zeroButton.setBackgroundTintList(
                ColorStateList.valueOf(Color.GRAY));
    }

    // Toast Button
    public void show_toast(View view) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
    }

    // Count Button
    public void increase_count(View view) {

        count++;

        countText.setText(String.valueOf(count));

        if (count % 2 == 1) {
            countButton.setBackgroundTintList(
                    ColorStateList.valueOf(Color.GREEN));
        } else {
            countButton.setBackgroundTintList(
                    ColorStateList.valueOf(Color.BLUE));
        }

        zeroButton.setBackgroundTintList(
                ColorStateList.valueOf(Color.rgb(255, 165, 0)));
    }

    // Zero Button
    public void show_zero(View view) {

        count = 0;

        countText.setText(String.valueOf(count));

        zeroButton.setBackgroundTintList(
                ColorStateList.valueOf(Color.GRAY));
    }
}
