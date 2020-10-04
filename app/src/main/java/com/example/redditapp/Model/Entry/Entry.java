package com.example.redditapp.Model.Entry;

import com.tickaroo.tikxml.annotation.Attribute;
import com.tickaroo.tikxml.annotation.Xml;

@Xml(name = "entry")
public class Entry {

    @Attribute(name = "content")
    public String content;

    @Attribute(name = "title")
    public String title;

    @Attribute(name = "id")
    public String id;

    @Attribute(name = "author")
    public Author author;

    @Attribute(name = "updated")
    public String updated;

    public Entry() {
    }

    public Entry(String content, String title, String updated) {
        this.content = content;
        this.title = title;
        this.updated = updated;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "content='" + content + '\'' +
                ", title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", author=" + author +
                ", updated='" + updated + '\'' +
                "}\n" +
        "==============================================================================";
    }
}
