package com.sopheap.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // បង្កើត TextView តាមរយៈកូដ Java (មិនបាច់ប្រើ XML layout ក៏បាន)
        TextView textView = new TextView(this);
        
        // កំណត់អត្ថបទបង្ហាញ
        textView.setText("សួស្តី Sopheap!\nនេះគឺជា App ដែល Build ជោគជ័យលើ GitHub");
        
        // កំណត់ទំហំអក្សរ និងពណ៌
        textView.setTextSize(24);
        textView.setTextColor(Color.BLUE);
        
        // កំណត់ឱ្យអក្សរនៅចំកណ្តាលអេក្រង់
        textView.setGravity(Gravity.CENTER);
        
        // បង្ហាញ TextView លើអេក្រង់
        setContentView(textView);
    }
}

