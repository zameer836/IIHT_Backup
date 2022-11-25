if(passingMarks <= secureMarks) {
    resolve()
} else {
    reject()
}

Promise.then(function() {
    console.log("Congrates you have passed the exam");    
}).catch(function() {
    console.log("Try again next year , work harder, all the best!");
})

//console.log(a);

async function sayMyName() {
    const response = await fetch("https://api.github.com/users")
    console.log("before response");
    const users = await response.json();
    console.log("users resolved");
    return users;
}

console.log("before calling say my name text ");
let say = sayName();
console.log("after calling say my name text ");
say.then(users=> console.log(users));
console.log(say);
console.log("last calling say my name text ");
