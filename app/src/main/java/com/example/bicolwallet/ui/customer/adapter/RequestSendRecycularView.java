package com.example.bicolwallet.ui.customer.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bicolwallet.R;

import java.util.ArrayList;

public class RequestSendRecycularView extends RecyclerView.Adapter<RequestSendRecycularView.ViewHolder> {
    private static final String TAG = "RecycularView Adapter Accept Request:";

    public RequestSendRecycularView(ArrayList<String> receiverName, ArrayList<String> sendDate, ArrayList<String> sendTime, ArrayList<String> sendingNotes, ArrayList<String> status, String fragment, ArrayList<String> receiverPhoneNumber, ArrayList<Integer> requestAmount) {
        this.receiverName = receiverName;
        this.sendDate = sendDate;
        this.sendTime = sendTime;
        this.sendingNotes = sendingNotes;
        this.status = status;
        Fragment = fragment;
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.requestAmount = requestAmount;
    }

    private ArrayList<String> receiverName = new ArrayList<>();
    private ArrayList<String> sendDate = new ArrayList<>();
    private ArrayList<String> sendTime = new ArrayList<>();
    private ArrayList<String> sendingNotes = new ArrayList<>();
    private ArrayList<String> status = new ArrayList<>();

    private final String Fragment;

    private ArrayList<String> receiverPhoneNumber = new ArrayList<>();
    private ArrayList<Integer> requestAmount = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sample_send_request, parent, false);
        RequestSendRecycularView.ViewHolder holder = new RequestSendRecycularView.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtReceiverName.setText(receiverName.get(position));
        holder.txtReceiverPhNbr.setText(receiverPhoneNumber.get(position));
        holder.txtDateTime.setText(sendTime.get(position) + " | " + sendDate.get(position));
        holder.txtNote.setText(sendingNotes.get(position));
        holder.txtAcceptStatus.setText(status.get(position));
        holder.txtRequestAmount.setText(String.valueOf(requestAmount.get(position)));
    }

    @Override
    public int getItemCount() {
        return status.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout constraintLayout;
        TextView txtReceiverName, txtReceiverPhNbr, txtDateTime, txtRequestAmount, txtNote, txtAcceptStatus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            constraintLayout = itemView.findViewById(R.id.Rconstraint);
            txtReceiverName = itemView.findViewById(R.id.txtReceiverName);
            txtRequestAmount = itemView.findViewById(R.id.txtRequestAmount);
            txtReceiverPhNbr = itemView.findViewById(R.id.txtReceiverPhoneNumber);
            txtDateTime = itemView.findViewById(R.id.txtReqTimeDate);
            txtNote = itemView.findViewById(R.id.txtReceiverNote);
            txtAcceptStatus = itemView.findViewById(R.id.txtRequestStatus);
        }
    }
}
