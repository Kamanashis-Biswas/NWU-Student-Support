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
import com.nwu.studentsupport.Adapters.StudentsRecycleAdapter;
import com.nwu.studentsupport.Model.Student;
import com.nwu.studentsupport.R;

import java.util.*;


import androidx.appcompat.widget.Toolbar;
import android.widget.SearchView;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class StudentListActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
	private RecyclerView.LayoutManager layoutManager;
	private StudentsRecycleAdapter recycleAdapter;
	private List<Student> students;
	private DatabaseReference mainDB;
	private SwipeRefreshLayout sp;

	
	
    
    @Override  
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stu_list);

		mainDB = FirebaseDatabase.getInstance().getReference();
		Toolbar toolba = (Toolbar) findViewById(R.id.bar);
		setSupportActionBar(toolba);
		layoutManager = new LinearLayoutManager(this);
		recyclerView = findViewById(R.id.rcv_stu);
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
		recyclerView.setLayoutManager(layoutManager);
		recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
		students = new ArrayList<>();
		getStudentsData();

		sp = (SwipeRefreshLayout) findViewById(R.id.sp_stu);

	}

	private void getStudentsData() {
		mainDB.child("1").child("Students").addChildEventListener( new ChildEventListener() {
			@Override
			public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
				Student student = dataSnapshot.getValue(Student.class);
				students.add(student);
				recycleAdapter = new StudentsRecycleAdapter(students,getApplicationContext());
				recyclerView.setAdapter(recycleAdapter);
				recycleAdapter.notifyDataSetChanged();

			}

			@Override
			public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

			}

			@Override
			public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

			}

			@Override
			public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

			}

			@Override
			public void onCancelled(@NonNull DatabaseError databaseError) {

			}
		} );

	}




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.search_menu, menu);

		MenuItem menuItem = menu.findItem(R.id.action_search);

		SearchView searchView = (SearchView) menuItem.getActionView();

		searchView.setMaxWidth(Integer.MAX_VALUE);

		searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
			@Override
			public boolean onQueryTextSubmit(String query) {
				return false;
			}

			@Override
			public boolean onQueryTextChange(String newText) {

				recycleAdapter.getFilter().filter(newText);
				return true;
			}
		});



		return  true;
	}

}
