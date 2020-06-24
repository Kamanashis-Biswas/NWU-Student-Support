package com.nwu.studentsupport.Activity;

import android.os.*;

import androidx.appcompat.app.*;

import android.widget.*;

import com.nwu.studentsupport.R;
//import com.github.barteksc.pdfviewer.*;

public class RoutineActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.routine);
		
		Toast.makeText(getApplicationContext(), "pinch to zoom the routine.",Toast.LENGTH_SHORT).show();  
		
		//PDFView pdfView=findViewById(R.id.pdfv);
       // pdfView.fromAsset("routine.pdf").load();
    }



}
