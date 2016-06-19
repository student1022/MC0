package roumani.mobile.mc0;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EntryFormActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_form);
    }

    public void onPayButtonClick(View v)
    {
        String p = ((EditText) findViewById(R.id.pinput)).getText().toString();
        String a = ((EditText) findViewById(R.id.ainput)).getText().toString();
        String i = ((EditText) findViewById(R.id.pinput)).getText().toString();
        Mortgage m = new Mortgage(p, a, i);
        ((TextView) findViewById(R.id.result)).setText(m.getPaymentString());
    }
}
