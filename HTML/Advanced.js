class Employee {
    setEmployee(name,id,position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }
    getEmployeeName() {
        return this.name;
    }
    getEmployeeId() {
        return this.id;
    }
    getEmployeePosition() {
        return this.position;
    }
}

let emp1 = new Employee();
let emp2 = new Employee();

emp1.setEmployee("Nishant", 123, "full stack dev");
emp2.setEmployee("walter", 1234, "sr. dev");


console.log(emp1.getEmployeeName);
console.log(emp1.getEmployeeId);
console.log(emp1.getEmployeePosition);
console.log(emp2.getEmployeeName);