const a=["hydrogen", "Helium", "Lithium", "Berryllium"];
const a2=a.map(function(s)
{
   return s.length;
});
console.log(a2); //[8,6,7,9]
const a3=a.map((S)=>S.length);
console.log(a3);