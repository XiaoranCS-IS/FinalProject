/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class MarketCoEnterprise extends Enterprise {
    
    private int total;
    public MarketCoEnterprise(String name){
        super(name,EnterpriseType.Market);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
