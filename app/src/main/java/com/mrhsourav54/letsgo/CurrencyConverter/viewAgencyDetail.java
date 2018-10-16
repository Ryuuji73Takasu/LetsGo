package com.mrhsourav54.letsgo.CurrencyConverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.mrhsourav54.letsgo.R;

import java.util.ArrayList;

public class viewAgencyDetail extends AppCompatActivity {

    //private ListView lstView;
    private ListView studentListView;
    private ArrayList<StudentInfo> allStudent;
    private DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_agency_detail);

        //lstView = findViewById(R.id.listviewID);

        studentListView = findViewById(R.id.listviewID);
        allStudent = new ArrayList<>();
        databaseReference= FirebaseDatabase.getInstance().getReference();
        getAlldataFromDB();


    }

    private void getAlldataFromDB() {
        databaseReference.addValueEventListener(new ValueEventListener()
        {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                for (DataSnapshot data: dataSnapshot.getChildren())
                {
                    StudentInfo value = data.getValue(StudentInfo.class);
                    allStudent.add(value);
                }
                ItemStudentAdapter studentAdapter = new ItemStudentAdapter(viewAgencyDetail.this, allStudent);
                studentListView.setAdapter(studentAdapter);
            }
            @Override public void onCancelled(DatabaseError error)
            {
                Log.w("aa", "Failed to read value.", error.toException());
            }
        });


    }
}
