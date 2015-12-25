package co.squack.squack;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.io.InputStream;
import java.net.URL;


public class ConvoBox extends Fragment{
    View cbox;
    String names;

        public static ConvoBox newInstance(String text) {

            ConvoBox f = new ConvoBox();

            Bundle b = new Bundle();
            b.putString("personsname", text);
            f.setArguments(b);
            return f;
        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View v =  inflater.inflate(R.layout.convobox, container, false);

        ((TextView) v.findViewById(R.id.username)).setText(getArguments().getString("personsname"));
        //((TextView) v.findViewById(R.id.userlastmsg)).setText(getArguments().getString("lstmsg"));
        names=getArguments().getString("personsname");
        cbox = v;
        return v;
    }


    public int conDP(View v, int dps) {
        final float scale = v.getContext().getResources().getDisplayMetrics().density;
        int pixels = (int) (dps * scale + 0.5f);
        return pixels;
    }
    public void openUser (View v) {
       // Intent intent = new Intent(v.getContext(), UserActivity.class);
        Log.i("CONVOBOX", "not trash");
    }



}
