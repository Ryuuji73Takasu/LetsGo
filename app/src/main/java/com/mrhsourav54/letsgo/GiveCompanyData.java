package com.mrhsourav54.letsgo;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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

    private RadioGroup rdogp;
    private RadioButton btnRdo;

    String planet;

    String f,c,r,ad,p,raddio;
    int radio;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_company_data);


       // spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        txtFullName = findViewById(R.id.fullnameID);
        txtCompanyName = findViewById(R.id.companynameID);
        txtRegistrationID = findViewById(R.id.registrationID);
        txtAddress = findViewById(R.id.addressID);
        txtPhoneNumber = findViewById(R.id.phonenoID);
        btnSubmit = findViewById(R.id.submitID);
        refDatabase  = FirebaseDatabase.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();


        //rdogp = findViewById(R.id.radiogpid);



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

        planet = spinner.getSelectedItem().toString();

        f = txtFullName.getText().toString();
        c = txtCompanyName.getText().toString();
        r = txtRegistrationID.getText().toString();
        ad = txtAddress.getText().toString();
        p = txtPhoneNumber.getText().toString();
        radio = rdogp.getCheckedRadioButtonId();
        btnRdo = findViewById(radio);
        raddio = btnRdo.getText().toString();

    }

    private void createStudent() {
        student = new StudentInfo(f,c,r,ad,p,raddio);
    }

}

