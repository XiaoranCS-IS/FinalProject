/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private EnterpriseDirectory coopEnterpriseDirectory;
    private String ename;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseDirectory getCoopEnterpriseDirectory() {
        return coopEnterpriseDirectory;
    }

    public enum EnterpriseType {
        Fitness("Fitness"),
        Market("Market"),
        PhysicalTherapy("PhysicalTherapy");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
//        this.ename = name;
        organizationDirectory = new OrganizationDirectory();
        coopEnterpriseDirectory = new EnterpriseDirectory();
    }

//    @Override
//    public String toString() {
//        return ename;
//    }

    public UserAccount getManagerUserAccount() {
        for (UserAccount ua : getUserAccountDirectory().getUserAccountList()) {
            if (ua.getRole().toString() == "Business.Role.ManagerRole") {
                return ua;
            }
        }
        return null;
    }
}
