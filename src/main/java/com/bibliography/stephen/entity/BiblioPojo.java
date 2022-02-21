package com.bibliography.stephen.entity;

public class BiblioPojo {

    private String typeName;
    private String titleName;
    private String observations;
    private int bookYear;
    private int pages;

    public String getTypeName() {
        return typeName;
    }

    public BiblioPojo setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public String getTitleName() {
        return titleName;
    }

    public BiblioPojo setTitleName(String titleName) {
        this.titleName = titleName;
        return this;
    }

    public String getObservations() {
        return observations;
    }

    public BiblioPojo setObservations(String observations) {
        this.observations = observations;
        return this;
    }

    public int getYear() {
        return bookYear;
    }

    public BiblioPojo setYear(int year) {
        this.bookYear = year;
        return this;
    }

    public int getPages() {
        return pages;
    }

    public BiblioPojo setPages(int pages) {
        this.pages = pages;
        return this;
    }
}