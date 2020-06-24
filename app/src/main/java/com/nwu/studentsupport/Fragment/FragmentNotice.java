package com.nwu.studentsupport.Fragment;
import android.os.*;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.*;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.nwu.studentsupport.Model.Notice;
import com.nwu.studentsupport.R;
import com.nwu.studentsupport.Adapters.NoticeRecycleAdapter;

import java.util.*;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FragmentNotice extends Fragment {
    private DatabaseReference mainDB;
	private RecyclerView recyclerView;
	private RecyclerView.LayoutManager layoutManager;
	private NoticeRecycleAdapter recycleAdapter;
	private List<Notice> allNotices;
	private FloatingActionButton addNotice;

	
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_notices, container, false);
		addNotice =view.findViewById(R.id.addNotice);

		recyclerView = view.findViewById( R.id.recycle_view );
		layoutManager = new LinearLayoutManager( getActivity() );
		recyclerView.setLayoutManager( layoutManager );
		recyclerView.setHasFixedSize( true );
		allNotices = new ArrayList<>();
		mainDB = FirebaseDatabase.getInstance().getReference();

		getAllNotices();
		addNotice.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				FragmentAddPost addPost = FragmentAddPost.newInstance();
				addPost.show(getFragmentManager(),"");
			}
		});

       return view;
    }
	private void getAllNotices() {
		mainDB.child("0").child("Notices").addChildEventListener( new ChildEventListener() {
			@Override
			public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
				Notice newnotice = dataSnapshot.getValue(Notice.class);
				allNotices.add(newnotice);
				recycleAdapter = new NoticeRecycleAdapter(allNotices,getActivity());
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

}
