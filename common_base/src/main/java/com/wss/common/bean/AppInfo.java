package com.wss.common.bean;

import com.wss.common.base.bean.BaseBean;

import lombok.Getter;
import lombok.Setter;

/**
 * Describe：
 * Created by 吴天强 on 2018/11/20.
 */

@Getter
@Setter
public class AppInfo extends BaseBean {

    private int id;
    private int versionCode;
    private String versionName;
    private String describe;
    private String path;

    @Override
    public String toString() {
        return "AppInfo{" +
                "id=" + id +
                ", versionCode=" + versionCode +
                ", versionName='" + versionName + '\'' +
                ", describe='" + describe + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
