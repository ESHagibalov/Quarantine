package com.example.quarantin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int num = -1;
    int last = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int random_range() {
        while(num == last) {
            Random rand = new Random();
            num = rand.nextInt(10);
        }

        last = num;

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
            case 3:
                picture = new delivery();
                break;
            case 4:
                picture = new audiobooks();
                break;
            case 5:
                picture = new finance();
                break;
            case 6:
                picture = new clean_home();
                break;
            case 7:
                picture = new programming();
                break;
            case 8:
                picture = new vyshivka();
                break;
            case 9:
                picture = new travel();
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
