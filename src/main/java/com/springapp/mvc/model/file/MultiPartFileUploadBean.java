package com.springapp.mvc.model.file;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by kimsanghwan on 5/17/2014.
 */
public class MultiPartFileUploadBean {

    private List<MultipartFile> files;

    public void setFiles(List<MultipartFile> files) {
        this.files = files;
    }

    public List<MultipartFile> getFiles() {
        return files;
    }
}