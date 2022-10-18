package com.example.bicolwallet.ui.customer.request_denied;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bicolwallet.databinding.FragmentRequestDeniedBinding;
import com.example.bicolwallet.ui.customer.adapter.RequesReceivedtRecycularAdapter;
import com.example.bicolwallet.ui.customer.adapter.dataclass;

public class FragmentRequestDenied extends Fragment {
    private FragmentRequestDeniedBinding binding;

    public FragmentRequestDenied() {
        // Required empty public constructor
    }

    public static FragmentRequestDenied newInstance(String param1, String param2) {
        FragmentRequestDenied fragment = new FragmentRequestDenied();
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
//        DeniedRequestViewModel deniedRequestViewModel =
//                new ViewModelProvider(this).get(DeniedRequestViewModel.class);

        dataclass data = new dataclass();
        binding = FragmentRequestDeniedBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        initRecycularAdapter(data);
        return root;
    }

    void initRecycularAdapter(dataclass v) {

        RequesReceivedtRecycularAdapter adapter = new RequesReceivedtRecycularAdapter("denied",v.getStatus(), v.getSenderName(), v.getSendDate(), v.getSendTime(), v.getSendingNotes(), v.getSenderPhoneNumber(), v.getSendAmount(), getContext());

        binding.deniedRequestRecycular.setAdapter(adapter);
        binding.deniedRequestRecycular.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}