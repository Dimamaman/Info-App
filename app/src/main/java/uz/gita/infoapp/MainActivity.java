package uz.gita.infoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    private int[] images = {
            R.drawable.aqshaxan_qala1,
            R.drawable.ayaz_qala1,
            R.drawable.belewli1,
            R.drawable.eres_qala_1,
            R.drawable.gawir_qala1,
            R.drawable.jampiq1,
            R.drawable.mazlumxan_suliw_1,
            R.drawable.mizdaxqan_1,
            R.drawable.pil_qala_1,
            R.drawable.qizil_qala1,
            R.drawable.qoyqirilgan_qala_1,
            R.drawable.shilpiq1,
            R.drawable.sultan_ways_1,
            R.drawable.topiraq_qala_1,
    };

    private String[] nameImage = {
            "Aqshaxan qala",
            "Ayaz qala",
            "Belewli",
            "Eres qala",
            "Gawir qala",
            "Jampiq",
            "Mazlumxan suliw",
            "Mizdaqxan",
            "Pil qala",
            "Qizil qala",
            "Qoyqirilg'an qala",
            "Shilpiq",
            "Sultan ways",
            "Topiraq qala",
    };

    LinearLayout container;
    final String NUMBERS = "numbers";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        container = findViewById(R.id.container);

        for (int i = 0; i < images.length; i++) {

            View view = LayoutInflater.from(this).inflate(R.layout.item_info,null);

            ImageView image = view.findViewById(R.id.image);
            AppCompatTextView textView = view.findViewById(R.id.nameImage);

            view.setTag(i);

            image.setImageResource(images[i]);
            textView.setText(nameImage[i]);

            container.addView(view);

            view.setOnClickListener(view1 -> {

                Intent intent = new Intent(MainActivity.this, InfoActivity.class);

                intent.putExtra(NUMBERS,((int) view1.getTag()));

                startActivity(intent);
            });
        }

        findViewById(R.id.infoBtn).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,AboutDeveloper.class));
        });

    }
}