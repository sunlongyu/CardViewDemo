package com.example.cardviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MsgAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<Msg> msgDatas;

    public MsgAdapter(Context context, List<Msg> msgDatas) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.msgDatas = msgDatas;
    }

    @Override
    public int getCount() {
        return msgDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return msgDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHodler viewHodler;

        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.layout_cardview, parent, false);
            viewHodler = new ViewHodler();
            viewHodler.msgImageView = convertView.findViewById(R.id.msgImageView);
            viewHodler.msgTitleTextView = convertView.findViewById(R.id.msgTitleTextView);
            viewHodler.msgContentTextView = convertView.findViewById(R.id.msgContentTextView);
            convertView.setTag(viewHodler);
        } else {
            viewHodler = (ViewHodler) convertView.getTag();
        }

        Msg msg = msgDatas.get(position);
        viewHodler.msgImageView.setImageResource(msg.getImageUrl());
        viewHodler.msgTitleTextView.setText(msg.getTitle());
        viewHodler.msgContentTextView.setText(msg.getContext());

        return convertView;
    }

    public static class ViewHodler {
        ImageView msgImageView;
        TextView msgTitleTextView, msgContentTextView;
    }
}
