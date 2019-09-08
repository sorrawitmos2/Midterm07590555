package th.ac.su.sc.midterm07590555;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Toast.makeText(this, "Welcome Sorrawit Thanasomboonpan", Toast.LENGTH_SHORT).show();
    }
}
