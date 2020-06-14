package com.study.kotlinstudy.use;

import androidx.annotation.Nullable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaFileUtil {

    @Nullable
    public static String readFileFirstLine(File file) {
        String firstLine = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            firstLine = bufferedReader.readLine();
            bufferedReader.close();
            return firstLine;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return firstLine;
    }

}
