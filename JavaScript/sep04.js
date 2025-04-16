// function to chech if the input is an array
var is_array=fuhction(input)
{
    if(is_array(toString.call(input)==="[object Array]"))
    //return true if the input is 
    return true;
    //return false if the input is false
    return false;
    //testing the function with string
    console.log(is_array('Hai'));
    //testing the function with array
    console.log(is_array([1,2,3,4,5]));
}