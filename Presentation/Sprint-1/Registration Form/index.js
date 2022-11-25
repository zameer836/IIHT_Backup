

function genderVal() {
    let gender = document.getElementById("gender");
    if(!(gender.value=="Male" || gender.value=="Female")) {
        alert("Enter Male or Female");
        return false
    }
}

function textVal(id) {
    let text = document.getElementById(id);
    if(text.value=="") {
        alert("This field cannot be empty")
        return false
    }
    
}

function changebgcolor(input) {
    var text = document.getElementById(input).style.backgroundColor = "#FE6848";
}


function onHover(input) {
    document.getElementById(input).style.background="#A8FF9B";
}

function validateForm() {
    let fullName = document.getElementById("fullname");
    let email = document.getElementById("email");
    
     console.log(fullName);
     console.log(email);
       
}
