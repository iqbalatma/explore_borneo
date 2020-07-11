package com.example.exploreborneo.entity;


import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class Message {

    @SerializedName("leg_id")
    @Expose
    private String legId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("committee_id")
    @Expose
    private Object committeeId;
    @SerializedName("official_type")
    @Expose
    private String officialType;

    public String getLegId() {
        return legId;
    }

    public void setLegId(String legId) {
        this.legId = legId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String name) {
        this.image = name;
    }

    public Object getCommitteeId() {
        return committeeId;
    }

    public void setCommitteeId(Object committeeId) {
        this.committeeId = committeeId;
    }

    public String getOfficialType() {
        return officialType;
    }

    public void setOfficialType(String officialType) {
        this.officialType = officialType;
    }

}