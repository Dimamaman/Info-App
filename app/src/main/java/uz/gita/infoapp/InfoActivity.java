package uz.gita.infoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

import uz.gita.infoapp.databinding.ActivityInfoBinding;

public class InfoActivity extends AppCompatActivity {
    private ActivityInfoBinding binding;
    private int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        a = getIntent().getIntExtra("numbers",0);
        loadData(a);

        binding.buttonBack.setOnClickListener(view -> finish());
    }

    private void loadData(int number) {
        switch (number) {
            case 0 : {
                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();
                slideModels.add(new SlideModel(R.drawable.aqshaxan_qala1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.aqshaxan_qala2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.aqshaxan_qala3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.aqshaxan_qala4, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.aqshaxan_qala5, ScaleTypes.FIT));
                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.aqshaxan_qala);
                binding.name.setText(R.string.aqshaxan);
                break;
            }

            case 1 : {
                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();

                slideModels.add(new SlideModel(R.drawable.ayaz_qala1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.ayaz_qala2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.ayaz_qala3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.ayaz_qala4, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.ayaz_qala5, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.ayaz_qala6, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.ayaz_qala7, ScaleTypes.FIT));
                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.ayaz_qala);
                binding.name.setText(R.string.ayaz);
                break;
            }

            case 2 : {
                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();

                slideModels.add(new SlideModel(R.drawable.belewli1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.belewli2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.belewli3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.belewli4, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.belewli5, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.belewli6, ScaleTypes.FIT));
                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.belewli);
                binding.name.setText(R.string.belewli_txt);
                break;
            }

            case 3 : {
                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();

                slideModels.add(new SlideModel(R.drawable.eres_qala_1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.eres_qala_2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.eres_qala_3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.eres_qala_4, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.eres_qala_5, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.eres_qala_6, ScaleTypes.FIT));
                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.eres_qala);
                binding.name.setText(R.string.eres);
                break;
            }

            case 4 : {
                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();

                slideModels.add(new SlideModel(R.drawable.gawir_qala1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.gawir_qala2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.gawir_qala3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.gawir_qala4, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.gawir_qala5, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.gawir_qala6, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.gawir_qala7, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.gawir_qala8, ScaleTypes.FIT));
                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.gawir_qala);
                binding.name.setText(R.string.gawir);
                break;
            }

            case 5 : {

                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();

                slideModels.add(new SlideModel(R.drawable.jampiq1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.jampiq2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.jampiq3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.jampiq4, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.jampiq5, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.jampiq6, ScaleTypes.FIT));
                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.jampiq_qala);
                binding.name.setText(R.string.jampiq);
                break;
            }

            case 6 : {

                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();

                slideModels.add(new SlideModel(R.drawable.mazlumxan_suliw_1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.mazlumxan_suliw_2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.mazlumxan_suliw_3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.mazlumxan_suliw_4, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.mazlumxan_suliw_5, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.mazlumxan_suliw_6, ScaleTypes.FIT));
                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.mazlumxan_suliw);
                binding.name.setText(R.string.mazlumxan);
                break;
            }

            case 7 : {

                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();

                slideModels.add(new SlideModel(R.drawable.mizdaxqan_1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.mizdaxqan_2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.mizdaxqan_3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.mizdaxqan_4, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.mizdaxqan_5, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.mizdaxqan_6, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.mizdaxqan_7, ScaleTypes.FIT));
                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.mizdaxqan);
                binding.name.setText(R.string.mizdaxqan_txt);
                break;
            }

            case 8 : {

                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();

                slideModels.add(new SlideModel(R.drawable.pil_qala_1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.pil_qala_2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.pil_qala_3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.pil_qala_4, ScaleTypes.FIT));

                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.pil_qala);
                binding.name.setText(R.string.pil);
                break;
            }

            case 9 : {

                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();

                slideModels.add(new SlideModel(R.drawable.qizil_qala1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.qizil_qala2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.qizil_qala3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.qizil_qala4, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.qizil_qala5, ScaleTypes.FIT));

                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.qizil_qala);
                binding.name.setText(R.string.qizil);
                break;
            }

            case 10 : {

                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();

                slideModels.add(new SlideModel(R.drawable.qoyqirilgan_qala_1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.qoyqirilgan_qala_2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.qoyqirilgan_qala_3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.qoyqirilgan_qala_4, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.qoyqirilgan_qala_5, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.qoyqirilgan_qala_6, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.qoyqirilgan_qala_7, ScaleTypes.FIT));


                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.qoyqirilgan_qala);
                binding.name.setText(R.string.qoyqirilgan);
                break;
            }

            case 11 : {

                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();

                slideModels.add(new SlideModel(R.drawable.shilpiq1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.shilpiq2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.shilpiq3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.shilpiq4, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.shilpiq5, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.shilpiq6, ScaleTypes.FIT));


                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.shilpiq);
                binding.name.setText(R.string.shilpiq_txt);

                break;
            }

            case 12 : {

                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();

                slideModels.add(new SlideModel(R.drawable.sultan_ways_1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.sultan_ways_2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.sultan_ways_3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.sultan_ways_4, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.sultan_ways_5, ScaleTypes.FIT));


                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.sultan_ways);
                binding.name.setText(R.string.sultan);
                break;
            }

            case 13 : {

                ImageSlider imageSlider = findViewById(R.id.image_slider);

                ArrayList<SlideModel> slideModels = new ArrayList<>();

                slideModels.add(new SlideModel(R.drawable.topiraq_qala_1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.topiraq_qala_2, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.topiraq_qala_3, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.topiraq_qala_4, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.topiraq_qala_5, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.topiraq_qala_6, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.topiraq_qala_7, ScaleTypes.FIT));


                imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                binding.textDescription.setText(R.string.topiraq_qala);
                binding.name.setText(R.string.topiraq);
                break;
            }
        }
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        a = savedInstanceState.getInt("NUME");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt("NUME",a);
        super.onSaveInstanceState(outState);

    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}