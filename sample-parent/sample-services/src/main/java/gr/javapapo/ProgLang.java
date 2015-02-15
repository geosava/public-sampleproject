/***********************************************************************************************************************
 * Copyright (c) 2014. Betiator.com All Rights Reserved.
 **********************************************************************************************************************/

package gr.javapapo;

/**
 * Simple Pojo to represent a Programming Language
 * Created by papo on 2/15/15.
 */
public class ProgLang{

    private String name;
    private String inventor;
    private int yearOfBirth;

    public ProgLang(String aName,String anInventor, int aYear){
        this.name=aName;
        this.inventor=anInventor;
        this.yearOfBirth= aYear;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getInventor(){
        return inventor;
    }

    public void setInventor(String inventor){
        this.inventor=inventor;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth=yearOfBirth;
    }
}