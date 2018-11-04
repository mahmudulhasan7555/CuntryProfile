package com.example.hasan.cuntryprofile;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button banladeshButton,indiaButton,brazilButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        banladeshButton = findViewById(R.id.bangladeshId);
        indiaButton = findViewById(R.id.india_Id);
        brazilButton = findViewById(R.id.brazil_Id);

        banladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        brazilButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.bangladeshId){
            Intent intent = new Intent(MainActivity.this,cuntryProfile.class);
            intent.putExtra("tag","bangladesh");
            startActivity(intent);
        }if (v.getId()==R.id.india_Id){
            Intent intent = new Intent(MainActivity.this,cuntryProfile.class);
            intent.putExtra("tag","india");
            startActivity(intent);
        }if (v.getId()==R.id.brazil_Id){
            Intent intent = new Intent(MainActivity.this,cuntryProfile.class);
            intent.putExtra("tag","brazil");
            startActivity(intent);
        }

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBilder;
        alertDialogBilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBilder.setTitle("Hello");
        alertDialogBilder.setMessage("Do you want to exit?");
        alertDialogBilder.setIcon(R.drawable.bangladesh_icon);
        alertDialogBilder.setCancelable(false);

        alertDialogBilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertDialogBilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBilder.create();
        alertDialog.show();

    }
}
