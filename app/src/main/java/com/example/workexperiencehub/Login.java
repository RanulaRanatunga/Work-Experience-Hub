package com.example.workexperiencehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private Button Login;

    //private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email.findViewById(R.id.txt_email);
        password.findViewById(R.id.txt_password);
        Login.findViewById(R.id.btn_login);

//        auth = FirebaseAuth.getInstance();
//
//        Login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String txt_email = email.getText().toString();
//                String txt_password = password.getText().toString();
//                loginUser(txt_email ,txt_password);
//            }
//        });

    }

//    private void loginUser(String email, String password) {
//
//        auth.signInWithEmailAndPassword(email ,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
//            @Override
//            public void onSuccess(AuthResult authResult) {
//                Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(Login.this ,MainActivity.class));
//                finish();
//            }
//        });
//    }

}
