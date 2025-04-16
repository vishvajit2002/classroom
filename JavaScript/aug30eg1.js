function myFunc(theObject)
{
    theObject.make="toyoto";
}
const mycar=
{
    make:"Honda",
    model:"Accord",
    year:1998,
};

console.log(mycar.make);
myFunc(mycar);
console.log(mycar.make);