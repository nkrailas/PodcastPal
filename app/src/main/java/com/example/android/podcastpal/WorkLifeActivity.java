package com.example.android.podcastpal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class WorkLifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.episode_list);

        // Create an ArrayList of Episodes objects
        ArrayList<Episode> episodes = new ArrayList<>();

        // Adding Episodes objects
        // For description of episodes (6/10/2018): https://www.ted.com/series/worklife-with-adam-grant
        episodes.add(new Episode(R.drawable.worklife, "When Work Takes Over Your Life",
                "April 14, 2018", "38 mins",
                "Technology is making it harder than every to disconnect, but it might be easier than you think."));
        episodes.add(new Episode(R.drawable.worklife, "A World Without Bosses",
                "April 11, 2018", "34 mins",
                "Being your own boss can be liberating, but it can also be paralyzing."));
        episodes.add(new Episode(R.drawable.worklife, "Faking Your Emotions at Work",
                "April 4, 2018", "34 mins",
                "How do you manage your emotions at work - and your coworkers' and customers' emotions too - without burning out?"));
        episodes.add(new Episode(R.drawable.worklife, "How to Trust People You Don't Like",
                "March 28, 2018", "34 mins",
                "How to handle conflict and build trust? Ask a crew of multi-national astronauts and a wilderness trainer."));

        // Create an ArrayAdapter whose data source is a list of Strings.
        EpisodeAdapter adapter = new EpisodeAdapter(this, episodes);

        // Find the ListView object in the view hierarchy of the Activity.
        // The episode_list layout file contains the ListView with the view ID called list.
        final ListView listView = findViewById(R.id.episode_list);

        // Make the ListView use the ArrayAdapter so the ListView displays list items for each episode in the list of episodes.
        listView.setAdapter(adapter);

        // For displaying Toast when item in ListView is clicked (6/10/2018): https://www.youtube.com/watch?v=XyxT8IQoZkc
        // Set OnItemClickListener for a ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Now Playing", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
