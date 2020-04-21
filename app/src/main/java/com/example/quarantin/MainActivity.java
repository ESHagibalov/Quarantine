package com.example.quarantin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int random_range() {
        int num;

        Random rand = new Random();
        num = rand.nextInt(3);

        return num;
    }

    public void Change (View view){
        Fragment picture = null;

        switch (random_range()) {
            case 0:
                picture = new Sport();
            break;
            case 1:
                picture = new Monopoly();
                break;
            case 2:
                picture = new make_music();
                break;
            default:
                break;
        }

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fr_first, picture);
        ft.commit();
    }
}
