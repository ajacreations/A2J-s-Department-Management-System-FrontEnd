package com.example.aja;

public class leave_result_list {  public leave_result_list(String lea_id, String name, String reg, String res, String date, String year, String days, String result, String rslt) {

    this.lea_id=lea_id;
    this.name=name;
    this.reg=reg;
    this.res=res;
    this.date=date;
    this.year=year;
    this.days=days;
    this.result=result;
    this.rslt=rslt;
}

    public leave_result_list(){}

    String lea_id,name,reg,res,date,year,days,result,rslt;


    public String getLea_id() {
        return lea_id;
    }

    public void setLea_id(String lea_id) {
        this.lea_id = lea_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getReg() {
        return reg;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getRes() {
        return res;
    }

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setResult(String result) { this.result = result; }
    public String getResult(){ return result;}

    public String getRslt() {
        return rslt;
    }

    public void setRslt(String rslt) {
        this.rslt = rslt;
    }
}

