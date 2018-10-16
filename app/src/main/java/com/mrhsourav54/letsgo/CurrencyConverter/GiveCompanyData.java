package com.mrhsourav54.letsgo.CurrencyConverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mrhsourav54.letsgo.R;

public class GiveCompanyData extends AppCompatActivity {

    private EditText txtFullName;
    private EditText txtCompanyName;

    private EditText txtRegistrationID;
    private EditText txtAddress;
    private EditText txtPhoneNumber;
    private Button btnSubmit;
    private DatabaseReference refDatabase;
    private FirebaseAuth mAuth;
    private StudentInfo student;



    String f,c,r,ad,p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_company_data);

        txtFullName = findViewById(R.id.fullnameID);
        txtCompanyName = findViewById(R.id.companynameID);
        txtRegistrationID = findViewById(R.id.registrationID);
        txtAddress = findViewById(R.id.addressID);
        txtPhoneNumber = findViewById(R.id.phonenoID);
        btnSubmit = findViewById(R.id.submitID);
        refDatabase  = FirebaseDatabase.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getAllInputData();
                createStudent();

                FirebaseUser user = mAuth.getCurrentUser();

                refDatabase.child(user.getUid()).setValue(student);
                //createAccountAndSaveInfo();
            }

        });

    }

    private void getAllInputData() {

        f = txtFullName.getText().toString();
        c = txtCompanyName.getText().toString();
        r = txtRegistrationID.getText().toString();
        ad = txtAddress.getText().toString();
        p = txtPhoneNumber.getText().toString();


    }

    private void createStudent() {
        student = new StudentInfo(f,c,r,ad,p);
    }

}