package com.example.cineswift;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewMovieAdapter extends RecyclerView.Adapter<CardViewMovieAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Movie> listMovie;

    private ArrayList<Movie> getListMovie(){
        return listMovie;
    }

    public void setListMovie(ArrayList<Movie> listMovie){
        this.listMovie = listMovie;
    }

    public CardViewMovieAdapter(Context context){
        this.context = context;
    }
    @NonNull
    @Override
    public CardViewMovieAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_movie, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int position) {
        Movie movie = getListMovie().get(position);
        Glide.with(context)
                .load(movie.getCover())
                .apply(new RequestOptions().override(350, 550)) // Corrected syntax here
                .into(cardViewViewHolder.imgCover);
        cardViewViewHolder.txttittle.setText(movie.getTitle());
    }

    @Override
    public int getItemCount() {
        return getListMovie().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgCover;
        TextView txttittle;

        CardViewViewHolder(@NonNull final View itemView){
            super(itemView);

            imgCover = itemView.findViewById(R.id.img_cover);
            txttittle = itemView.findViewById(R.id.text_tittle);

            itemView.setOnClickListener(this);
        }
        public void onClick(View v) {
            int position = getAdapterPosition();
            Movie movie = getListMovie().get(position);
            Intent intent = new Intent(context, DetailMovie_Activity.class);
            intent.putExtra(DetailMovie_Activity.ITEM_EXTRA, movie);
            context.startActivity(intent);

        }
    }
}
