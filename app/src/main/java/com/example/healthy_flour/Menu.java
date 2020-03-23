package com.example.healthy_flour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
    GridView gridview;
    String[] flourname = {"Emerald pure chakki atta","Adi whole wheat atta","Organic sugar grain atta","Sankalp 100% nutrition","G.W husk gain atta","Bandhan pure fresh atta","panchakki chokar  atta","SagarAgro fullorganic atta","JUst Nuts balanced atta","Whole Wheat atta","Keto multigrain  fresh atta"};
    int[] flourimages={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10,R.drawable.image11};
    String[] tView1={"pack"+"\nSales Package"+"\nBrand"+"\nType"+"\nQuantity"+"\nOrganic"+"\nUsed For"+"\nManufactured By"+"\nIs perishable"+"\nDietary Prefances"+"/nBest before"+"\nSales Package"+"Mfg Date",
            "pack of"+"\nSales Package"+"\nBrand"+"\nType"+"\nQuantity"+"\nOrganic"+"\nUsed For"+"\nManufactured By"+"\nIs perishable"+"\nDietary Prefances"+"/nBest before"+"\nSales Package"+"Mfg Date",
            "pack of"+"\nSales Package"+"\nBrand"+"\nType"+"\nQuantity"+"\nOrganic"+"\nUsed For"+"\nManufactured By"+"\nIs perishable"+"\nDietary Prefances"+"/nBest before"+"\nSales Package"+"Mfg Date",
            "pack of"+"\nSales Package"+"\nBrand"+"\nType"+"\nQuantity"+"\nOrganic"+"\nUsed For"+"\nManufactured By"+"\nIs perishable"+"\nDietary Prefances"+"/nBest before"+"\nSales Package"+"Mfg Date",
            "pack of"+"\nSales Package"+"\nBrand"+"\nType"+"\nQuantity"+"\nOrganic"+"\nUsed For"+"\nManufactured By"+"\nIs perishable"+"\nDietary Prefances"+"/nBest before"+"\nSales Package"+"Mfg Date",
            "pack of"+"\nSales Package"+"\nBrand"+"\nType"+"\nQuantity"+"\nOrganic"+"\nUsed For"+"\nManufactured By"+"\nIs perishable"+"\nDietary Prefances"+"/nBest before"+"\nSales Package"+"Mfg Date",
            "pack of"+"\nSales Package"+"\nBrand"+"\nType"+"\nQuantity"+"\nOrganic"+"\nUsed For"+"\nManufactured By"+"\nIs perishable"+"\nDietary Prefances"+"/nBest before"+"\nSales Package"+"Mfg Date",
            "pack of"+"\nSales Package"+"\nBrand"+"\nType"+"\nQuantity"+"\nOrganic"+"\nUsed For"+"\nManufactured By"+"\nIs perishable"+"\nDietary Prefances"+"/nBest before"+"\nSales Package"+"Mfg Date",
            "pack of"+"\nSales Package"+"\nBrand"+"\nType"+"\nQuantity"+"\nOrganic"+"\nUsed For"+"\nManufactured By"+"\nIs perishable"+"\nDietary Prefances"+"/nBest before"+"\nSales Package"+"Mfg Date",
            "pack of"+"\nSales Package"+"\nBrand"+"\nType"+"\nQuantity"+"\nOrganic"+"\nUsed For"+"\nManufactured By"+"\nIs perishable"+"\nDietary Prefances"+"/nBest before"+"\nSales Package"+"Mfg Date",
            "pack of"+"\nSales Package"+"\nBrand"+"\nType"+"\nQuantity"+"\nOrganic"+"\nUsed For"+"\nManufactured By"+"\nIs perishable"+"\nDietary Prefances"+"/nBest before"+"\nSales Package"+"Mfg Date"};
    String[] tView2={"1"+"\n1"+"\nTWF"+"\nwhole wheat atta"+"\n10kg"+"\nYes"+"\nHome"+"\nTWF mills"+"\nNo"+"\nNo Preservaties No GMO No Added sugar,salt"+"\nWithin 4 weeks"+"\n1"+"\nAug 30",
            "1"+"\n1"+"\nOrganic"+"\nchakki atta"+"\n10kg"+"\nYes"+"\nHome"+"\nA.K mills"+"\nNo"+"\nNo Preservaties No GMO No Added sugar,salt"+"\nWithin 4 weeks"+"\n1"+"\nAug 30",
            "1"+"\n1"+"\nGanwal produts"+"\ndiabitic wheat atta"+"\n10kg"+"\nYes"+"\nHome"+"\nGangwal flour mills"+"\nNo"+"\nNo Preservaties No GMO No Added sugar,salt"+"\nWithin 4 weeks"+"\n1"+"\nAug 30",
            "1"+"\n1"+"\nPanchakki pro"+"\nFresh wheat atta"+"\n10kg"+"\nYes"+"\nHome"+"\npanchakki flour"+"\nNo"+"\nNo Preservaties No GMO No Added sugar,salt"+"\nWithin 4 weeks"+"\n1"+"\nAug 30",
            "1"+"\n1"+"\nJust Wheat"+"\nwhole wheat atta"+"\n10kg"+"\nYes"+"\nHome"+"\nJust Nuts productions"+"\nNo"+"\nNo Preservaties No GMO No Added sugar,salt"+"\nWithin 4 weeks"+"\n1"+"\nAug 30",
            "1"+"\n1"+"\nKeto atta"+"\nwhole wheat atta"+"\n10kg"+"\nYes"+"\nHome"+"\nKeto Kanpur mills"+"\nNo"+"\nNo Preservaties No GMO No Added sugar,salt"+"\nWithin 4 weeks"+"\n1"+"\nAug 30",
            "1"+"\n1"+"\nAdi produtions"+"\nwhole wheat atta"+"\n10kg"+"\nYes"+"\nHome"+"\nAdi annpurna mills"+"\nNo"+"\nNo Preservaties No GMO No Added sugar,salt"+"\nWithin 4 weeks"+"\n1"+"\nAug 30",
            "1"+"\n1"+"\nSankalp nutri"+"\nwhole wheat atta"+"\n10kg"+"\nYes"+"\nHome"+"\nSankalp mills"+"\nNo"+"\nNo Preservaties No GMO No Added sugar,salt"+"\nWithin 4 weeks"+"\n1"+"\nAug 30",
            "1"+"\n1"+"\nBandhan Bests"+"\nwhole wheat atta"+"\n10kg"+"\nYes"+"\nHome"+"\nBandhan bests mills"+"\nNo"+"\nNo Preservaties No GMO No Added sugar,salt"+"\nWithin 4 weeks"+"\n1"+"\nAug 30",
            "1"+"\n1"+"\nSagar  flours"+"\nwhole wheat atta"+"\n10kg"+"\nYes"+"\nHome"+"\nSagar sansar mills"+"\nNo"+"\nNo Preservaties No GMO No Added sugar,salt"+"\nWithin 4 weeks"+"\n1"+"\nAug 30",
            "1"+"\n1"+"\nVishal products"+"\nwhole wheat atta"+"\n10kg"+"\nYes"+"\nHome"+"\nV.A.I industry "+"\nNo"+"\nNo Preservaties No GMO No Added sugar,salt"+"\nWithin 4 weeks"+"\n1"+"\nAug 30"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        gridview=findViewById(R.id.gridview);

        CustomAdapter customAdapter = new CustomAdapter();
        gridview.setAdapter(customAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getApplicationContext(),GriditemActivity.class);
                intent.putExtra("name",flourname[i]);
                intent.putExtra("images",flourimages[i]);
                intent.putExtra("textView1",tView1[i]);
                intent.putExtra("textView2",tView2[i]);
                startActivity(intent);

            }
        });


    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return flourimages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
            View view2 = getLayoutInflater().inflate(R.layout.activity_griditem,null);

            TextView name = view1.findViewById(R.id.flour);
            ImageView image = view1.findViewById(R.id.images);
            TextView textView1=view2.findViewById(R.id.textView1);
            TextView textView2=view2.findViewById(R.id.textView2);

            name.setText(flourname[i]);
            image.setImageResource(flourimages[i]);
            textView1.setText(tView1[i]);
            textView2.setText(tView2[i]);

            return view1;



        }
    }
}
