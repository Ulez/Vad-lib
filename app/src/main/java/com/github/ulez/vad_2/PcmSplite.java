package com.github.ulez.vad_2;

/**
 * Created by Ulez on 2019/5/22.
 * Email：1104128773@qq.com
 */
public class PcmSplite {
    static {
        System.loadLibrary("native-lib");
    }

    public int splitePCMc(String filename, String output_filename_prefix, String output_dir) {
        return j2cSplitePCM(filename, output_filename_prefix, output_dir);
    }

    public native int j2cSplitePCM(String filename, String output_filename_prefix, String output_dir);
}
