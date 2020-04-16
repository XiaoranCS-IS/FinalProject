/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Coachclass;

import Business.Role.FitnessCoachRole;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author riverlin
 */
public class CoachClassdirectory {
    private ArrayList<CoachClass> CoachClasslist;

    public ArrayList<CoachClass> getCoachClasslist() {
        return CoachClasslist;
    }

    public void setCoachClasslist(ArrayList<CoachClass> CoachClasslist) {
        this.CoachClasslist = CoachClasslist;
    }

    public CoachClassdirectory() {
        this.CoachClasslist = new ArrayList() ;
    }
    public void deleteCoachClass(CoachClass coachClass){
        CoachClasslist.remove(coachClass);
        
    }
    public CoachClass addCoachClass(String classname,String coach,int capacity,Date time){
        CoachClass coachClass = new CoachClass();
        coachClass.setClassname(classname);
        coachClass.setCapacity(capacity);
        coachClass.setCoach(coach);
        coachClass.setTime(time);
        CoachClasslist.add(coachClass);
        return coachClass;
    }
    
}
