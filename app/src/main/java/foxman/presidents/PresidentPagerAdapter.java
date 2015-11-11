package foxman.presidents;

import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static foxman.presidents.R.*;


public class PresidentPagerAdapter extends PagerAdapter{

    private President[] presidents;
    private int[] presidentImages;

    public PresidentPagerAdapter(President[] presidents, int[] presidentImages) {
        this.presidents = presidents;
        this.presidentImages = presidentImages;
    }


    public Object instantiateItem(ViewGroup container, int position) {



       LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View view = inflater.inflate(R.layout.president_pager_item, null);

        TextView name = (TextView) view.findViewById(id.name);
        TextView number = (TextView) view.findViewById(id.number);
        TextView birthYear = (TextView) view.findViewById(id.birthdeath);
        TextView tookOffice = (TextView) view.findViewById(id.tookOfficeleftOffice);
        TextView party = (TextView) view.findViewById(id.party);
        ImageView image = (ImageView) view.findViewById(id.image);
        image.setImageResource(presidentImages[position]);

        President president = presidents[position];


        name.setTextColor(Color.BLUE);
        name.setText(president.getPresident());
        number.setTextColor(Color.CYAN);
        number.setText(String.valueOf(president.getNumber()));
        birthYear.setTextColor(Color.YELLOW);
        birthYear.setText((String.valueOf(president.getBirthYear())));
        tookOffice.setTextColor(Color.GREEN);
        tookOffice.setText(president.getTookOffice());
        party.setTextColor(Color.RED);
        party.setText((president.getParty()));
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return presidents.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


}
