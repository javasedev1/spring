package com.svte.beans.address;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Component
@Entity
@Table(name = "country")
public class CountryVO implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    BigInteger countryID;

    @Column(name = "name")
    String name;
    @Column(name = "language_id")
    BigInteger languageID;

    public CountryVO() {
    }

    public CountryVO(BigInteger languageID, String name, BigInteger countryID) {
        this.languageID = languageID;
        this.name = name;
        this.countryID = countryID;
    }

    public BigInteger getCountryID() {
        return countryID;
    }

    public void setCountryID(BigInteger countryID) {
        this.countryID = countryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getLanguageID() {
        return languageID;
    }

    public void setLanguageID(BigInteger languageID) {
        this.languageID = languageID;
    }
}
