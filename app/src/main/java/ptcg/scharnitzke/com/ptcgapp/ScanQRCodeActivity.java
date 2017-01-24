package ptcg.scharnitzke.com.ptcgapp;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ScanQRCodeActivity extends AppCompatActivity {
    private CameraManager cameraManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qrcode);

        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
    }
}
