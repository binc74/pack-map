package edu.osu.cse5236.group10.packmap.data.model;

import com.google.firebase.firestore.Exclude;

import java.util.ArrayList;
import java.util.List;

public class ActivityInfo extends BaseDocument {

    private String name;
    private String info;
    private boolean isActive;
    private List<LocationInfo> selectedLocations;

    public ActivityInfo() {
        name="";
        info="";
        isActive=false;
        selectedLocations=new ArrayList<>();
    }

    public ActivityInfo(String name, String info, boolean isActive, List<LocationInfo> selectedLocations) {
        this.name = name;
        this.info = info;
        this.isActive = isActive;
        this.selectedLocations = selectedLocations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<LocationInfo> getSelectedLocations() {
        return selectedLocations;
    }

    public void setSelectedLocations(List<LocationInfo> selectedLocations) {
        this.selectedLocations = selectedLocations;
    }

    @Override
    @Exclude
    public String getDocumentId() {
        return getName();
    }

    @Override
    public void setDocumentId(String documentId) {
        setName(documentId);
    }
}