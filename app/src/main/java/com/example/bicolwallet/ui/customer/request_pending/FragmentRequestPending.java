package com.example.bicolwallet.ui.customer.request_pending;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bicolwallet.databinding.FragmentRequestPendingBinding;
import com.example.bicolwallet.ui.customer.adapter.RequesReceivedtRecycularAdapter;
import com.example.bicolwallet.ui.customer.adapter.dataclass;

public class FragmentRequestPending extends Fragment {
    private FragmentRequestPendingBinding binding;

    public FragmentRequestPending() {
        // Required empty public constructor
    }

    public static FragmentRequestPending newInstance(String param1, String param2) {
        FragmentRequestPending fragment = new FragmentRequestPending();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        dataclass data = new dataclass();
        binding = FragmentRequestPendingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        initRecycularAdapter(data);
//        pendingRequestViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    void initRecycularAdapter(dataclass v) {
        RequesReceivedtRecycularAdapter adapter = new RequesReceivedtRecycularAdapter("pending",v.getStatus(),v.getSenderName(), v.getSendDate(), v.getSendTime(), v.getSendingNotes(), v.getSenderPhoneNumber(), v.getSendAmount(), getContext());
        binding.pendingRequestRecycular.setAdapter(adapter);
        binding.pendingRequestRecycular.setLayoutManager(new LinearLayoutManager(getContext()));
    }


}