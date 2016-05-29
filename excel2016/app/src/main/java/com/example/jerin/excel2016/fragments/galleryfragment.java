package com.example.jerin.excel2016.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.jerin.excel2016.MainActivity;
import com.example.jerin.excel2016.R;
import com.example.jerin.excel2016.adapter.CoverFlowAdapter;
import com.example.jerin.excel2016.pojo.gallerypojo;
import com.special.ResideMenu.ResideMenu;

import java.util.ArrayList;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

/**
 * Created by jerin on 6/5/16.
 */
public class galleryfragment extends Fragment{

    private FeatureCoverFlow mCoverFlow;
    private CoverFlowAdapter mAdapter;
    private ArrayList<gallerypojo> mData = new ArrayList<>(0);
    private TextView mTitle,mtitle1;
    LinearLayout linearLayout;

    private ResideMenu resideMenu;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.galleryfragment, container, false);

        MainActivity parentActivity = (MainActivity) getActivity();
        resideMenu = parentActivity.getResideMenu();

        mData.add(new gallerypojo(getResources().getDrawable(R.drawable.image_1), "poda patty","how do u do"));
        mData.add(new gallerypojo(getResources().getDrawable(R.drawable.image_2),"pulle","how are u"));
        mData.add(new gallerypojo(getResources().getDrawable(R.drawable.image_3),"hello","how is your leg"));
        mData.add(new gallerypojo(getResources().getDrawable(R.drawable.image_4),"hehehe","how old are you"));

        mTitle = (TextView) view.findViewById(R.id.title);

        mtitle1 = (TextView) view.findViewById(R.id.title2);




        mAdapter = new CoverFlowAdapter(getActivity());
        mAdapter.setData(mData);
        mCoverFlow = (FeatureCoverFlow) view.findViewById(R.id.coverflow);
        mCoverFlow.setAdapter(mAdapter);

        resideMenu.addIgnoredView(mCoverFlow);
        mCoverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle.setText(mData.get(position).getUploader());
                mtitle1.setText(mData.get(position).getUploaderscomment());
            }

            @Override
            public void onScrolling() {
                mTitle.setText("");
                mtitle1.setText("");
            }
        });

        return  view;
    }

}
