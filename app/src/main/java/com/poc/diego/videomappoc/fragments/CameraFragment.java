package com.poc.diego.videomappoc.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.poc.diego.videomappoc.R;
import com.poc.diego.videomappoc.utils.CameraManager;

/**
 * A simple {@link Fragment} subclass.
 */
public class CameraFragment extends Fragment implements View.OnClickListener{

    private TextureView textureView;
    private Button captureBtn;
    private CameraManager cameraManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_camera, container, false);

        textureView = (TextureView) view.findViewById(R.id.textureView);
        captureBtn = (Button) view.findViewById(R.id.captureBtn);
        cameraManager = CameraManager.getInstance();
        captureBtn.setOnClickListener(this);
        textureView.setSurfaceTextureListener(cameraManager);

        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
