package net.appnews.ui.fragment.adapter;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

/**
 * Created by DongNguyen on 10/22/16.
 */

public class SwipeRefreshLayoutToggleScrollListener extends RecyclerView.OnScrollListener {
    private int overallYScroll = 0;
    private SwipeRefreshLayout mSwipeLayout;

    public SwipeRefreshLayoutToggleScrollListener(SwipeRefreshLayout swipeLayout) {
        mSwipeLayout = swipeLayout;
    }

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        overallYScroll = overallYScroll + dy;
        if (overallYScroll <= 0) {
            //enable swipeRefreshLayout
            mSwipeLayout.setEnabled(true);
        } else {
            //disable
            mSwipeLayout.setEnabled(false);
        }
    }
}
