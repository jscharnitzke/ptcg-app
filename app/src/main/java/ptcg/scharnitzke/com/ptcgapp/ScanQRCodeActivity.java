package ptcg.scharnitzke.com.ptcgapp;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;

public class ScanQRCodeActivity extends AppCompatActivity {
    private TextureView qrTextureView;
    private CameraManager cameraManager;
    private String cameraId;

    protected CameraDevice cameraDevice;
    protected CameraCaptureSession cameraCaptureSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qrcode);

        this.qrTextureView = (TextureView) findViewById(R.id.qrCameraTexture);
        assert this.qrTextureView != null;

        this.cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
    }
}
