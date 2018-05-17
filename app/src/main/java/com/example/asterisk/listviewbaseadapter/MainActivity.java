package com.example.asterisk.listviewbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] name={"Abc","Bcd","Cde","Def","Efg","Fgh","Ghi","Hij","Ijk","Klm"};
    String[] address={"Kathmandu","Bhaktapur","Lalitpur","Kirtipur","Pokhara","Thimi","Bode","Nagadesh","Tigani","Gakhu"};
    String[] phone={"0161","0162","0163","0164","0165","0166","0167","0168","0169","016"};
    String[] symbolno={"111","121","212","222","313","323","333","414","424","444"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        lv.setAdapter(new MyAdapter(MainActivity.this,name,address,phone,symbolno));
    }
}
