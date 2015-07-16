package com.svte.helper;

import com.svte.beans.address.CountryVO;
import com.svte.utils.HibernateUtils;
import org.hibernate.Session;

public class CreateAddress {
    public static void main(String[] args) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();

        // Add new Employee object
        CountryVO countryVO = new CountryVO();
        countryVO.setName("SSSS");

        session.save(countryVO);
        session.getTransaction().commit();
        HibernateUtils.shutdown();
    }
}
