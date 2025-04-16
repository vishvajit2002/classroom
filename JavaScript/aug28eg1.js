var a=5;
var c=a+5;
var d="cat";
var e=d+"Blog";

const num1=5;
const num2=9;
const sum=num1+num2;
console.log("the result is"+ sum);

const side1=prompt("Enter the side1");
const side2=prompt("Enter the side1");
const side3=Pprompt("Enter the side1");
const final=(side1+side2+side3)/2;

const areavalue=Math.sqrt(final*(final-side1)*(final-side2)*(final-side3));
console.log("the area of the triangle is ${areavalue}");


var a=19;
if(a>18)
{
    console.log("you're eligible to vote");
}
else
{
    console.log("you're not eligible to vote");
}


var global_var1="hello"; //global
var mark=100; //global

function myfunction()
{
    console.log("the global values is"+global_var1);
}
{
    mark=200 //local variable
    console.log("the local value is"+mark)
}
