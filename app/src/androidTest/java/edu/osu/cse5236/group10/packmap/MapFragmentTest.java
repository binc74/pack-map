package edu.osu.cse5236.group10.packmap;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomSheetBehavior;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnitRunner;
import android.view.MotionEvent;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import edu.osu.cse5236.group10.packmap.data.model.LocationInfo;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

public class MapFragmentTest extends AndroidJUnitRunner {

    private MapsActivity mMapActivity=null;
    private MapFragment mMapFragment;
    //widget
    private ConstraintLayout clContainder;
    private AutoCompleteTextView mSearchText;
    private BottomSheetBehavior bottomSheetBehavior;
    private TextView bottom_heading;
    private ImageView locateButton;
    private Button selectButton;

    @Rule
    public ActivityTestRule<MapsActivity> mapsActivityTestRule=new ActivityTestRule<MapsActivity>(MapsActivity.class);

    @Before
    public void setUp(){
        mMapActivity=mapsActivityTestRule.getActivity();
        clContainder=(ConstraintLayout) mMapActivity.findViewById(R.id.map_fragment_container);
        mMapFragment=new MapFragment();
        mMapActivity.getSupportFragmentManager().beginTransaction().add(clContainder.getId(),mMapFragment).commit();
    }

    @Test
    public void testPreconditions()
    {
        Assert.assertNotNull(mMapActivity);
        Assert.assertNotNull(mMapFragment);
        Assert.assertNotNull(clContainder);
    }

    @Test
    public void testUI(){
        System.out.println("Thread ID in testUI:" + Thread.currentThread().getId());
        getInstrumentation().waitForIdleSync();
        mMapActivity.runOnUiThread(new Runnable() {
            public void run() {
                System.out.println("Thread ID in TestUI.run:" + Thread.currentThread().getId());

                //mBoard.requestFocus();
                MotionEvent newMotionEvent = MotionEvent.obtain((long)1,
                        (long)1,
                        MotionEvent.ACTION_DOWN,
                        (float) 53.0,
                        (float) 53.0,
                        0);
                //mBoard.dispatchTouchEvent(newMotionEvent);
                //mMapFragment.scheduleAndroidsTurn();
                //assertEquals(mGameSessionFragment.getPlayCount(), 0);
            }
        });
    }

    @Test
    public void testLaunch(){


    }


}