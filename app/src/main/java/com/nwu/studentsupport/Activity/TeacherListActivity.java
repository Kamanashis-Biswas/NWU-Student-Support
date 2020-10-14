package com.nwu.studentsupport.Activity;


import android.os.*;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.*;

import android.view.*;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.nwu.studentsupport.Adapters.TeacherRecycleAdapter;
import com.nwu.studentsupport.Model.Teacher;
import com.nwu.studentsupport.R;

import java.util.*;


import androidx.appcompat.widget.Toolbar;

import android.webkit.WebView;
import android.widget.SearchView;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TeacherListActivity extends AppCompatActivity {


    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_list);

		webView =(WebView) findViewById(R.id.webViewID);
		webView.loadUrl("https://www.nwu.edu.bd/cse_teacher.php");

	}

}
