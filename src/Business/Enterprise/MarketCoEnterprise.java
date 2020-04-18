/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.foods.Food;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class MarketCoEnterprise extends Enterprise {
    
    private int total;
    private ArrayList<Food> foodlist;
    
    public MarketCoEnterprise(String name){
        super(name,EnterpriseType.Market);
        this.foodlist= new ArrayList();
        
        Food chips=new Food();
        chips.setName("lays-chips");
        chips.setPrice(4);
        chips.setStock(5);
        chips.setStatus(true);
        
        foodlist.add(chips);
        
    }

    public ArrayList<Food> getFoodlist() {
        return foodlist;
    }

    public void setFoodlist(ArrayList<Food> foodlist) {
        this.foodlist = foodlist;
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
