package com.example.viewpager;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    EditText name, surname;
    Button button;
   public static ArrayList<UserModel> arrayList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragview = inflater.inflate(R.layout.fragment_home, container, false);
        name = fragview.findViewById(R.id.name);
        surname = fragview.findViewById(R.id.surname);
        button = fragview.findViewById(R.id.btn1);
        arrayList = new ArrayList<UserModel>();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserModel userModel = new UserModel();
                userModel.setName(name.getText().toString());
                userModel.setSurname(surname.getText().toString());
                arrayList.add(userModel);
                Toast.makeText(getContext(), "Data Saved!!!!", Toast.LENGTH_SHORT).show();
            }
        });
        return fragview;
    }

}
