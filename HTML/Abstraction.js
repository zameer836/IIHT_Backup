//Abstraction is a way of hiding implementation details and showing only the functionality to the users (hides the details, show the essentials)

function Employee(name, age, basesalary) {
    this.name = name;
    this.age = age;
    this.basesalary = basesalary;
    this.monthlyBonus = 10000;

    this.calculateFinalsalary = function() {
        let finalSalary = this.basesalary + this.monthlyBonus;
        console.log("final salary is : "+ finalSalary);
    }

    this.getEmployeeDetails = function () {
        console.log("name: "+ this.name+ " , Age: "+ " BaseSalary: "+ this.basesalary);
    }
}

let emp1 = new Employee("john", 30, 100000);
emp1.getEmployeeDetails();
emp1.calculateFinalsalary();
