/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Coachclass.CoachClassdirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import userinterface.MarketCashierRole.MarketCashierWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.FitnessCoachRole.coachWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class FitnessCoachRole extends Role {

    private CoachClassdirectory ccd;

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        this.ccd=new CoachClassdirectory();
        return new coachWorkAreaJPanel(userProcessContainer, account, organization, business,ccd);
    }

}
