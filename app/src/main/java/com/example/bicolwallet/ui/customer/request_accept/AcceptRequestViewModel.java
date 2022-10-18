//package com.example.bicolwallet.ui.customer.request_accept;
//
//import androidx.lifecycle.LiveData;
//import androidx.lifecycle.MutableLiveData;
//import androidx.lifecycle.ViewModel;
//
//import java.util.ArrayList;
//
//public class AcceptRequestViewModel extends ViewModel {
//    private ArrayList<String> senderName = new ArrayList<>();
//    private ArrayList<String> sendDate = new ArrayList<>();
//    private ArrayList<String> sendTime = new ArrayList<>();
//
//    public ArrayList<String> getStatus() {
//        return status;
//    }
//
//    private ArrayList<String> status = new ArrayList<>();
//
//    public ArrayList<String> getSenderName() {
//        return senderName;
//    }
//
//    public ArrayList<String> getSendDate() {
//        return sendDate;
//    }
//
//    public ArrayList<String> getSendTime() {
//        return sendTime;
//    }
//
//    public ArrayList<String> getSendingNotes() {
//        return sendingNotes;
//    }
//
//    public ArrayList<String> getSenderPhoneNumber() {
//        return senderPhoneNumber;
//    }
//
//    public ArrayList<Integer> getSendAmount() {
//        return sendAmount;
//    }
//
//    private ArrayList<String> sendingNotes = new ArrayList<>();
//    private ArrayList<String> senderPhoneNumber = new ArrayList<>();
//    private ArrayList<Integer> sendAmount = new ArrayList<>();
//
//    void initArrlist() {
//
//        senderName.add("User Demo 1");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(1550);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        status.add("pending");
//        sendingNotes.add("Nothing");
//
//        senderName.add("User Demo 23");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(750);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        sendingNotes.add("Important use only");
//        status.add("accept");
//
//
//        senderName.add("User 101");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(9000);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        sendingNotes.add("Don't Accept");
//        status.add("denied");
//
//
//        senderName.add("User Demo 1");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(1550);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        status.add("pending");
//        sendingNotes.add("Nothing");
//
//        senderName.add("User Demo 23");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(750);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        sendingNotes.add("Important use only");
//        status.add("accept");
//
//
//        senderName.add("User 101");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(9000);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        sendingNotes.add("Don't Accept");
//        status.add("denied");
//
//
//        senderName.add("User Demo 1");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(1550);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        status.add("pending");
//        sendingNotes.add("Nothing");
//
//        senderName.add("User Demo 23");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(750);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        sendingNotes.add("Important use only");
//        status.add("accept");
//
//
//        senderName.add("User 101");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(9000);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        sendingNotes.add("Don't Accept");
//        status.add("denied");
//
//
//        senderName.add("User Demo 1");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(1550);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        status.add("pending");
//        sendingNotes.add("Nothing");
//
//        senderName.add("User Demo 23");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(750);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        sendingNotes.add("Important use only");
//        status.add("accept");
//
//
//        senderName.add("User 101");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(9000);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        sendingNotes.add("Don't Accept");
//        status.add("denied");
//
//
//        senderName.add("User Demo 1");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(1550);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        status.add("pending");
//        sendingNotes.add("Nothing");
//
//        senderName.add("User Demo 23");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(750);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        sendingNotes.add("Important use only");
//        status.add("accept");
//
//
//        senderName.add("User 101");
//        senderPhoneNumber.add("+923456789086");
//        sendAmount.add(9000);
//        sendDate.add("12-Oct-2022");
//        sendTime.add("12:33 PM");
//        sendingNotes.add("Don't Accept");
//        status.add("denied");
//    }
//
//
////    private final MutableLiveData<String> mText;
//
//    public AcceptRequestViewModel() {
////        mText = new MutableLiveData<>();
////        mText.setValue("This is accept fragment");
//        initArrlist();
//    }
//
////    public LiveData<String> getText() {
////        return mText;
////    }
//}