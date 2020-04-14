package com.example.mutidatabase.entity;

import java.util.Date;

public class tcBrokerWhiteLabelImage {
    private Integer id;

    private String url;

    private String labelType;

    private String labelStatus;

    private Date sysInsertDatetime;

    private Date sysUpdDatetime;

    private String comment;

    public tcBrokerWhiteLabelImage(Integer id, String url, String labelType, String labelStatus, Date sysInsertDatetime, Date sysUpdDatetime, String comment) {
        this.id = id;
        this.url = url;
        this.labelType = labelType;
        this.labelStatus = labelStatus;
        this.sysInsertDatetime = sysInsertDatetime;
        this.sysUpdDatetime = sysUpdDatetime;
        this.comment = comment;
    }

    public tcBrokerWhiteLabelImage() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getLabelType() {
        return labelType;
    }

    public void setLabelType(String labelType) {
        this.labelType = labelType == null ? null : labelType.trim();
    }

    public String getLabelStatus() {
        return labelStatus;
    }

    public void setLabelStatus(String labelStatus) {
        this.labelStatus = labelStatus == null ? null : labelStatus.trim();
    }

    public Date getSysInsertDatetime() {
        return sysInsertDatetime;
    }

    public void setSysInsertDatetime(Date sysInsertDatetime) {
        this.sysInsertDatetime = sysInsertDatetime;
    }

    public Date getSysUpdDatetime() {
        return sysUpdDatetime;
    }

    public void setSysUpdDatetime(Date sysUpdDatetime) {
        this.sysUpdDatetime = sysUpdDatetime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}