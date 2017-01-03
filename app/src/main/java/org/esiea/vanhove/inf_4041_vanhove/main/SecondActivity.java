package org.esiea.vanhove.inf_4041_vanhove.main;


import org.esiea.vanhove.inf_4041_vanhove.controls.Carousel;
import org.esiea.vanhove.inf_4041_vanhove.controls.CarouselAdapter;
import org.esiea.vanhove.inf_4041_vanhove.controls.CarouselAdapter.OnItemClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.esiea.vanhove.inf_4041_vanhove.R;

/**
 * Created by Frédéric Vanhove on 15/12/2016.
 */

public class SecondActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.page2);
        final Carousel carousel = (Carousel)findViewById(R.id.carousel);
        Log.i( "toto","test");
        Button myButtonD = (Button) findViewById(R.id.buttonD);
        Button myButtonG = (Button) findViewById(R.id.BoutonG);
        Button myButtonO = (Button) findViewById(R.id.buttonO);

        myButtonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carousel.setSelection(carousel.getSelectedItemPosition()-1);
            }
        });

        myButtonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carousel.setSelection(carousel.getSelectedItemPosition()+1);

            }
        });

        carousel.setOnItemClickListener(new OnItemClickListener(){

            public void onItemClick(CarouselAdapter<?> parent, View view,
                                    int position, long id) {

                Toast.makeText(SecondActivity.this,"La bière : "+position+" est selectionnée",
                        Toast.LENGTH_SHORT).show();
            }

        });

    }

}