/*
    Example of a multi-line comment just like in C#/Java    
*/

// Single line comment

// Functions start with the word function
// - They don't have a return type
function variables() {
    const daysPerWeek = 7;  //declares a variable which value cannot be changed    
    console.log(`There are ${daysPerWeek} days in the week.`);

    let daysPerMonth = 30;  //declares a variable where value can be changed
    console.log(`There are ${daysPerMonth} days in the month.`);

    const weekdays = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];
    console.table(weekdays);
}

// Functions can accept parameters
//  - parameters do not define a data type
function printParameters(param1, param2) {
    console.log(`The value of param1 is ${param1}`);
    console.log(`The value of param2 is ${param2}`);
}


function equality(x, y) {

    console.log(`x is ${typeof x}`);
    console.log(`y is ${typeof y}`);

    console.log(`x == y : ${x == y}`);      // true
    console.log(`x === y : ${x === y}`);    // false
}

/* Objects are simple key-value pairs 
    - values can be primitive data types
    - values can be arrays
    - or they can be functions
*/
function objects() {

    const person = {
        firstName: "Bill",
        lastName: "Lumbergh",
        age: 42,
        employees: [
            "Peter Gibbons",
            "Milton Waddams",
            "Samir Nagheenanajar",
            "Michael Bolton"
        ],
        toString: function () {
            return `${this.lastName}, ${this.firstName} (${this.age})`;
        }
    };

    console.table(person);

    console.log(`${person.firstName} ${person.lastName}`);

    for (let i = 0; i < person.employees.length; i++) {
        console.log(`Employee ${i + 1} is ${person.employees[i]}`);
    }

    console.log(person.toString());
}


function callingFunctions() {
    const result1 = square(6);
    const result2 = square(2);
}


function square(value) {
    return value * value;
}

/*
#################
Scope
#################

Scope can get a little "odd" in JavaScript.
Functions can access variables declared outside of them, so be careful.
*/


/*
########################
Function Overloading
########################
 
Function Overloading is not available in Javascript. If you declare a 
function with the same name, more than one time in a script file, the 
earlier ones are overriden and the most recent one will be used. 
*/

function Add(num1, num2) {
    return num1 + num2;
}

function Add(num1, num2, num3) {
    return num1 + num2 + num3;
}

function Add(num1, num2 = 0, num3 = 0) {
    return num1 + num2 + num3;
}


/* 
########################
Math Library
########################
 
A built-in `Math` object has properties and methods for mathematical constants and functions.
*/

function mathFunctions() {
    console.log("Math.PI : " + Math.PI);
    console.log("Math.LOG10E : " + Math.LOG10E);
    console.log("Math.abs(-10) : " + Math.abs(-10));
    console.log("Math.floor(1.99) : " + Math.floor(1.99));
    console.log("Math.ceil(1.01) : " + Math.ceil(1.01));
    console.log("Math.random() : " + Math.random());
}


/*
########################
String Methods
########################

The string data type has a lot of properties and methods similar to strings in Java/C#
*/

function stringFunctions(value) {

    console.log(`.length -  ${value.length}`)
    console.log(`.endsWith('World') - ${value.endsWith('World')}`);
    console.log(`.startsWith('Hello') - ${value.startsWith('Hello')}`);
    console.log(`.indexOf('Hello') - ${value.indexOf('Hello')}`);

    /*
    Other Methods
        - split(string)
        - substr(number, number)
        - substring(number, number)
        - toLowerCase()
        - trim()
        - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String
    */
}







/*
########################
Array Methods
########################
*/
const inventors = [
    { first: 'Albert', last: 'Einstein', year: 1879, passed: 1955 },
    { first: 'Isaac', last: 'Newton', year: 1643, passed: 1727 },
    { first: 'Galileo', last: 'Galilei', year: 1564, passed: 1642 },
    { first: 'Marie', last: 'Curie', year: 1867, passed: 1934 },
    { first: 'Johannes', last: 'Kepler', year: 1571, passed: 1630 },
    { first: 'Nicolaus', last: 'Copernicus', year: 1473, passed: 1543 },
    { first: 'Max', last: 'Planck', year: 1858, passed: 1947 },
    { first: 'Katherine', last: 'Blodgett', year: 1898, passed: 1979 },
    { first: 'Ada', last: 'Lovelace', year: 1815, passed: 1852 },
    { first: 'Sarah E.', last: 'Goode', year: 1855, passed: 1905 },
    { first: 'Lise', last: 'Meitner', year: 1878, passed: 1968 },
    { first: 'Hanna', last: 'HammarstrÃ¶m', year: 1829, passed: 1909 }
  ];


function filterFunctions() {     
    // Inventors in the 1500s    
    // Using the .filter() method on the array, we have two ways of writing this
    // 1st option - calls this function once for each element
    const fifteen1 = inventors.filter(function(inventor) {         
        return inventor.year >= 1500 && inventor.year < 1600;
    })
                                    
    // 2nd option - uses arrow functions
    const fifteen2 = inventors.filter(inventor => inventor.year >= 1500 && inventor.year < 1600);

    console.table(fifteen1);
    console.table(fifteen2);
}


function sortFunctions() { 
    
    // Sort inventors by birthdate, oldest to youngest
    // Return 1 or higher if inventor1 is bigger/younger
    // Return -1 or lower if inventor1 is lower/older
    // Return 0 if inventor1 and inventor 2 are the same ge
    const oldest1 = inventors.sort(function(inventor1, inventor2) { 
        return (inventor1.year > inventor2.year) ? 1 : -1;
    });

    const oldest2 = inventors.sort((inventor1, inventor2) => inventor1.year > inventor2.year ? 1 : -1);

    console.table(oldest1);
    console.table(oldest2);
}
