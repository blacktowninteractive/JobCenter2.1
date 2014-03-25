/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jobcenter;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author vangfc
 */
public class employee {

    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty email;
    private final SimpleStringProperty phoneStr;
    private final SimpleStringProperty shpEmp55;

    public employee(String fName, String lName, String email, String phone, String shpEmp55) {
        this.firstName = new SimpleStringProperty(fName);
        this.lastName = new SimpleStringProperty(lName);
        this.email = new SimpleStringProperty(email);
        this.shpEmp55 = new SimpleStringProperty(shpEmp55);
        this.phoneStr = new SimpleStringProperty(phone);
        
    }

    
    public String getShopEmp() {
        return shpEmp55.get();
    }

    public void setShopEmp(String fffi) {
        shpEmp55.set(fffi);
    }

    
    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String fName) {
        firstName.set(fName);
    }

    public String getPhone() {
        return phoneStr.get();
    }

    public void setphone(String phoneStrVar) {
        phoneStr.set(phoneStrVar);
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String fName) {
        lastName.set(fName);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String fName) {
        email.set(fName);
    }
}
