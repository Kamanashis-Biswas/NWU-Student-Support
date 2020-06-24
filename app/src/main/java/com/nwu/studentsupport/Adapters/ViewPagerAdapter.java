package com.nwu.studentsupport.Adapters;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.nwu.studentsupport.Fragment.FragmentFiles;
import com.nwu.studentsupport.Fragment.FragmentHome;
import com.nwu.studentsupport.Fragment.FragmentNotice;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position ==0) {
            return new FragmentHome();
        } else if(position == 1){
            return new FragmentNotice();
        } else{
            return new FragmentFiles();
        }
    }



    @Override
    public int getCount() {
        return 3;
    }
}