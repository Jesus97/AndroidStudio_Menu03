package com.iesvirgendelcarmen.dam.menu03;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
public class Menu03 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu03);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}

