package com.example.jerin.excel2016.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jerin.excel2016.R;

/**
 * Created by jerin on 6/5/16.
 */
public class competitionfragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.competitionfragment, container, false);
        return  view;
    }
}