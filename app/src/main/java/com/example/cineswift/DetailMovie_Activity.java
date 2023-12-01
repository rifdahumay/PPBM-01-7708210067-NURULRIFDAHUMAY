package com.example.cineswift;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMovie_Activity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        ImageView imageItemPhoto = findViewById(R.id.img_poster);
        TextView tvName = findViewById(R.id.tv_judul);
        TextView tvTahun = findViewById(R.id.tv_genre);
        TextView tvOverview = findViewById(R.id.tv_detail);

        Movie movie = getIntent().getParcelableExtra(ITEM_EXTRA);

        if(movie != null){
            Glide.with(this)
                    .load((movie.getCover()))
                    .into(imageItemPhoto);
            tvName.setText(movie.getTitle());
            tvTahun.setText(movie.getTahun());
            tvOverview.setText(movie.getDeskripsi());
        }

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Movie");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}