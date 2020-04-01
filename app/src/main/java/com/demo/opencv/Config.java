package com.demo.opencv;

import android.os.Environment;

import java.io.File;

public class Config {

    public static String HOST = "";   //The IP address of the server
    public static final int PORT = 13320;			//The port number
    public static final String IMAGE_DIR = getSDPath() + "/imageset/";  //The SD path put the tested image batch

    // Big to little or little to big
    public static int BigtoLittle32(int tag) {
        tag = (((tag & 0xff000000) >> 24) | ((tag & 0x00ff0000) >> 8)
                | ((tag & 0x0000ff00) << 8) | ((tag & 0x000000ff) << 24));
        return tag;
    }


    //读写SD卡
    public static String getSDPath() {
        File sdDir = null;
        boolean sdCardExist = Environment.getExternalStorageState().equals(
                android.os.Environment.MEDIA_MOUNTED);

        if (sdCardExist) //
        {
            sdDir = Environment.getExternalStorageDirectory();
        }
        return sdDir.toString();

    }

}
