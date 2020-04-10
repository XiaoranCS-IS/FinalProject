/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FitnessCoachRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class MarketCashierOrganization extends Organization{

    public MarketCashierOrganization() {
        super(Organization.Type.MarketCashier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FitnessCoachRole());
        return roles;
    }
     
   
    
    
}
