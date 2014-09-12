package com.hercules.herculesathletics;

import android.app.Activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**public class CustomFontActivity extends MainActivity {
	private TextView textView1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textView1 = (TextView) findViewById(R.id.textView1);
        
        // Create font
        Typeface capsuula = Typeface.createFromAsset(getAssets(), getString(R.string.typeface_capsuula));
        textView1.setTypeface(capsuula);
    }
}**/

public class CustomFontActivity extends MainActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        initTypeface();    
    }
    
    private void initTypeface(){
    	Typeface capsuula = Typeface.createFromAsset(getAssets(),"fonts/capsuula.ttf");
    	TextView  textView1=(TextView) findViewById(R.id.textView1);
    	textView1.setTypeface(capsuula);
    }
}