package com.testdroid.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.testdroid.api.APIEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michał Szpruta <michal.szpruta@bitbar.com>
 */
public class APIDeviceFilterGroup extends APIEntity {

    private String name;

    private boolean expanded;

    private boolean hidden;

    private List<APIDeviceFilter> deviceFilters = new ArrayList<>();

    public APIDeviceFilterGroup() {
    }

    public APIDeviceFilterGroup(Long id, String name, boolean hidden, boolean expanded) {
        super(id);
        this.name = name;
        this.hidden = hidden;
        this.expanded = expanded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public List<APIDeviceFilter> getDeviceFilters() {
        return deviceFilters;
    }

    public APIDeviceFilterGroup setDeviceFilters(List<APIDeviceFilter> deviceFilters) {
        this.deviceFilters = deviceFilters;
        return this;
    }

    @Override
    @JsonIgnore
    protected <T extends APIEntity> void clone(T from) {
        APIDeviceFilterGroup apiDeviceFilterGroup = (APIDeviceFilterGroup) from;
        cloneBase(from);
        this.name = apiDeviceFilterGroup.name;
        this.hidden = apiDeviceFilterGroup.hidden;
        this.expanded = apiDeviceFilterGroup.expanded;
        this.deviceFilters = apiDeviceFilterGroup.deviceFilters;
    }
}
