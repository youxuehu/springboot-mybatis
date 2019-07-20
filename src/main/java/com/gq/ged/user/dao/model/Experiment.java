package com.gq.ged.user.dao.model;

public class Experiment {
    private Integer id;

    private String experimentName;

    private String experimentContext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExperimentName() {
        return experimentName;
    }

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName == null ? null : experimentName.trim();
    }

    public String getExperimentContext() {
        return experimentContext;
    }

    public void setExperimentContext(String experimentContext) {
        this.experimentContext = experimentContext == null ? null : experimentContext.trim();
    }
}