package com.iriand.core.object.DB.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User:IgalYadid
 * Date: 10/13/13
 * Time: 6:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class AdminChangeLog {

    private int id;

    private String owner;

    private Date date;

    private String field;

    private String oldValue;

    private String newValue;

    private int accountId;


    public AdminChangeLog(){
    }
}
