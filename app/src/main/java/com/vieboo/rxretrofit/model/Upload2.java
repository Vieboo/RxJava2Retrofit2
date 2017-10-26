package com.vieboo.rxretrofit.model;

/**
 * Created by JacksonGenerator on 17-10-26.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Upload2 {
    @JsonProperty("path")
    private String path;
    @JsonProperty("disk")
    private String disk;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("uploadable_id")
    private String uploadableId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("uploadable_type")
    private String uploadableType;
    @JsonProperty("vieboo")
    private String vieboo;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUploadableId() {
        return uploadableId;
    }

    public void setUploadableId(String uploadableId) {
        this.uploadableId = uploadableId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUploadableType() {
        return uploadableType;
    }

    public void setUploadableType(String uploadableType) {
        this.uploadableType = uploadableType;
    }

    public String getVieboo() {
        return vieboo;
    }

    public void setVieboo(String vieboo) {
        this.vieboo = vieboo;
    }
}