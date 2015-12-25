package co.squack.squack;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SliderPagerAdapter extends FragmentPagerAdapter {
    public SliderPagerAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem (int pos) {

        switch (pos) {
            case 0:
                ConvoFragment fragment = new ConvoFragment();
                return fragment;
            case 1:
                ConvoFragment userFrag = new ConvoFragment();
                return userFrag;
          //  case 2:
            //    UserFragment messFrag = new UserFragment();
             //   return messFrag;
            //Fix this, should i use android.app.fragment or android.support.v4.app.Fragment
            default:
                return null;
        }
    }

    public int getCount () {
        return 2;
    }
}