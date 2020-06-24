package com.nwu.studentsupport.Fragment;
import android.os.*;

import androidx.annotation.Nullable;

import android.view.*;

import androidx.fragment.app.Fragment;

import com.nwu.studentsupport.R;


public class FtagmentSlybsSecondYear extends Fragment {

	
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sl2, container, false);


    }

	@Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


	}




	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



		//x.setRadius(10);

	}

}

