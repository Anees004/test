package com.example.bicolwallet.ui.customer.requestall;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bicolwallet.databinding.FragmentAllRequestBinding;
import com.example.bicolwallet.ui.customer.adapter.RequesReceivedtRecycularAdapter;
import com.example.bicolwallet.ui.customer.adapter.dataclass;

public class FragmentAllRequest extends Fragment {
FragmentAllRequestBinding binding;

    public FragmentAllRequest() {
        // Required empty public constructor
    }

    public static FragmentAllRequest newInstance(String param1, String param2) {
        FragmentAllRequest fragment = new FragmentAllRequest();
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
//        AllRequestViewModel viewModel =
//                new ViewModelProvider(this).get(AllRequestViewModel.class);

        binding = FragmentAllRequestBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.txtName;
//        viewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        dataclass data = new dataclass();
        initRecycularAdapter(data);
        return root;}
    void initRecycularAdapter(dataclass v) {

        RequesReceivedtRecycularAdapter adapter = new RequesReceivedtRecycularAdapter("all",v.getStatus(), v.getSenderName(), v.getSendDate(), v.getSendTime(), v.getSendingNotes(), v.getSenderPhoneNumber(), v.getSendAmount(), getContext());

        binding.allRequestRecycular.setAdapter(adapter);
        binding.allRequestRecycular.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}