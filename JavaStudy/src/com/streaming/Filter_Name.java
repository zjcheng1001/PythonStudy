package com.streaming;

import java.io.File;
import java.io.FilenameFilter;

public class Filter_Name implements FilenameFilter {
    String extendName;

    public void setExtendName(String extendName) {
        this.extendName = extendName;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(extendName);
    }
}
