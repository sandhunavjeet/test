package com.example.screamitus_android;import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import android.support.test.rule.ActivityTestRule;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class MainActivityEspressoTest {
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