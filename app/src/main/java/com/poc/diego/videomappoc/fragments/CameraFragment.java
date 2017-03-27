package com.poc.diego.videomappoc.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.poc.diego.videomappoc.R;
import com.poc.diego.videomappoc.utils.CameraUtil;

/**
 * A simple {@link Fragment} subclass.
 */
public class CameraFragment extends Fragment implements View.OnClickListener{

    private Button captureBtn;
    private CameraUtil cameraUtil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_camera, container, false);

        TextureView textureView = (TextureView) view.findViewById(R.id.textureView);
        captureBtn = (Button) view.findViewById(R.id.captureBtn);
        cameraUtil = new CameraUtil(getActivity(), textureView);
        captureBtn.setOnClickListener(this);
        textureView.setSurfaceTextureListener(cameraUtil);

        return view;
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onResume() {
        super.onResume();
        cameraUtil.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        cameraUtil.onPause();
    }
}
