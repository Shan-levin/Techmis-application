/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techmis;

import java.sql.Date;

/**
 *
 * @author HUNTER
 */
class ToMedical {
    private String st_id,sub_id,type;
    private Date day;
    private int hours;
    public ToMedical(String st_id, String sub_id, Date day,String type,int hours)
    {
        this.st_id=st_id;
        this.sub_id=sub_id;
        this.day=day;
        this.type=type;
        this.hours=hours;
    }
    public String getst_id(){
        return st_id;
    }
    public String getsub_id(){
        return sub_id;
    }
    public Date getday(){
        return day;
    }
     public String gettype(){
        return type;
    }
      public int gethours(){
        return hours;
        
    }
    
}
