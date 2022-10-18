package com.example.bicolwallet.ui.customer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.bicolwallet.databinding.FragmentPendingBinding;
import com.example.bicolwallet.ui.customer.adapter.RequestSendRecycularView;
import com.example.bicolwallet.ui.customer.adapter.dataclass;

public class PendingSendFragment extends Fragment {

    private FragmentPendingBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPendingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        dataclass data = new dataclass();
        initRecycularAdapter(data);
        return root;
    }


    void initRecycularAdapter(dataclass v) {

        RequestSendRecycularView adapter = new RequestSendRecycularView( v.getSenderName(), v.getSendDate(), v.getSendTime(), v.getSendingNotes(), v.getStatus(),"all",v.getSenderPhoneNumber(), v.getSendAmount());

        binding.pendingSendRequestRecycular.setAdapter(adapter);
        binding.pendingSendRequestRecycular.setLayoutManager(new LinearLayoutManager(getContext()));
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}