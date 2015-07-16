package com.svte.beans.address;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigInteger;

public class StateVO {
    @Id
    @Column(name = "id")
    BigInteger stateID;
    @Column(name="country_id")
    BigInteger countryID;
    @Column(name="name")
    String name;

    public StateVO() {
    }

    public StateVO(BigInteger stateID, BigInteger countryID, String name) {
        this.stateID = stateID;
        this.countryID = countryID;
        this.name = name;
    }

    public BigInteger getStateID() {
        return stateID;
    }

    public void setStateID(BigInteger stateID) {
        this.stateID = stateID;
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
}
