package com.poc.diego.videomappoc.utils;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.view.TextureView;

/**
 * Created by Diego on 3/22/2017.
 */
public class CameraManager implements TextureView.SurfaceTextureListener {

    private static CameraManager INSTANCE;

    private CameraManager(){}

    public static CameraManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CameraManager();
        }

        return INSTANCE;
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {

    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {

    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {

    }

    private final CameraDevice.StateCallback stateCallback = new CameraDevice.StateCallback() {
        @Override
        public void onOpened(CameraDevice camera) {

        }

        @Override
        public void onDisconnected(CameraDevice camera) {

        }

        @Override
        public void onError(CameraDevice camera, int error) {

        }
    };
}
