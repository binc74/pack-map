package edu.osu.cse5236.group10.packmap;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;


public class MapsActivity extends FragmentActivity {
    private FloatingActionButton mAddButton;
    private String mGroupId;
    private String mActivityId;
    private String userId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        mGroupId=this.getIntent().getStringExtra("groupId");
        mActivityId=this.getIntent().getStringExtra("activityId");
        userId=this.getIntent().getStringExtra("userId");

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.map_fragment_container);

        if (fragment == null) {
            fragment = new MapFragment();
            fm.beginTransaction()
                    .add(R.id.map_fragment_container, fragment)
                    .commit();
        }


        mAddButton = findViewById(R.id.add_fab);
        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAddButton.hide();
                Intent intent = new Intent(MapsActivity.this, CreateGroupActivity.class);
                //intent.putExtra("userId", mPhoneNum);
                startActivity(intent);
            }
        });
    }




}
