package org.example.keyboardialphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText_main);
        if(editText != null)
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView textView, int actionId, KeyEvent event) {
                    boolean handled = false;
                    if (actionId == EditorInfo.IME_ACTION_SEND){
                        dialNumber();
                        handled = true;
                    }
                    return handled;
                }
            });
    }

    private void dialNumber(){
        EditText editText = findViewById(R.id.editText_main);
        String phoneNum = null;
        // If the editText field is not null.
        // concatenate "tel: " with the phone number string
        if (editText != null) phoneNum = "tel:"+ editText.getText().toString();
        // Optional: log the concatenated phone number for dialing.
        Log.d("dialNumber: ","phoneNum");
        // Specify the intent
        Intent intent = new Intent(Intent.ACTION_DIAL);
        // Set the data fpr the intent as the phone number
        intent.setData(Uri.parse(phoneNum));
        // If the intent resolves to a package (app)
        // start the activity with the intent
        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }else{
            Log.d("ImplicitIntents", "Can't handle this!");
        }
    }
}