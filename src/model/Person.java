package model;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private StringProperty name;
    private StringProperty phone;
    private StringProperty email;
    private IntegerProperty salary;

   public Person(String name,String phone,String email,Integer salary){
        setName(name);
        setEmail(email);
        setPhone(phone);
        setSalary(salary);
   }
   public Person(){
       setName("test");
       setSalary(0);
       setPhone("test");
       setEmail("test");
   }

    public String getName() {
        return name.get();
    }

    public String getPhone() {
        return phone.get();
    }

    public String getEmail() {
        return email.get();
    }

    public int getSalary() {
        return salary.get();
    }

    public StringProperty nameProperty() {
       if (name == null)
           name = new SimpleStringProperty();
        return name;
    }
    public StringProperty phoneProperty() {
        if (phone == null)
            phone = new SimpleStringProperty();
        return phone;
    }
    public StringProperty emailProperty() {
        if (email == null)
            email = new SimpleStringProperty();
        return email;
    }
    public IntegerProperty salaryProperty() {
        if (salary == null)
            salary = new SimpleIntegerProperty();
        return salary;
    }

    public void setName(String name) {
        nameProperty().setValue(name);
    }

    public void setPhone(String phone) {
        phoneProperty().setValue(phone);
    }

    public void setEmail(String email) {
        emailProperty().setValue(email);
    }

    public void setSalary(int salary) {
        salaryProperty().setValue(salary);
    }

    @Override
    public String toString() {
        return getName() + " "+getEmail()+ " "+getSalary();
    }
}
