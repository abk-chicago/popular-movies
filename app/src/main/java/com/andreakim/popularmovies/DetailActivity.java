package com.andreakim.popularmovies;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    ImageView posterImageView;
    TextView titleTextView;
    TextView releaseDateTextView;
    TextView ratingTextView;
    TextView synopsisTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        posterImageView = (ImageView) findViewById(R.id.detail_movie_poster_image);
        titleTextView = (TextView) findViewById(R.id.detail_title_tv);
        releaseDateTextView = (TextView) findViewById(R.id.detail_release_date_tv);
        ratingTextView = (TextView) findViewById(R.id.detail_vote_average_tv);
        synopsisTextView = (TextView) findViewById(R.id.detail_plot_synopsis_tv);

        // TODO: set text
        // TODO: set imageResource


    }

}
