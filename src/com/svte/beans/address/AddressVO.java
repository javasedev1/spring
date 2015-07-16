package com.svte.beans.address;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigInteger;

public class AddressVO {
    @Id
    @Column(name="id")
    BigInteger addressID;
    @Column(name="street_id")
    BigInteger streetID;
    @Column(name="building")
    String building;
    @Column(name="apartment")
    String apartment;

    private static AddressVO addressVO = new AddressVO();

    public AddressVO() {
    }

    public AddressVO(BigInteger addressID, BigInteger streetID, String building, String apartment) {
        this.addressID = addressID;
        this.streetID = streetID;
        this.building = building;
        this.apartment = apartment;
    }

    public BigInteger getAddressID() {
        return addressID;
    }

    public void setAddressID(BigInteger addressID) {
        this.addressID = addressID;
    }

    public BigInteger getStreetID() {
        return streetID;
    }

    public void setStreetID(BigInteger streetID) {
        this.streetID = streetID;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public static AddressVO createInstance() {
        return addressVO;
    }
}
