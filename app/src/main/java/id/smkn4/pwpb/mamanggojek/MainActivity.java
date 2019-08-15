package id.smkn4.pwpb.mamanggojek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView goFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goFood = (ImageView)findViewById(R.id.goFood);
        goFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toGoFood = new Intent(MainActivity.this, GoFoodActivity.class);
                startActivity(toGoFood);
            }
        });
    }
}
