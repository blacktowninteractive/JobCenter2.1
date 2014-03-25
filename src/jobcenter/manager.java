/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jobcenter;

import javafx.beans.property.SimpleStringProperty;
 
public class manager {

    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty email;
    private final SimpleStringProperty phoneStr;
    private final SimpleStringProperty office;
    

    public manager(String fName, String lName, String email, String phone, String office) {
        this.firstName = new SimpleStringProperty(fName);
        this.lastName = new SimpleStringProperty(lName);
        this.email = new SimpleStringProperty(email);
        this.phoneStr = new SimpleStringProperty(phone);
        this.office = new SimpleStringProperty(office);
    }

    public String getOffice()
    {
        return office.get();
    }
    public void setOffice(String officeStr)
    {
        office.set(officeStr);
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
