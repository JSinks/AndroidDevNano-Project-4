package cool.superfcking.apps.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button listView = (Button)findViewById(R.id.listView);
        Button songDetails = (Button)findViewById(R.id.songDetails);

        listView.setOnClickListener(new MainClickListener());
        songDetails.setOnClickListener(new SongDetailsClickListener());
    }
}
