package com.liumapp.xml.manager.demo;

import java.util.Currency;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author liumapp
 * @file CurrencyAdapter.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/26/18
 */
public class CurrencyAdapter extends XmlAdapter<String, Currency> {

    /*
     * Java => XML
     * Given the unmappable Java object, return the desired XML representation.
     */
    public String marshal(Currency val) throws Exception {
        return val.toString();
    }

    /*
     * XML => Java
     * Given an XML string, use it to build an instance of the unmappable class.
     */
    public Currency unmarshal(String val) throws Exception {
        return Currency.getInstance(val);
    }

}