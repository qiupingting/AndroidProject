package com.example.myapplication.ui.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

public class BookShelfFragment extends Fragment {
    Activity activity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("BookShelfFragment","BookShelfFragment onCreateView");
        /*activity=getActivity();
        Toolbar toolbar=(Toolbar) getView().findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);*/
        View view=inflater.inflate(R.layout.fragment_bookshelf,container,false);
        return view;
    }
    /*public  void setUpToolbar(Toolbar toolbar) {
        toolbar.setLogo(R.mipmap.logo);
        toolbar.setTitle("");
    }*/
}
