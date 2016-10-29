package cool.superfcking.apps.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

/**
 * Created by jsinclair on 29/10/16.
 */
public class SongDetailsClickListener implements Button.OnClickListener {
    @Override
    public void onClick(View view){
        Context context = view.getContext();

        Intent main = new Intent(context, SongDetails.class);
        context.startActivity(main);
    }
}
