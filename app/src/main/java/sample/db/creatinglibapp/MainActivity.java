package sample.db.creatinglibapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import cx.ongo.mylibraray.CalculateFormulae;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Integer> numbers = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 15; i++) {
            numbers.add(r.nextInt(7) + 1);
        }

        double mean = CalculateFormulae.arithmeticMean(numbers).doubleValue();

        Toast.makeText(getApplicationContext(), "mean = " + mean, Toast.LENGTH_SHORT).show();

    }
}
