package com.example.screamitus_android;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityEspressoTest {


    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void ensureTextChangesWork() {
        // hidden result label
        Espresso.onView(withId(R.id.resultsLabel))
                .check(matches(withEffectiveVisibility(Visibility.INVISIBLE)));
        Espresso.onView(withId(R.id.daysTextBox))
                .check(matches(withEffectiveVisibility(Visibility.VISIBLE)));
        // Button
        Espresso.onView(withText("Calculate"))
                .check(matches(withEffectiveVisibility(Visibility.VISIBLE)));

    }
}

}

