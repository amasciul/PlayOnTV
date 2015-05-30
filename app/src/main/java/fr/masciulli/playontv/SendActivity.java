package fr.masciulli.playontv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!getIntent().getAction().equals(Intent.ACTION_VIEW)) {
            throw new IllegalStateException("Intent is not ACTION_VIEW");
        }

        Toast.makeText(this, "intent received ! data : " + getIntent().getDataString(), Toast.LENGTH_LONG).show();

        //TODO send url to TV
    }
}
