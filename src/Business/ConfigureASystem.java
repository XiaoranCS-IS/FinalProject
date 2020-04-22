package Business;

import Business.Employee.Employee;
import Business.Role.FitnessCoachRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");

        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", "434353173@qq.com", employee, new SystemAdminRole());
        return system;
    }
    
}
