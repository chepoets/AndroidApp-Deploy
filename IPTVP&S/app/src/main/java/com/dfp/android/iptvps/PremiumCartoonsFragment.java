package com.dfp.android.iptvps;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PremiumCartoonsFragment extends Fragment {

    private AdView adView;
    private static final String AD_UNIT_ID = "ca-app-pub-5054428822227599/3844195469";
    private static final String DEVICE_ID = "YOUR DEVICE HASH ID";


    public PremiumCartoonsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_premium_cartoons, container, false);

        adView = new AdView(getActivity());
        adView.setAdUnitId("ca-app-pub-5054428822227599/3844195469");
        adView.setAdSize(AdSize.BANNER);
        LinearLayout layout =  (LinearLayout)rootView.findViewById(R.id.adView);
        layout.addView(adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        return rootView;

    }

}
