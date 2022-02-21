package com.bibliography.stephen.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stephen_bibliography")
public class BiblioEntity {


    private String typeName;

    @Id
    @Column(name = "TITLE_NAME")
    private String titleName;

    @Column(name = "OBSERVATIONS")
    private String observations;

    @Column(name = "YEAR")
    private int bookYear;

    @Column(name = "PAGES")
    private int pages;

    public String getTypeName() {
        return typeName;
    }

    public BiblioEntity setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public String getTitleName() {
        return titleName;
    }

    public BiblioEntity setTitleName(String titleName) {
        this.titleName = titleName;
        return this;
    }

    public String getObservations() {
        return observations;
    }

    public BiblioEntity setObservations(String observations) {
        this.observations = observations;
        return this;
    }

    public int getYear() {
        return year;
    }

    public BiblioEntity setYear(int year) {
        this.year = year;
        return this;
    }

    public int getPages() {
        return pages;
    }

    public BiblioEntity setPages(int pages) {
        this.pages = pages;
        return this;
    }
}
