package com.svte.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigInteger;
import java.sql.Date;

public class CustomerInfo {
    @Id
    @Column(name= "id")
    private BigInteger customerID;
    private String firstName;
    private String secondName;
    private String middleName;
    @Temporal(value= TemporalType.DATE)
    private Date birthDay;
}
