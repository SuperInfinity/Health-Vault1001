package com.example.healthvault1001;

public class DataClass {

    private String dataTitle;
    private String dataDes;
    private String dataLang;

    public DataClass() {
    }

    private String dataImage;

    public String getDataTitle() {
        return dataTitle;
    }

    public String getDataDes() {
        return dataDes;
    }

    public String getDataLang() {
        return dataLang;
    }

    public String getDataImage() {
        return dataImage;
    }

    public DataClass(String dataTitle, String dataDes, String dataLang, String dataImage) {
        this.dataTitle = dataTitle;
        this.dataDes = dataDes;
        this.dataLang = dataLang;
        this.dataImage = dataImage;
    }
}
