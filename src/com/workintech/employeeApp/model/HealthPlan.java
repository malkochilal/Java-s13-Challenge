package com.workintech.employeeApp.model;

import com.workintech.employeeApp.enums.Plan;

public class HealthPlan {
    private int id;
    private String name;
    private Plan plan;

    public HealthPlan(int id,String name,Plan plan){
        this.id=id;
        this.name=name;
        this.plan=plan;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Plan getPlan(){
        return plan;
    }
    public void setPlan(Plan plan){
        this.plan=plan;
    }
    //Bu metdou string ile gösterdiğinde nasıl görünürdü?
    public String toString(){
        return "Healthplan="+"id:"+id+" "+"name:"+name+"plan:"+plan;
    }
}
