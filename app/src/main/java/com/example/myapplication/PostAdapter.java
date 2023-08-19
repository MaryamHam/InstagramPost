package com.example.myapplication;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
public class PostAdapter extends BaseAdapter {
    private Context context;
    private List<Post> posts;

    public PostAdapter(Context context, List<Post> posts) {
        this.context = context;
        this.posts = posts;
    }
    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int position) {
        return posts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_view, parent, false);
        }

        TextView titleTextView = convertView.findViewById(R.id.txt1);
        LinearLayout headline = convertView.findViewById(R.id.linear1);
        ImageView postImageView = convertView.findViewById(R.id.image);
        LinearLayout contact = convertView.findViewById(R.id.lipost);
        LinearLayout comment = convertView.findViewById(R.id.linear3);


        Post post = (Post) getItem(position);

        titleTextView.setText(post.getTitle());
       // headline
        postImageView.setImageResource(post.getImage());
        //contact
        //comment


        return convertView;
    }
}