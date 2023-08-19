package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView postListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        postListView = findViewById(R.id.postListView);

        List<Post> posts = generateSamplePosts();
        PostAdapter adapter = new PostAdapter(this, posts);
        postListView.setAdapter(adapter);
    }



    private List<Post> generateSamplePosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Space ", "This is the content of post 1.",R.drawable.background2,"contact","comment"));
        posts.add(new Post("Space ", "This is the content of post 2.",R.drawable.background5,"contact","comment"));
        posts.add(new Post("Space ", "This is the content of post 3.",R.drawable.background3,"contact","comment"));
        posts.add(new Post("Space ", "This is the content of post 4.",R.drawable.background4,"contact","comment"));


        return posts;
    }
}
