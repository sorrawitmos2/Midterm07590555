package th.ac.su.sc.midterm07590555;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import th.ac.su.sc.midterm07590555.model.Auth;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText usernameEditText = findViewById(R.id.Username);
                EditText passwordEditText = findViewById(R.id.Password);
                String inputUsername = usernameEditText.getText().toString();
                String inputPassword = passwordEditText.getText().toString();



                Auth auth = new Auth(inputUsername, inputPassword);
                int result = auth.checkUsernameAndPassword();

                if(result == 1){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra(inputUsername,inputPassword);
                    startActivity(intent);

                }else if(result == 2){
                    Intent intent = new Intent(LoginActivity.this, Main2Activity.class);
                    intent.putExtra(inputUsername,inputPassword);
                    startActivity(intent);

                }else{
                    new AlertDialog.Builder(LoginActivity.this).setTitle("Error")
                            .setMessage("Invalid username or password").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //fill code when user click button OK

                        }

                    }).show();

                }






            }

    });
    }
}

