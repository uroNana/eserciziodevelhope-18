//define a class Employee with:
//3 instance variables name, surname and address
//a constructor method that assigns 3 params (newEmployeeName, newEmployeeSurname, newEmployeeAddress) to the respective object's properties
//a method getEmployeeDetails() that returns an informative String with all the details of the Employee





class Employee {
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    private String name;
    private String surname;
    private String address;

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public String getEmployeeDetails() {
        return "Name: " + name + "\nSurname: " + surname + "\nAddress: " + address;
    }
}

