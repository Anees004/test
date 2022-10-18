package com.example.bicolwallet.ui.customer.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.bicolwallet.ui.customer.AllSendFragment;
import com.example.bicolwallet.ui.customer.PendingSendFragment;
import com.example.bicolwallet.ui.customer.AcceptSendFragment;
import com.example.bicolwallet.ui.customer.DeniedSendFragment;

public class FragmentAdapterSendRequest extends FragmentStateAdapter {
    public FragmentAdapterSendRequest(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1) {
            return new AcceptSendFragment();
        } else if (position == 2) {
            return new DeniedSendFragment();
        } else if (position == 3)
            return new AllSendFragment();
        return new PendingSendFragment();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
