/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Coachclass.CoachClass;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MyPC1
 */
public class FitnessCoEnterprise extends Enterprise {
    
    
    private ArrayList<CoachClass> allclasslist;
    
    public FitnessCoEnterprise(String name){
        super(name,EnterpriseType.Fitness);
        allclasslist= new ArrayList<CoachClass>();
        
//        CoachClass yoga=new CoachClass();
//        yoga.setClassname("yoga");
//        yoga.setCapacity(10);
//        yoga.setPerticipants(2);
//        yoga.setTime("");
//        yoga.setCoach("lyc");
//        
//        allclasslist.add(yoga);
        
    }
    
    public ArrayList<CoachClass> getAllClassList() {
        return allclasslist;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
