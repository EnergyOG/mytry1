console.log('this just a trail');
function sum (a,b){
    var result1 = a+b;
    return result1;
}
function subtract (c,d){
    var result2 = c-d;
    return result2;
}
function division(e,f){
    var result3 = e/f;
    return result3;
}

var a= 5;
var b= 3;
var c= 7;
var d= 2;
var e= 10;
var f= 4;

var result1 = sum(a,b);
var result2 = subtract(c,d);
var result3 = division(e,f);

console.log(sum);
console.log('The addition of a '+a+' and b'+b+' is your result '+result1);
console.log('The subtraction of c '+c+' and d'+d+' is your result '+result2);
console.log('The division of e '+e+' and f'+f+' is your result '+result3);