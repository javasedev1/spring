package com.svte.service.address;

import com.svte.beans.address.AddressVO;

import java.math.BigInteger;
import java.util.List;

public interface CountryService {
    public List<AddressVO> getAllAddresses();
    public List<AddressVO> getAddressUnderState(BigInteger stateID);
    public List<AddressVO> getAddressUnderCity(BigInteger cityID);
    public List<AddressVO> getAddressUnderStreet(BigInteger streetID);

    public AddressVO addAddress(AddressVO addressVO);
    public void deleteAddress(BigInteger addressID);
    public AddressVO editAddress(BigInteger addressID);
}
