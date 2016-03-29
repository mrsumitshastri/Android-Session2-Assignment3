package helloworld.iconikindia.com.android_session2_assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtCardBal;
    EditText txtRate;
    EditText txtMinPay;
    EditText txtFinalBal;
    EditText txtMonthRemaining;
    EditText txtPaidAmt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCardBal = (EditText)findViewById(R.id.txtCardBal);
        txtRate = (EditText)findViewById(R.id.txtRate);
        txtMinPay = (EditText)findViewById(R.id.txtMinPay);
        txtFinalBal = (EditText)findViewById(R.id.txtFinalBal);
        txtMonthRemaining = (EditText)findViewById(R.id.txtMonthRemaining);
        txtPaidAmt = (EditText)findViewById(R.id.txtPaidAmt);
    }


    public void btnClearClicked(View v)
    {

        txtCardBal.setText("");
        txtRate.setText("");
        txtMinPay.setText("");
        txtFinalBal.setText("");
        txtMonthRemaining.setText("");
        txtPaidAmt.setText("");

        Toast.makeText(this, "ClearClicked", Toast.LENGTH_SHORT).show();
    }
    public void btnComputeClicked(View v)
    {
        Toast.makeText(this,"Compute",Toast.LENGTH_SHORT).show();
    }
}
