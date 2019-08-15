package id.smkn4.pwpb.mamanggojek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultGoFoodActivity extends AppCompatActivity {

    public static String NAMA ="default_nama";
    public static String ALAMAT ="default_alamat";
    public static String PESANAN ="default_pesanan";
    TextView tvRNama;
    TextView tvRAlamat;
    TextView tvRPesan;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_go_food);
        tvRNama = (TextView)findViewById(R.id.tvRNama);
        tvRAlamat = (TextView)findViewById(R.id.tvRAlamat);
        tvRPesan = (TextView)findViewById(R.id.tvRPesan);
        String name = getIntent().getStringExtra(NAMA);
        String address = getIntent().getStringExtra(ALAMAT);
        String food = getIntent().getStringExtra(PESANAN);
        tvRNama.setText(name);
        tvRAlamat.setText(address);
        tvRPesan.setText(food);
        btnCancel = (Button)findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancel = new Intent(ResultGoFoodActivity.this, MainActivity.class);
                startActivity(cancel);
            }
        });
    }
}
