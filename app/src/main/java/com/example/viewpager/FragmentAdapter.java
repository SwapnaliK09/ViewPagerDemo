package com.example.viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentAdapter extends RecyclerView.Adapter<FragmentAdapter.ViewHolder> {
    private  Context context;
    public FragmentAdapter(Context context, ArrayList<UserModel> arrayList) {
        this.context = context;
        HomeFragment.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserModel userData  = HomeFragment.arrayList.get(position);
        holder.t1.setText(userData.getName());
        holder.t2.setText(userData.getSurname());
        System.out.println("code :"+userData.getName());
    }

    @Override
    public int getItemCount() {
        return HomeFragment.arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView t1,t2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.tv_name);
            t2 = itemView.findViewById(R.id.tv_surname);
        }
    }
}