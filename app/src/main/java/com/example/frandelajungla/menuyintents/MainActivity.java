package com.example.frandelajungla.menuyintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private TextView editText;
    private Button send_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (TextView) findViewById(R.id.text_to_send);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Log.v("Message", "Botón Pulsado OK");
        New_Activity ();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.new_game:
                editText.setText("@string/new_game");
                return true;
            case R.id.help:
                editText.setText("@string/help");
                return true;
            case R.id.activity:
                editText.setText("@string/activity");
                New_Activity ();
                return true;
            case R.id.service:
                editText.setText("@string/service");
                New_Service();
                return true;
            case R.id.broadcast:
                editText.setText("@string/broadcast");
                New_Broadcast();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    void New_Activity ()
    {
        Intent new_activity = new Intent(this, Main2Activity.class);
        String message = editText.getText().toString();
        new_activity.putExtra(EXTRA_MESSAGE, message);
        startActivity(new_activity);
    }

    void New_Service ()
    {

    }

    void New_Broadcast ()
    {

    }
}
