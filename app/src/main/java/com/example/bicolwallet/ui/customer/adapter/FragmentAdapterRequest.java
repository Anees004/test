package com.example.bicolwallet.ui.customer.adapter;

import static android.os.Build.VERSION_CODES.R;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.bicolwallet.ui.customer.AcceptSendFragment;
import com.example.bicolwallet.ui.customer.AllSendFragment;
import com.example.bicolwallet.ui.customer.DeniedSendFragment;
import com.example.bicolwallet.ui.customer.PendingSendFragment;
import com.example.bicolwallet.ui.customer.request_accept.FragmentRequestAccept;
import com.example.bicolwallet.ui.customer.request_denied.FragmentRequestDenied;
import com.example.bicolwallet.ui.customer.request_pending.FragmentRequestPending;
import com.example.bicolwallet.ui.customer.requestall.FragmentAllRequest;

public class FragmentAdapterRequest extends FragmentStateAdapter {
    public FragmentAdapterRequest(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1) {
            return new FragmentRequestAccept();
        } else if (position == 2) {
            return new FragmentRequestDenied();
        } else if (position == 3)
            return new FragmentAllRequest();
        return new FragmentRequestPending();
    }

    @Override
    public int getItemCount() {
        return 4;
    }

}
