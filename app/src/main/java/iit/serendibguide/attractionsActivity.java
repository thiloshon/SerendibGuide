package iit.serendibguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class attractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);
    }

    //Sigiriya button action method
    public void switchToSigiriya(View view)
    {
        Intent intent = new Intent(attractionsActivity.this, splashScreen.class);
        startActivity(intent);
    }

}
