package com.example.bicolwallet.ui.customer.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bicolwallet.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class RequesReceivedtRecycularAdapter extends RecyclerView.Adapter<RequesReceivedtRecycularAdapter.ViewHolder> {

    private static final String TAG = "RecycularView Adapter Accept Request:";
    private ArrayList<String> senderName = new ArrayList<>();
    private ArrayList<String> sendDate = new ArrayList<>();
    private ArrayList<String> sendTime = new ArrayList<>();
    private ArrayList<String> sendingNotes = new ArrayList<>();
    private ArrayList<String> status = new ArrayList<>();

    private final String Fragment;

    private ArrayList<String> senderPhoneNumber = new ArrayList<>();
    private ArrayList<Integer> sendAmount = new ArrayList<>();

    public RequesReceivedtRecycularAdapter(String Fragment, ArrayList<String> status, ArrayList<String> senderName, ArrayList<String> sendDate, ArrayList<String> sendTime, ArrayList<String> sendingNotes, ArrayList<String> senderPhoneNumber, ArrayList<Integer> sendAmount, Context context) {
        this.senderName = senderName;
        this.sendDate = sendDate;
        this.sendTime = sendTime;
        this.sendingNotes = sendingNotes;
        this.senderPhoneNumber = senderPhoneNumber;
        this.sendAmount = sendAmount;
        this.context = context;
        this.Fragment = Fragment;
        this.status = status;
    }


    private Context context;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sample_pending, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(".........From on onBindViewHolder : ", String.valueOf(position));

        if (Fragment == "pending" && status.get(position) == "pending") {
            holder.btnAccept.setVisibility(View.VISIBLE);
            holder.btnDeny.setVisibility(View.VISIBLE);
            holder.txtApStatus.setVisibility(View.GONE);
            holder.txtSenderName.setText(senderName.get(position));
            holder.txtSenderPhNbr.setText(senderPhoneNumber.get(position));
            holder.txtDateTime.setText(sendTime.get(position) + " | " + sendDate.get(position));

            holder.txtSendAmount.setText(String.valueOf(sendAmount.get(position)));

            holder.btnAccept.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar.make(v, "Going to move user to accepted : " + senderName.get(position), Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    holder.btnAccept.setVisibility(View.INVISIBLE);
                    holder.btnDeny.setVisibility(View.GONE);
                    holder.txtApStatus.setVisibility(View.VISIBLE);
                    status.set(position, "accept");
                }
            });

            holder.btnDeny.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar.make(v, "Going to move user to Denied : " + senderName.get(position), Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        } else if (Fragment == "accept" && status.get(position) == "accept") {
            holder.btnAccept.setVisibility(View.GONE);
            holder.btnDeny.setVisibility(View.GONE);
            holder.txtApStatus.setVisibility(View.VISIBLE);
            holder.txtApStatus.setText(status.get(position));
            holder.txtSenderName.setText(senderName.get(position));
            holder.txtSenderPhNbr.setText(senderPhoneNumber.get(position));
            holder.txtDateTime.setText(sendTime.get(position) + " | " + sendDate.get(position));

            holder.txtSendAmount.setText(String.valueOf(sendAmount.get(position)));
        } else if (Fragment == "denied" && status.get(position) == "denied") {
            holder.btnAccept.setVisibility(View.GONE);
            holder.btnDeny.setVisibility(View.GONE);
            holder.txtApStatus.setVisibility(View.VISIBLE);
            holder.txtApStatus.setText(status.get(position));
            holder.txtSenderName.setText(senderName.get(position));
            holder.txtSenderPhNbr.setText(senderPhoneNumber.get(position));
            holder.txtDateTime.setText(sendTime.get(position) + " | " + sendDate.get(position));

            holder.txtSendAmount.setText(String.valueOf(sendAmount.get(position)));
        } else if (Fragment == "all") {

            if (status.get(position) == "pending") {
                holder.btnAccept.setVisibility(View.VISIBLE);
                holder.btnDeny.setVisibility(View.VISIBLE);
                holder.txtApStatus.setVisibility(View.GONE);
            } else if (status.get(position) == "accept") {
                holder.btnAccept.setVisibility(View.GONE);
                holder.btnDeny.setVisibility(View.GONE);
                holder.txtApStatus.setVisibility(View.VISIBLE);
                holder.txtApStatus.setText(status.get(position));
            } else if (status.get(position) == "denied") {
                holder.btnAccept.setVisibility(View.GONE);
                holder.btnDeny.setVisibility(View.GONE);
                holder.txtApStatus.setVisibility(View.VISIBLE);
                holder.txtApStatus.setText(status.get(position));
            }

            holder.txtSenderName.setText(senderName.get(position));
            holder.txtSenderPhNbr.setText(senderPhoneNumber.get(position));
            holder.txtDateTime.setText(sendTime.get(position) + " | " + sendDate.get(position));

            holder.txtSendAmount.setText(String.valueOf(sendAmount.get(position)));
        }
    }

    @Override
    public int getItemCount() {
        return senderName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout constraintLayout;
        TextView txtSenderName, txtSenderPhNbr, txtDateTime, txtSendAmount, txtNote, btnAccept, btnDeny, txtApStatus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            constraintLayout = itemView.findViewById(R.id.Pconstraint);
            txtSenderName = itemView.findViewById(R.id.txtPSenderName);
            txtSendAmount = itemView.findViewById(R.id.txtPSendAmount);
            txtSenderPhNbr = itemView.findViewById(R.id.txtPSndPhoneNumber);
            txtDateTime = itemView.findViewById(R.id.txtPTimeDate);
            txtNote = itemView.findViewById(R.id.txtNote);
            btnAccept = itemView.findViewById(R.id.btnAccept);
            btnDeny = itemView.findViewById(R.id.btnDeny);
            txtApStatus = itemView.findViewById(R.id.txtApStatus);

        }
    }

}
