package id.smkn4.pwpb.mamanggojek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GoFoodActivity extends AppCompatActivity {

    Button btnOrder;
    EditText edtNama;
    EditText edtAlamat;
    EditText edtPesan;
    String nama;
    String alamat;
    String pesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);

        edtNama = (EditText)findViewById(R.id.edtNama);
        edtAlamat = (EditText)findViewById(R.id.edtAlamat);
        edtPesan = (EditText)findViewById(R.id.edtPesan);
        btnOrder = (Button) findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ambilData();
                Intent toResult = new Intent(GoFoodActivity.this, ResultGoFoodActivity.class);
                toResult.putExtra(ResultGoFoodActivity.NAMA, nama);
                toResult.putExtra(ResultGoFoodActivity.ALAMAT, alamat);
                toResult.putExtra(ResultGoFoodActivity.PESANAN, pesanan);
                startActivity(toResult);
            }
        });

    }

    public void ambilData() {
        nama = edtNama.getText().toString();
        alamat = edtAlamat.getText().toString();
        pesanan = edtPesan.getText().toString();

    }
}
