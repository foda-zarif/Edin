package totem_soft.scrollflags;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;

/**
 * @author Antonina
 */
public class EnterAlwaysCollapsedActivity extends MainActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flag_enter_always_collapsed);

        setToolbar("EnterAlwaysCollapsed");
    }

    @Override
    public void setToolbar(@NonNull String title) {
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        CollapsingToolbarLayout collapsingToolbar = findViewById(R.id.collapsingToolbarLayout);
        collapsingToolbar.setTitle(title);
    }
}
