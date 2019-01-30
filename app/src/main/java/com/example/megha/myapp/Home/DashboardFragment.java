package com.example.megha.myapp.Home;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toolbar;;
import com.example.megha.myapp.Operation_link_pages.DetailedPerformanceActivity;
import com.example.megha.myapp.Dasshboard_link_pages.BalanceDetailsActivity;
import com.example.megha.myapp.R;

import java.util.ArrayList;
import java.util.List;


public class DashboardFragment extends Fragment implements View.OnClickListener{
    Button button;
    TextView textView;
    FrameLayout simpleFrameLayout;
    TabLayout tabLayout;

    public static DashboardFragment newInstance() {
        DashboardFragment fragment = new DashboardFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        TabLayout tabs = (TabLayout) view.findViewById(R.id.result_tabs);
        tabs.setupWithViewPager(viewPager);

        button = (Button) view.findViewById(R.id.button1);
        button.setOnClickListener(this);

        textView = (TextView) view.findViewById(R.id.text_view);
        textView.setOnClickListener(this);

        return view;

    }
    private void setupViewPager(ViewPager viewPager) {


        Adapter adapter = new Adapter(getChildFragmentManager());
        adapter.addFragment(new TodaysFixturesFragment(), "Today");
        adapter.addFragment(new OffRouteFixturesFragment(), " Off Route");
        viewPager.setAdapter(adapter);



    }

    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public Adapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Intent intent = new Intent(getActivity(), DetailedPerformanceActivity.class);
                startActivity(intent);
                break;
            case R.id.text_view:
                Intent intent1 = new Intent(getActivity(), BalanceDetailsActivity.class);
                startActivity(intent1);
                break;
        }
    }

}