package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String u = extras.getString(BundleActivity.USERNAME_KEY);
            String n = extras.getString(BundleActivity.NAME_KEY);
            int a = extras.getInt(BundleActivity.AGE_KEY);

            usernameText.setText(u);
            nameText.setText(n);
            ageText.setText(a+"");
            // TODO: display value here
        }
    }
}
