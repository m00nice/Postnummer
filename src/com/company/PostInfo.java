package com.company;

import java.util.ArrayList;

public class PostInfo {
    private String postnummer;
    private String by;

    public PostInfo(String postnummer, String by) {
        this.postnummer = postnummer;
        this.by = by;
    }

    public String getPostnummer() {
        return postnummer;
        }


    public String getBy() {
        return by;
    }

}
