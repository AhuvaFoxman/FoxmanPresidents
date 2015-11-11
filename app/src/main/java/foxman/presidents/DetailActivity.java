package foxman.presidents;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;


public class DetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        President[] presidents = (President[]) getIntent().getSerializableExtra("PRESIDENTS");
        int[] presidentImages = new int[] { R.drawable.georgewashington, R.drawable.johnadams, R.drawable.thomasjefferson,
                R.drawable.jamesmadison, R.drawable.jamesmonroe, R.drawable.johnquincyadams, R.drawable.andrewjackson,
                R.drawable.martinvanburen, R.drawable. williamhenryharrison, R.drawable.johntyler, R.drawable.jameskpolk,
                R.drawable.zacharytaylor, R.drawable.millardfillmore, R.drawable.franklinpierce, R.drawable.jamesbuchanan,
                R.drawable.abrahamlincoln, R.drawable.andrewjohnson, R.drawable.ulyssessgrant, R.drawable.rutherfordbhayes,
                R.drawable.jamesagarfield, R.drawable.chesteraarthur, R.drawable.grovercleveland, R.drawable.benjaminharrison,
                R.drawable.grovercleveland, R.drawable.williammckinley, R.drawable.theodoreroosevelt, R.drawable.williamhowardtaft,
                R.drawable.woodrowwilson, R.drawable.warrengharding, R.drawable.calvincoolidge, R.drawable.herberthoover,
                R.drawable.franklindroosevelt,R.drawable.harrystruman, R.drawable.dwightdeisenhower,R.drawable.johnfkennedy,
                R.drawable.lyndonbjohnson,R.drawable.richardmnixon, R.drawable.geraldrford, R.drawable.jimmycarter, R.drawable.ronaldreagan,
                R.drawable.georgebush, R.drawable.billclinton, R.drawable.georgewbush, R.drawable.barackobama};

        PresidentPagerAdapter adapter = new PresidentPagerAdapter(presidents,presidentImages);
        viewPager.setAdapter(adapter);

        int position = getIntent().getIntExtra("POSITION",0);
        viewPager.setCurrentItem(position);
    }
}
