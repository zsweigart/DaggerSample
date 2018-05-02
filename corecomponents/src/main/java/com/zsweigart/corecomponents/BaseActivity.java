package com.zsweigart.corecomponents;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 *
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected DependencyFragment dependencyFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // find the retained fragment on activity restarts
        FragmentManager fragmentManager = getSupportFragmentManager();
        dependencyFragment = (DependencyFragment) fragmentManager.findFragmentByTag(getTag());

        // create the fragment and data the first time
        if (dependencyFragment == null) {
            // add the fragment
            dependencyFragment = createDepedencyFragment();
            fragmentManager.beginTransaction().add(dependencyFragment, getTag()).commit();
        }
    }

    protected abstract String getTag();

    protected abstract DependencyFragment createDepedencyFragment();
}
