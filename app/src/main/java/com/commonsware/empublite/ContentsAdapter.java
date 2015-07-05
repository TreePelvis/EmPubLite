package com.commonsware.empublite;

import android.app.Activity;
import android.app.Fragment;
import android.support.v13.app.FragmentStatePagerAdapter;


/**
 * Created by User on 6/27/2015.
 */
public class ContentsAdapter extends FragmentStatePagerAdapter{
    private BookContents contents = null;

    public ContentsAdapter(Activity ctxt, BookContents contents) {
        super(ctxt.getFragmentManager());
        this.contents = contents;
    }

    @Override
    public Fragment getItem(int position) {
        String path = contents.getChapterFile(position);
        return SimpleContentFragment.newInstance("file:///android_asset/book/" + path);
    }

    @Override
    public int getCount() {
        return contents.getChapterCount();
    }
}
