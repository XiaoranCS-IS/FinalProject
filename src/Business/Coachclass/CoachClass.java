/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Coachclass;

import Business.Role.CustomerRole;
import Business.Role.FitnessCoachRole;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author riverlin
 */
public class CoachClass {
    private String classname;
    private String coach;
    private int capacity;
    private int perticipants;
    private Date time;
    private ArrayList<CustomerRole> attendsheet;

    
    
    
    public CoachClass() {
        this.classname = classname;
        this.coach = coach;
        this.capacity = capacity;
        this.time = time;
        this.attendsheet = new ArrayList();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPerticipants() {
        return perticipants;
    }

    public void setPerticipants(int perticipants) {
        this.perticipants = perticipants;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public ArrayList<CustomerRole> getAttendsheet() {
        return attendsheet;
    }

    public void setAttendsheet(ArrayList<CustomerRole> attendsheet) {
        this.attendsheet = attendsheet;
    }
    @Override
    public String toString() {
        return classname;
    }
    
}
