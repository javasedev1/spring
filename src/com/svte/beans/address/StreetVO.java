package com.svte.beans.address;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigInteger;

public class StreetVO {
    @Id
    @Column(name = "id")
    BigInteger streetID;
    @Column(name = "city_id")
    BigInteger cityID;
    @Column(name = "name")
    String name;

    public StreetVO() {
    }

    public StreetVO(BigInteger streetID, BigInteger cityID, String name) {
        this.streetID = streetID;
        this.cityID = cityID;
        this.name = name;
    }

    public BigInteger getStreetID() {
        return streetID;
    }

    public void setStreetID(BigInteger streetID) {
        this.streetID = streetID;
    }

    public BigInteger getCityID() {
        return cityID;
    }

    public void setCityID(BigInteger cityID) {
        this.cityID = cityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
