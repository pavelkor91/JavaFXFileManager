package com.filemanager.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiskFinder {

    private static List<File> roots = new ArrayList<>();

    public static List<File> getRoots(){

        roots.addAll(Arrays.asList(File.listRoots()));
        return roots;
    }
}
