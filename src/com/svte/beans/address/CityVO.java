package com.svte.beans.address;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigInteger;

public class CityVO {
    @Id
    @Column(name="Id")
    BigInteger cityID;
    @Column(name="parent_id")
    BigInteger parentID;
    @Column(name="name")
    String name;

    public CityVO() {
    }

    public CityVO(BigInteger cityID, BigInteger parentID, String name) {
        this.cityID = cityID;
        this.parentID = parentID;
        this.name = name;
    }

    public BigInteger getCityID() {
        return cityID;
    }

    public void setCityID(BigInteger cityID) {
        this.cityID = cityID;
    }

    public BigInteger getParentID() {
        return parentID;
    }

    public void setParentID(BigInteger parentID) {
        this.parentID = parentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
