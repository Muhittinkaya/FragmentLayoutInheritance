package com.mecofarid.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public abstract class FragmentCore extends Fragment {

    public FragmentCore() {
        // Required empty public constructor
    }

     protected TextView mTextViewInCoreActivity;

     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
         View coreFragmentView = inflater.inflate(R.layout.fragment_core, container, false);
         mTextViewInCoreActivity = coreFragmentView.findViewById(R.id.core_fragment_text_view);
         loadLayoutFromResIdToViewStub(coreFragmentView, container);
         return coreFragmentView;
     }

     public abstract void loadLayoutFromResIdToViewStub(View rootView,ViewGroup container);

 }
