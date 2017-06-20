package com.amarpreetsinghprojects.facebook_newsfeed_listview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kulvi on 06/17/17.
 */

public class Feed_Adapter extends BaseAdapter {
    ArrayList<Feed_elemets> feed_elemetsArrayList;
    Context c;

    public Feed_Adapter(ArrayList<Feed_elemets> feed_elemetsArrayList, Context c) {
        this.feed_elemetsArrayList = feed_elemetsArrayList;
        this.c = c;
    }

    public int getCount() {
        return feed_elemetsArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        LayoutInflater l = LayoutInflater.from(c);
        ViewHolder viewHolder;
        if (convertView == null){
            viewHolder = new ViewHolder();
            v = l.inflate(R.layout.facebooknewsfeed_listview,parent,false);
            viewHolder.title = (TextView)v.findViewById(R.id.title);
            viewHolder.date_textView = (TextView)v.findViewById(R.id.date_textView);
            viewHolder.feed_textView = (TextView)v.findViewById(R.id.feed_textView);
            v.setTag(viewHolder);
        }
        else{
            v = convertView;
            viewHolder = (ViewHolder) v.getTag();
        }

        Feed_elemets f = feed_elemetsArrayList.get(position);

        viewHolder.title.setText(f.getTitle());
        viewHolder.date_textView.setText(f.getDate());
        viewHolder.feed_textView.setText(f.getFeed());
        String feed = f.getFeed();
        if (feed.length() < 100)
        {
            viewHolder.feed_textView.setTextSize(30);
        }
        return v;
    }

    static class ViewHolder {
        TextView title,date_textView,feed_textView;
    }
}
