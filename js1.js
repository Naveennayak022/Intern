const prompt = require("prompt-sync")();
var ageString = prompt("Please enter your age:");
var age = parseInt(ageString);
ageverify(age);
function ageverify(age)
{
var isUnder15 = age < 15;
if (isUnder15) {
  console.log("Age is less than 15");
} else {
  console.log("Age is 15 or greater");
}
}
