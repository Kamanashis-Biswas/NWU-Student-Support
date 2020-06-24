package com.nwu.studentsupport.Adapters;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.nwu.studentsupport.Fragment.FragmentSlybsFirstYear;
import com.nwu.studentsupport.Fragment.FtagmentSlybsSecondYear;
import com.nwu.studentsupport.Fragment.FtagmentSlybsThirdYear;
import com.nwu.studentsupport.Fragment.FtagmentSlybsFourthYear;

public class ViewPagerAdapterOfSlybs extends FragmentPagerAdapter {

    public ViewPagerAdapterOfSlybs(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position ==0) {
            return new FragmentSlybsFirstYear();
        } else if(position == 1){
            return new FtagmentSlybsSecondYear();
        } else if(position == 2){
			return new FtagmentSlybsThirdYear();
		}else{
			return new FtagmentSlybsFourthYear();
		}
	}



    @Override
    public int getCount() {
        return 4;
    }
}
