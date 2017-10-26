package com.vieboo.rxretrofit.model;

/**
 * Created by JacksonGenerator on 17-10-26.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Zhuangbi<T> {
    @JsonProperty("upload_id")
    private Integer uploadId;
    @JsonProperty("upload")
    private T upload;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("description")
    private String description;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("content")
    private String content;
    @JsonProperty("file_size")
    private String fileSize;
    @JsonProperty("path")
    private String path;
    @JsonProperty("disk")
    private String disk;
    @JsonProperty("permitted_at")
    private String permittedAt;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("hotpoint")
    private Integer hotpoint;

    public Integer getUploadId() {
        return uploadId;
    }

    public void setUploadId(Integer uploadId) {
        this.uploadId = uploadId;
    }

    public T getUpload() {
        return upload;
    }

    public void setUpload(T upload) {
        this.upload = upload;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

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

    public String getPermittedAt() {
        return permittedAt;
    }

    public void setPermittedAt(String permittedAt) {
        this.permittedAt = permittedAt;
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

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHotpoint() {
        return hotpoint;
    }

    public void setHotpoint(Integer hotpoint) {
        this.hotpoint = hotpoint;
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Upload {
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