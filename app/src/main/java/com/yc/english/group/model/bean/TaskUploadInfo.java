package com.yc.english.group.model.bean;

/**
 * Created by wanglin  on 2017/8/8 15:18.
 * 图片、语音、文件上传后返回结果
 */

public class TaskUploadInfo {

    private String file_path;

    private String file_name;

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }
}
