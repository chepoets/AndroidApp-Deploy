package com.dfp.android.iptvps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.ToolBar);
        setSupportActionBar(toolbar);
        tabLayout =(TabLayout) findViewById(R.id.TabLayout);
        viewPager = (ViewPager) findViewById(R.id.ViewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Free Channels
        viewPagerAdapter.AddFragment(new RaiFragment(),"Rai");
        viewPagerAdapter.AddFragment(new CanaliRegionaliFragment(),"Other Channel");
        viewPagerAdapter.AddFragment(new CartoonFragment(),"Cartoons");
        viewPagerAdapter.AddFragment(new OtherChannelsFragment(),"Mediaset");

        //Premium Channels
        viewPagerAdapter.AddFragment(new PremiumCinemaFragment(),"Premium Cinema");
        viewPagerAdapter.AddFragment(new PremiumSportFragment(),"Premium Sport");
        viewPagerAdapter.AddFragment(new PremiumCartoonsFragment(),"Premium Calcio");
        viewPagerAdapter.AddFragment(new premium_cartoon_fragment(),"Premium Cartoons");

        //Sky Channels
        viewPagerAdapter.AddFragment(new SkyCinemaFragment(),"Sky Cinema");
        viewPagerAdapter.AddFragment(new SkySportFragment(),"Sky Sport");
        viewPagerAdapter.AddFragment(new SkyChannelsFragment(),"Sky Calcio");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);



    }

    //rai channels intent
    public void rai1(View view){
            String videoUrl = "http://www.q7t1.com:8000/live/sYKADDaJs2/SnoQc6v4hZ/274.ts";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(videoUrl));
            startActivity(i);
    }
    public void rai2(View view){
        String videoUrl = "http://www.q7t1.com:8000/live/sYKADDaJs2/SnoQc6v4hZ/275.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void rai3(View view){
        String videoUrl = "http://www.q7t1.com:8000/live/sYKADDaJs2/SnoQc6v4hZ/276.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void rai4(View view){
        String videoUrl = "http://www.q7t1.com:8000/live/sYKADDaJs2/SnoQc6v4hZ/1292.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void raisport1(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/615.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void raisport2(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/632.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void rainews24(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/544.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void raisenato(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/581.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }


    //other channel
    public void dmax(View view){
        String videoUrl = "http://ksportiptv.com:1557/live/CANADA/7rzqQvpKsa/2023.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void la3(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/555.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void la7(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/618.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void nuvolari(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/547.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void giallo(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/585.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void mtv8(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/682.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void realtime(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/609.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void cielo(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/679.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    //cartoon fragment
    public void raigulp(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/545.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void boing(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/631.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void raiyoyo(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/542.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void cartoonito(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/565.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void superchannel(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/541.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void k2(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/557.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }


    //mediaset Channel
    public void rete4(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/674.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void canale5(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/680.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void italia1(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/619.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void italia2(View view){
        String videoUrl = "http://live3.msf.ticdn.it/Content/HLS/Live/Channel(CH05HA)/Stream(04)/index.m3u8";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void iris(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/620.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void la5(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/637.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void topcrime(View view){
        String videoUrl = "http://live3.msf.ticdn.it/Content/HLS/Live/Channel(CH07HA)/Stream(04)/index.m3u8";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void mediasetextra(View view){
        String videoUrl = "http://www.q7t1.com:8000/live/sYKADDaJs2/SnoQc6v4hZ/1017.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    //premium cinema
    public void premiumcinemahd(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/657.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumcinema2hd(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/658.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumcinema24(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/647.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumcinema224(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/911.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void premiumaction(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/646.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void premiumjoi(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/643.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void premiumcrimehd(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/655.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void premiumenergy(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/650.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void premiumcomedy(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/656.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void premiumcinemaemotion(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/651.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void premiumstories(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/1248.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    public void premiumstudiouniversal(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/660.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    //premium sport
    public void premiumsport(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/616.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumsport2(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/1176.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumeurosport1(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/645.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumeurosport2(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/644.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    //premium calcio
    public void premiumcalcio(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/662.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumcalcio1(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/661.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumcalcio2(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/649.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumcalcio3(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/648.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumcalcio4(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/894.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumcalcio5(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/895.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumcalcio6(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/896.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumcalcio7(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/1247.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    //premium cartoon
    public void premiumdisneychannel(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/653.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void premiumcartoonnetwork(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/659.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    //sky cinema
    public void skycinema1hd(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/601.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skycinemamax(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/678.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skycinema24(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/905.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skycinemapassion(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/602.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skycinemafamilyhd(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/603.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skycinemacomedy(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/604.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skycinemacult(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/639.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skycinemaclassic(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/600.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skyatlantichd(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/580.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skycinema3d(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/1163.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skyuno(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/640.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    //sky sport
    public void skysport1hd(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/591.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skysport2hd(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/592.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skysport3hd(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/593.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skysport24hd(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/595.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skysportf1hd(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/594.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }
    public void skysportplushd(View view){
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/685.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

    //sky super calcio
    public void skysupercalcio(View view) throws IOException {
        String videoUrl = "http://178.33.226.36:8000/live/olsi/olsi/642.ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(videoUrl));
        startActivity(i);
    }

}
