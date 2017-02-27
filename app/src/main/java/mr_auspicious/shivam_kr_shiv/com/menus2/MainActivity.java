package mr_auspicious.shivam_kr_shiv.com.menus2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu); //Inflating the menu layout
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){

            case R.id.option1:
                Toast.makeText(getBaseContext(),"Computer Mode On",Toast.LENGTH_LONG).show(); //display the toast
                return true;

            case R.id.option2:
                Toast.makeText(getBaseContext(),"Camera Mode On",Toast.LENGTH_LONG).show(); //display the toast
                return true;

            case R.id.option3:
                Toast.makeText(getBaseContext(),"Gamepad Mode On",Toast.LENGTH_LONG).show(); //display the toast
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
