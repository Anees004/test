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

import com.example.bicolwallet.databinding.FragmentAcceptBinding;
import com.example.bicolwallet.ui.customer.adapter.RequesReceivedtRecycularAdapter;
import com.example.bicolwallet.ui.customer.adapter.RequestSendRecycularView;
import com.example.bicolwallet.ui.customer.adapter.dataclass;

public class AcceptSendFragment extends Fragment {

    private FragmentAcceptBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentAcceptBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        dataclass data = new dataclass();
        initRecycularAdapter(data);
        return root;
    }


    void initRecycularAdapter(dataclass v) {

        RequestSendRecycularView adapter = new RequestSendRecycularView( v.getSenderName(), v.getSendDate(), v.getSendTime(), v.getSendingNotes(), v.getStatus(),"accept",v.getSenderPhoneNumber(), v.getSendAmount());

        binding.acceptSendRequestRecycular.setAdapter(adapter);
        binding.acceptSendRequestRecycular.setLayoutManager(new LinearLayoutManager(getContext()));
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}