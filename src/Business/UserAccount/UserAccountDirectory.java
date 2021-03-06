/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, String mail, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setMail(mail);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    public void deleteUseraccount (String name){
        for (UserAccount u : userAccountList) {
            if (u.getUsername().equals(name))
                userAccountList.remove(u);
        }
    }
    public UserAccount getUserAccountByName(String name) {
        for (UserAccount u : userAccountList) {
            System.out.println(u.getUsername());
            if (u.getUsername().equals(name))
                return u;
        }
        return null;
    }
}
