package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.content.Context;
import android.test.ApplicationTestCase;
import android.util.Pair;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void EndpointsAsyncTaskRetrievesString() {
        EndpointsAsyncTask testTask = new EndpointsAsyncTask();
        testTask.execute(new Pair<Context, String>(getApplication(), "Not use"));
        assertEquals("Java. Write once, debug everywere.", testTask.getStringForTesting());
    }
}