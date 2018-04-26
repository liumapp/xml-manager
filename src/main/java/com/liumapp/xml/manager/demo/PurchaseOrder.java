package com.liumapp.xml.manager.demo;

/**
 * @author liumapp
 * @file PurchaseOrder.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/26/18
 */
import java.util.Currency;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PurchaseOrder {

 private Double amount;

 @XmlJavaTypeAdapter(CurrencyAdapter.class)
 private Currency currency;

}