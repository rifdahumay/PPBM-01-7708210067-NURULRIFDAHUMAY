package com.example.cineswift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class ImageSlide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slide);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel("https://i.pinimg.com/474x/d2/03/d1/d203d184ad7b56c7475cf8813ea47cac.jpg", "Temukan keajaiban bioskop, nikmati setiap momen di layar lebar!", ScaleTypes.FIT));
        imageList.add(new SlideModel("https://i.pinimg.com/474x/90/ef/e6/90efe60e52d1dd210e7f26b4cc82f7f1.jpg", "Bioskop: tempat di mana kisah-kisah tak terlupakan terwujud!", ScaleTypes.FIT));
        imageList.add(new SlideModel("https://i.pinimg.com/474x/40/17/1c/40171c61df3d70ce9b351e3648ba132c.jpg", "Bioskop, di sini setiap frame adalah kisah baru yang menarik.", ScaleTypes.FIT));
        imageList.add(new SlideModel("https://i.pinimg.com/474x/b8/a6/00/b8a600d57b35240b5ce37cb9f4258619.jpg", "Bioskop: tempat lahirnya pengalaman momen istimewa!", ScaleTypes.FIT));
        imageList.add(new SlideModel("https://i.pinimg.com/474x/7b/52/82/7b52827400105f569722c4e47c9983e3.jpg", "Dari kisah cinta hingga aksi epik, semua ada di bioskop!", ScaleTypes.FIT));

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);

        imageSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void doubleClick(int i) {

            }

            @Override
            public void onItemSelected(int position) {
                Intent intent = new Intent(ImageSlide.this, Login_Page.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }
}