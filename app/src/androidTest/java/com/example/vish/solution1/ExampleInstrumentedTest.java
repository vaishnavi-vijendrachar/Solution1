package com.example.vish.solution1;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.vish.solution1", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void TestTextview(){
        Espresso.onView(withId(R.id.display_item)).check(matches(not(withText(""))));
    }

    @Test
    public void TestViewPager(){
        Espresso.onView(withId(R.id.pager)).perform(swipeLeft());

        //Espresso.onView(withId(R.id.scroll)).perform(scrollTo(), click());
         }

    @Test
    public void TestButton(){
        Espresso.onView(allOf(withText("RED"),isDescendantOfA(withId(R.id.color_layout)))).perform(click());
        Espresso.onView(allOf(withText("GREEN"),isDescendantOfA(withId(R.id.color_layout)))).perform(click());
        Espresso.onView(allOf(withText("BLUE"),isDescendantOfA(withId(R.id.color_layout)))).perform(click());

    }

    @Test
    public void TestScroll(){
       // Espresso.onView(withId(android.R.id.content)).perform(ViewActions.swipeUp());
    }

}
