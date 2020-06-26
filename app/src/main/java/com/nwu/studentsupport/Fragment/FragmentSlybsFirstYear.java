package com.nwu.studentsupport.Fragment;

import android.os.*;

import androidx.annotation.Nullable;


import android.view.*;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.nwu.studentsupport.R;

public class FragmentSlybsFirstYear extends Fragment {

	CardView x;
	
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sl1, container, false);
   

    }
	/*@Override
	 public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
	 super.onViewCreated(view, savedInstanceState);
	 ImageView iamge = (ImageView) view.findViewById(R.id.vector); */


	@Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
		

    }




	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


	
		//x.setRadius(10);
}
}

