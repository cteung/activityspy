package edu.washington.cteung.activityspy;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Greetings UW!", Toast.LENGTH_LONG).show();
        Log.i("MainActivity", "onCreate event fired");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(),"Greetings UW!", Toast.LENGTH_LONG).show();
        Log.i("MainActivity", "onStart() event fired");
    }

    public void onRestart()
    {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"Greetings UW!", Toast.LENGTH_LONG).show();
        Log.i("MainActivity", "onRestart() event fired");
    }

    public void onResume()
    {
        super.onResume();
        Log.i("MainActivity", "onResume() event fired");
    }

    public void onPause()
    {
        super.onPause();
        Log.i("MainActivity", "onPause() event fired");
    }

    public void onStop()
    {
        super.onStop();
        Log.i("MainActivity", "onStop() event fired");
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i("MainActivity", "onDestroy() event fired");
        Log.e("MainActivity", "We’re going down, Captain!");
    }
}
