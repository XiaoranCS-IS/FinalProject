/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FitnessCoachRole;
import Business.Role.PhysicalTherapistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PhysicalTherapistOrganization extends Organization{

    public PhysicalTherapistOrganization() {
        super(Organization.Type.PhysicalTherapist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PhysicalTherapistRole());
        return roles;
    }
     
   
    
    
}
