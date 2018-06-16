package com.example.android.podcastpal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * For confirming how to include imageView and textViews in custom ArrayAdapter (6/8/2018):
 * https://medium.com/mindorks/custom-array-adapters-made-easy-b6c4930560dd
 */


public class EpisodeAdapter extends ArrayAdapter<Episode> {

    public EpisodeAdapter(Context context, ArrayList<Episode> episodes) {
        // Initialize ArrayAdapter's internal storage for context and list.
        super(context, 0, episodes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing View is being reused. If not, then inflate the View.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the Episode object located at this position in the list
        Episode currentEpisode = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView episodeImageView = convertView.findViewById(R.id.imageView_episode);
        episodeImageView.setImageResource(currentEpisode.getEpisodeImage());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = convertView.findViewById(R.id.textView_title);
        titleTextView.setText(currentEpisode.getEpisodeTitle());

        TextView dateTextView = convertView.findViewById(R.id.textView_date);
        dateTextView.setText(currentEpisode.getEpisodeDate());

        TextView durationTextView = convertView.findViewById(R.id.textView_duration);
        durationTextView.setText(currentEpisode.getEpisodeDuration());

        TextView descriptionTextView = convertView.findViewById(R.id.textView_description);
        descriptionTextView.setText(currentEpisode.getEpisodeDescription());

        // Return the whole list_item.xml layout (one ImageView, four TextViews) so it can be shown in the ListView
        return convertView;

    }
}
