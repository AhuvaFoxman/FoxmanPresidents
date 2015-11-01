package foxman.presidents;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static foxman.presidents.R.*;


public class PresidentPagerAdapter extends PagerAdapter{

    private Presidents[] presidents;

    public PresidentPagerAdapter(Presidents[] presidents) {
        this.presidents = presidents;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

       LayoutInflater inflator = LayoutInflater.from(container.getContext());
        View view = inflator.inflate(R.layout.president_pager_item, null);

        TextView name = (TextView) view.findViewById(id.name);
        TextView number = (TextView) view.findViewById(id.number);
        TextView birthYear = (TextView) view.findViewById(id.birth);
        TextView deathYear = (TextView) view.findViewById(id.death);
        TextView tookOffice = (TextView) view.findViewById(id.tookOffice);
        TextView leftOffice = (TextView) view.findViewById(id.leftOffice);
        TextView party = (TextView) view.findViewById(id.party);

        Presidents president = presidents[position];
        name.setText("President's Name: " + president.getPresident());
        number.setText("Number: " + String.valueOf(president.getNumber()));
        birthYear.setText("Year of Birth" + (String.valueOf(president.getBirthYear())));
        deathYear.setText("Year of Death" + (String.valueOf(president.getDeathYear())));
        tookOffice.setText("Took Office: " + president.getTookOffice());
        leftOffice.setText("Left Office: " + president.getLeftOffice());
        party.setText("Party: " + (president.getParty()));
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
