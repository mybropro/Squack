package co.squack.squack;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.List;


public class ConvoFragment extends android.support.v4.app.Fragment{
    public View view = null;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_conversations, null);
        //scrollview holds the big list of all the conversationl;
       LinearLayout ll = (LinearLayout) view.findViewById(R.id.ll);
       //rl.setId(696);

       // getFragmentManager().beginTransaction().add(rl.getId(), ConvoBox.newInstance("Myles", "eat a kira wang"), "someTag1").commit();
        //getFragmentManager().beginTransaction().add(rl.getId(), ConvoBox.newInstance("Reed", "munch my butt"), "someTag2").commit();


        ConvoBox dude2 = new ConvoBox().newInstance("Myles");
       // Log.i("NUMBER OF FRAGS", dude2.names);
        //rl.addView(dude2.cbox, 0);
       // rl.addView(dude2.getLayout(),1);

        return view;
    }


    /*Stuff for pulling images (profile pics)
    private Bitmap loadImageFromNetwork (String url) {
        try {
            Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(url).getContent());
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private class DownloadImageTask extends AsyncTask <String, Void, Bitmap> {
        ImageView view;

        DownloadImageTask (ImageView v) {
            view = v;
        }

        protected Bitmap doInBackground (String... urls) {
            return loadImageFromNetwork(urls[0]);
        }

        protected void onPostExecute(Bitmap result) {
            view.setImageBitmap(result);
        }
    }
    //ImageView imageView1 = (ImageView) view.findViewById(iv);
    //new DownloadImageTask(imageView1).execute("http://i.imgur.com/wdJuoTo.png");
*/
}
