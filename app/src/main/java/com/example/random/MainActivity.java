package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.whatsapp_menu,menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case (R.id.mods):
                Intent intentmod = new Intent(getBaseContext(), Mods.class);
                startActivity(intentmod);
                break;
            case (R.id.messages):
                opendialog();
                break;

        }
        return true;
    }
    public void opendialog(){
        Dialog dialog=new Dialog();
        dialog.show(getSupportFragmentManager(),"ME");
    }

}