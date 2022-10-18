package com.example.bicolwallet.ui.customer.request_accept;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bicolwallet.databinding.FragmentRequestAcceptBinding;
import com.example.bicolwallet.ui.customer.adapter.RequesReceivedtRecycularAdapter;
import com.example.bicolwallet.ui.customer.adapter.dataclass;


public class FragmentRequestAccept extends Fragment {
    private FragmentRequestAcceptBinding binding;

    public FragmentRequestAccept() {
        // Required empty public constructor
    }

    public static FragmentRequestAccept newInstance(String param1, String param2) {
        FragmentRequestAccept fragment = new FragmentRequestAccept();
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
        dataclass acceptRequestViewModel = new dataclass();

        binding = FragmentRequestAcceptBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final RecyclerView recyclerView = binding.acceptRequestRecycular;
        initRecycularAdapter(acceptRequestViewModel);
//        pendingRequestViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    void initRecycularAdapter(dataclass v) {
        RequesReceivedtRecycularAdapter adapter = new RequesReceivedtRecycularAdapter("accept", v.getStatus(), v.getSenderName(), v.getSendDate(), v.getSendTime(), v.getSendingNotes(), v.getSenderPhoneNumber(), v.getSendAmount(), getContext());
        binding.acceptRequestRecycular.setAdapter(adapter);
        binding.acceptRequestRecycular.setLayoutManager(new LinearLayoutManager(getContext()));
    }

}