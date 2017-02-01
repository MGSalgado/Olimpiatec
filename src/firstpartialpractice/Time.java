/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialpractice;

/**
 *
 * @author alumno
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    @Override
    public String toString(){
        return this.hour+":"+this.minute+":"+this.second;
                    }
    public Time nextSecond(){
    
    }
    
    public Time previousSecond(){
        
    }
    
    }
    

