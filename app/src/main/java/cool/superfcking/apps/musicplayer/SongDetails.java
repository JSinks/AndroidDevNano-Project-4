package cool.superfcking.apps.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SongDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);

        Button listView = (Button)findViewById(R.id.listView);
        Button nowPlaying = (Button)findViewById(R.id.nowPlaying);

        listView.setOnClickListener(new MainClickListener());
        nowPlaying.setOnClickListener(new NowPlayingClickListener());
    }
}
