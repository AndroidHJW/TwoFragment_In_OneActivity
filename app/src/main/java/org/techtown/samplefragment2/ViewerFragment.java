package org.techtown.samplefragment2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewerFragment extends Fragment {
    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_viewer, container, false);

        imageView = rootview.findViewById(R.id.imageView);

        return rootview;
    }

    public void setImage(int resId) {
        imageView.setImageResource(resId);
    }
}