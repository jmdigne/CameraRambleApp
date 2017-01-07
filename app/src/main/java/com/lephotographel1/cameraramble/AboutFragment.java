package com.lephotographel1.cameraramble;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {

    ImageView imageViewLogo;

    /**
     * @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
     * Bundle savedInstanceState) {
     * // Inflate the layout for this fragment
     * return inflater.inflate(R.layout.fragment_about, container, false);
     * }
     */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //super.onCreateView(inflater, container, savedInstanceState);

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        //

        imageViewLogo = (ImageView) view.findViewById(R.id.imageViewLogo);
        //imageViewLogo.setImageResource(R.drawable.ic_action_new_event);
        imageViewLogo.setImageResource(R.drawable.cameraramble_icon);
        //imageViewLogo.setImageBitmap(currentImage);
        imageViewLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return view;
    }
}
