package cool.superfcking.apps.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nowPlaying = (Button)findViewById(R.id.nowPlaying);
        Button songDetails = (Button)findViewById(R.id.songDetails);

        nowPlaying.setOnClickListener(new NowPlayingClickListener());
        songDetails.setOnClickListener(new SongDetailsClickListener());

    }
}
