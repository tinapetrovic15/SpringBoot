package com.example.demo.helloword;

import javax.persistence.*;

@Entity
@Table
public class HelloWorld {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String language;
    private String translation;

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    private String shortcut;

    public HelloWorld(String language, String translation, String shortcut) {
        this.language = language;
        this.translation = translation;
        this.shortcut = shortcut;
    }

    public HelloWorld() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "HelloWord{" +
                "id=" + id +
                ", language='" + language + '\'' +
                ", translation='" + translation + '\'' +
                '}';
    }
}
