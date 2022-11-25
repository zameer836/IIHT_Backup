class Cars {
    setName(name) {
        this.name = name;
        console.log(name);
    }
    drive() {
        console.log("the car named "+ this.name + " is running");
    }
    stop() {
        console.log("this car named"+ this.name + " is stopping");
    }
}
class Mercedes extends Cars {
    driver(driverName) {
        console.log("this mercedes is being driven by "+ driverName );
    }
}

let w13 = new Mercedes();
w13.setName("F1 car");
w13.drive();
w13.stop();
w13.driver("lewis");
