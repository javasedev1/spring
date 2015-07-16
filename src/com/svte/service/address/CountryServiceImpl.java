package com.svte.service.address;

import com.svte.beans.address.AddressVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Service("countryService")
@Transactional
public class CountryServiceImpl implements CountryService {
    public List<AddressVO> getAllAddresses() {
        return null;
    }

    public List<AddressVO> getAddressUnderState(BigInteger stateID) {
        return null;
    }

    public List<AddressVO> getAddressUnderCity(BigInteger cityID) {
        return null;
    }

    public List<AddressVO> getAddressUnderStreet(BigInteger streetID) {
        return null;
    }

    public AddressVO addAddress(AddressVO addressVO) {
        return null;
    }

    public void deleteAddress(BigInteger addressID) {

    }

    public AddressVO editAddress(BigInteger addressID) {
        return null;
    }
}
