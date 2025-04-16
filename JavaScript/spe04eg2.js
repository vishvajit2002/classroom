var num=window.prompt();
var str=num.toString();
var result=[str[0]];

for(var x=1; x<str.length; x++)
{
    if(str[x-1])%2===0 && str[x]%2===0
    {
        console.log(result.push('-',str[x]));
        
        
    }
    else
    {
        console.log(result.push(str[x]));
    }
}