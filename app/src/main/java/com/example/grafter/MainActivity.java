package com.example.grafter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView Error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.textUsername);
        Password = (EditText)findViewById(R.id.textPassword);
        Login = (Button)findViewById(R.id.loginButton);
        Error = (TextView)findViewById(R.id.wrongPassword);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }



    private void validate (String userName, String userPassword){
        if ((userName.equals("Admin")) && (userPassword.equals("Password"))) {
            Intent intent = new Intent (MainActivity.this, HomeActivity.class);
            startActivity(intent);
        }else{
            Error.setVisibility(View.VISIBLE);
        }
    }
}
