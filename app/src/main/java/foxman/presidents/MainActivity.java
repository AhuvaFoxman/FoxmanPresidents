package foxman.presidents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation((LinearLayoutManager.VERTICAL));
        recyclerView.setLayoutManager(layoutManager);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        InputStream in = getResources().openRawResource(R.raw.presidents);

         President[] presidents =
                gson.fromJson(new InputStreamReader(in), President[].class);
         int[] presidentImages = new int[] { R.drawable.georgewashington, R.drawable.johnadams, R.drawable.thomasjefferson,
                R.drawable.jamesmadison, R.drawable.jamesmonroe, R.drawable.johnquincyadams, R.drawable.andrewjackson,
                R.drawable.martinvanburen, R.drawable. williamhenryharrison, R.drawable.johntyler, R.drawable.jameskpolk,
                R.drawable.zacharytaylor, R.drawable.millardfillmore, R.drawable.franklinpierce, R.drawable.jamesbuchanan,
                R.drawable.abrahamlincoln, R.drawable.andrewjohnson, R.drawable.ulyssessgrant, R.drawable.rutherfordbhayes,
                R.drawable.jamesagarfield, R.drawable.chesteraarthur, R.drawable.grovercleveland, R.drawable.benjaminharrison,
                R.drawable.williammckinley, R.drawable.theodoreroosevelt, R.drawable.williamhowardtaft, R.drawable.woodrowwilson,
                R.drawable.warrengharding, R.drawable.calvincoolidge, R.drawable.herberthoover, R.drawable.franklindroosevelt,
                R.drawable.harrystruman, R.drawable.dwightdeisenhower,R.drawable.johnfkennedy, R.drawable.lyndonbjohnson,
                R.drawable.richardmnixon, R.drawable.geraldrford, R.drawable.jimmycarter, R.drawable.ronaldreagan,
                R.drawable.georgebush, R.drawable.billclinton, R.drawable.georgewbush, R.drawable.barackobama};
        PresidentRecyclerViewAdapter adapter = new PresidentRecyclerViewAdapter(presidents);
        recyclerView.setAdapter(adapter);
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
}
