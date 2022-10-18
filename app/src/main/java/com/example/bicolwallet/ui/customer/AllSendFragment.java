package com.example.bicolwallet.ui.customer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.bicolwallet.databinding.FragmentAllSendBinding;
import com.example.bicolwallet.ui.customer.adapter.RequestSendRecycularView;
import com.example.bicolwallet.ui.customer.adapter.dataclass;


public class AllSendFragment extends Fragment {
FragmentAllSendBinding binding;
    public AllSendFragment() {
        // Required empty public constructor
    }

    public static AllSendFragment newInstance(String param1, String param2) {
        AllSendFragment fragment = new AllSendFragment();
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
        // Inflate the layout for this fragment
//        AllSendViewModel acceptViewModel =
//                new ViewModelProvider(this).get(AllSendViewModel.class);

        binding = FragmentAllSendBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textHome;
//        acceptViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        dataclass data = new dataclass();
        initRecycularAdapter(data);
        return root;
    }


    void initRecycularAdapter(dataclass v) {

        RequestSendRecycularView adapter = new RequestSendRecycularView( v.getSenderName(), v.getSendDate(), v.getSendTime(), v.getSendingNotes(), v.getStatus(),"all",v.getSenderPhoneNumber(), v.getSendAmount());

        binding.allSendRequestRecycular.setAdapter(adapter);
        binding.allSendRequestRecycular.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}