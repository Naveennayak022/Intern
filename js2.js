const prompt = require("prompt-sync")();
/*function greetPerson(name) {
  console.log("Hello, " + name + "!");
}
var userName = prompt("Please enter your name:");
greetPerson(userName);*/
var salutation = "Hello";
function greetPerson(name) {
  console.log(salutation + ", " + name + "!");
}
var userName = prompt("Please enter your name:");
greetPerson(userName);
