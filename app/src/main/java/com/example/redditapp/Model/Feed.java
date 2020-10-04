package com.example.redditapp.Model;

import com.example.redditapp.Model.Entry.Entry;
import com.tickaroo.tikxml.annotation.Attribute;
import com.tickaroo.tikxml.annotation.Xml;

import java.util.List;

@Xml(name = "feed")
public class Feed {

    @Attribute(name = "icon")
    public String icon;

    @Attribute(name = "id")
    public String id;

    @Attribute(name = "logo")
    public String logo;

    @Attribute(name = "title")
    public String title;

    @Attribute(name = "updated")
    public String updated;

    @Attribute(name = "subtitle")
    public String subtitle;

    @Attribute(name = "entry")
    public List<Entry> entries;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    @Override
    public String toString(){
        return "Feed:  \n [Entries: \n" + entries + "]";

    }
}
