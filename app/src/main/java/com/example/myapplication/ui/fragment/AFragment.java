package com.example.myapplication.ui.fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

public class AFragment extends Fragment {
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("demoinfo","AFragment onAttach方法执行");
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("demoinfo","AFragment onCreate方法执行");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("demoinfo","AFragment onCreateView方法执行");
        View view=inflater.inflate(R.layout.fragment_a,container,false);
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("demoinfo","AFragment onViewCreate方法执行");
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("demoinfo","AFragment onActivityCreate方法执行");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d("demoinfo","AFragment onStart方法执行");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("demoinfo","AFragment onResume方法执行");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("demoinfo","AFragment onPause方法执行");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d("demoinfo","AFragment onStop方法执行");
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("demoinfo","AFragment onDestroyView方法执行");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("demoinfo","AFragment onDestroy方法执行");
    }
    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("demoinfo","AFragment onDetach方法执行");
    }
}
