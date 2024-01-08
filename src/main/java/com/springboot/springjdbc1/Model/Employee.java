package com.springboot.springjdbc1.Model;

public class Employee {
   private int eid;

    private String ename;

    private int eage;
   private String eaddress;

    @Override
    public String toString() {
        return "employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", eage=" + eage +
                ", eaddress='" + eaddress + '\'' +
                '}';
    }

    public void setEid(int eid){
       this.eid=eid;
   }
   public int getEid(){
       return eid;
   }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEname() {
        return ename;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    public String getEaddress() {
        return eaddress;
    }
    public void setEage(int eage) {
        this.eage = eage;
    }
    public int getEage() {
        return eage;
    }



}
