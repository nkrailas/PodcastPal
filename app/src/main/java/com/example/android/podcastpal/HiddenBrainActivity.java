package com.example.android.podcastpal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HiddenBrainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.episode_list);

        // Create an ArrayList of Episodes objects
        ArrayList<Episode> episodes = new ArrayList<>();

        // Adding Episodes objects
        // Used resource to compress image files (6/8/2018): http://compresspng.com/
        episodes.add(new Episode(R.drawable.hiddenbrain_20180604, "When Everything Clicks",
                "June 4, 2018", "52 mins",
                "We explore an innovative idea about how we learn and how to quiet the noise."));
        episodes.add(new Episode(R.drawable.hiddenbrain_20180528, "Kinder-Gardening",
                "May 28, 2018", "29 mins",
                "Many parents think they can shape their child into a particular kind of adult. Science suggests otherwise."));
        episodes.add(new Episode(R.drawable.hiddenbrain_20180521, "Rewinding and Rewriting",
                "May 21, 2018", "30 mins",
                "All of us are time travelers. Why do some events prompt \"What if?\" questions, while others do not?"));
        episodes.add(new Episode(R.drawable.hiddenbrain_20180518, "Radio Replay: This is Your Brain on Ads",
                "May 18, 2018", "51 mins",
                "How many ads have you encountered today? We discuss the insidiousness of advertising in American media."));
        episodes.add(new Episode(R.drawable.hiddenbrain_20180514, "Baby Talk",
                "May 14, 2018", "30 mins",
                "The babbling of babies is teachable to non-experts. We get a primer on how to decipher babbling - the unique dialect of tiny humans."));
        episodes.add(new Episode(R.drawable.hiddenbrain_20180507, "Rap on Trial",
                "May 7, 2018", "55 mins",
                "Aspiring rapper and colllege student Olutosin Oduwole's rap lyrics and public perceptions of rap music may have led to his prosecution."));
        episodes.add(new Episode(R.drawable.hiddenbrain_20180430, "The Fox and the Hedgehog",
                "April 30, 2018", "38 mins",
                "We use the metaphor of the fox and hedgehog as a way to understand the differences between tacticians and big-picture thinkers."));

        // Create an ArrayAdapter whose data source is a list of Strings.
        EpisodeAdapter adapter = new EpisodeAdapter(this, episodes);

        // Find the ListView object in the view hierarchy of the Activity.
        // The episode_list layout file contains the ListView with the view ID called list.
        ListView listView = findViewById(R.id.episode_list);

        // Make the ListView use the ArrayAdapter so the ListView displays list items for each episode in the list of episodes.
        listView.setAdapter(adapter);

    }
}
