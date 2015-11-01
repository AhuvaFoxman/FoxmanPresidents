package foxman.presidents;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class DetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ViewPager veiwPager = (ViewPager) findViewById(R.id.viewPager);
        PresidentPagerAdapter adapter = new PresidentPagerAdapter(MainActivity.presidents);
        veiwPager.setAdapter(adapter);
    }
}
