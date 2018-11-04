package com.example.hasan.cuntryprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class cuntryProfile extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuntry_profile);

        imageView = findViewById(R.id.imageView_id);
        textView = findViewById(R.id.textView_id);
        textView2 = findViewById(R.id.textView2_id);


        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String value = bundle.getString("tag");
            showdetils(value);
        }
    }
    void  showdetils (String value){
        if (value.equals("bangladesh")){
            imageView.setImageResource(R.drawable.bangladeshi);
            textView.setText(R.string.bangladeshprofile);
            textView2.setText("Bangladesh");
        } if (value.equals("india")){
            imageView.setImageResource(R.drawable.india);
            textView.setText(R.string.indiaprofile);
            textView2.setText("India");
        } if (value.equals("brazil")){
            imageView.setImageResource(R.drawable.brazil);
            textView.setText(R.string.brazilprofile);
            textView2.setText("brazil");
        }
    }
}
