package com.github.ulez.vad_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private PcmSplite pcmSplite;
    private Button button;

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        pcmSplite = new PcmSplite();
        button = findViewById(R.id.btStart);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xx = pcmSplite.j2cSplitePCM("/sdcard/pcm/16k_1.pcm", "16k_1.pcm", "/sdcard/output_pcm");
                button.setText("切割成功：" + xx);
            }
        });

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
