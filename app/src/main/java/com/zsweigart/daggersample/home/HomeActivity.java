package com.zsweigart.daggersample.home;

import com.zsweigart.corecomponents.BaseActivity;
import com.zsweigart.corecomponents.DependencyFragment;

/**
 *
 */
public class HomeActivity extends BaseActivity {

    @Override
    protected String getTag() {
        return this.getClass().getCanonicalName();
    }

    @Override
    protected DependencyFragment createDepedencyFragment() {
        return new HomeDependencyFragment();
    }
}
