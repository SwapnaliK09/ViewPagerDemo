package com.example.viewpager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class ListFragment extends Fragment {
   private  RecyclerView recyclerView;
   private FragmentAdapter  fragmentAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragview = inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = fragview.findViewById(R.id.recycler);
        fragmentAdapter = new FragmentAdapter(getContext(),HomeFragment.arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(fragmentAdapter);
        System.out.println("code !!:"+fragmentAdapter);
        return fragview;


    }
    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void onResume() {
        super.onResume();
        fragmentAdapter.notifyDataSetChanged();
        System.out.println("arraylist: onResume" + HomeFragment.arrayList.toString());
    }


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

    }


}

