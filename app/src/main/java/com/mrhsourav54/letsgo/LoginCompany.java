package com.mrhsourav54.letsgo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginCompany extends AppCompatActivity {

    private Button btnCreateAccount;
    private Button btnLogin;
    private EditText txtUserName;
    private EditText txtPassword;

    private FirebaseAuth mAuth;
    private ProgressDialog progressDialog;
    private String email, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_company);

        btnCreateAccount = findViewById(R.id.createaccountID);
        txtUserName = findViewById(R.id.usernameID);
        txtPassword = findViewById(R.id.passwordID);
        btnLogin = findViewById(R.id.loginID);

        mAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
                Intent intent = new Intent(LoginCompany.this,GiveCompanyData.class);
                startActivity(intent);
            }
        });


        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();

                //Intent intent = new Intent(LoginCompany.this,GiveCompanyData.class);
                //startActivity(intent);
            }
        });
    }

    void createAccount() {


            email = txtUserName.getText().toString().trim();
            password = txtPassword.getText().toString().trim();
            if(!email.isEmpty() && !password.isEmpty())
            {
                progressDialog.setMessage("Please wait!!!");
            }
            progressDialog.show();
            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
            {
                @Override public void onComplete(@NonNull Task<AuthResult> task)
                {
                    if (task.isSuccessful())
                    {
                        FirebaseUser user = mAuth.getCurrentUser();
                        //Toast.makeText(LoginCompany.this, "", Toast.LENGTH_SHORT).show();
                        Toast.makeText(getApplicationContext(), " Your Account Has Been Successfully Created,Log in Now", Toast.LENGTH_SHORT).show();
                    }
                    else{ Toast.makeText(LoginCompany.this, "Failed to create Account",Toast.LENGTH_SHORT).show();
                    }
                    progressDialog.dismiss();
                }
            });

    }

    void signIn()
    {

            email = txtUserName.getText().toString().trim();
            password = txtPassword.getText().toString().trim();
            progressDialog.setMessage("Please wait!!!");
            progressDialog.show();
            mAuth.signInWithEmailAndPassword(email, password) .addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
            {
                @Override public void onComplete(@NonNull Task<AuthResult> task)
                {
                    if (task.isSuccessful())
                    {
                        FirebaseUser user = mAuth.getCurrentUser();
                        Toast.makeText(getApplicationContext(),"LogInSuccess",Toast.LENGTH_SHORT).show();
                    }else
                    {
                        Toast.makeText(LoginCompany.this,"Auth failed",Toast.LENGTH_SHORT).show();
                    }
                    progressDialog.dismiss();
                }
            });
        }

}
