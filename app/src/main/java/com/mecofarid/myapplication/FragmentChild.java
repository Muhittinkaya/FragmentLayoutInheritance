package com.mecofarid.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;

public class FragmentChild extends FragmentCore {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public void loadLayoutFromResIdToViewStub(View coreFragmentView, ViewGroup container){

        setRetainInstance(true);

        if (container != null) {
            container.removeAllViews();
        }

        ViewStub stub = coreFragmentView.findViewById(R.id.child_fragment_will_be_displayed_here);
        stub.setLayoutResource(R.layout.fragment_child);
        stub.inflate();

        TextView childFragmentTextView = coreFragmentView.findViewById(R.id.child_fragment_text_view);

        mTextViewInCoreActivity.setText("Core (Parent) Fragment TextView is accessible");
        childFragmentTextView.setText("Child Fragment TextView is accessible");
    }

}