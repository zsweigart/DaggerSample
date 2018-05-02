package com.zsweigart.corecomponents;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Retains DI graph on rotation
 */
public abstract class DependencyFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);

        createComponent();
    }

    protected abstract void createComponent();
}
