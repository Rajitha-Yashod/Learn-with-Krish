
//sum is the missing number;
function getMissingNumber(arr,n){

    var sum = ((n*(n+1))/2)+((n+1)*arr[0]);
     for(let i=0; i<n;i++)
     sum-=arr[i];

     var missingNumber=sum;
         return missingNumber;
}

 var inputArray =[26,24,25,22,21,27,29,28,30];
 inputArray.sort();

let arrayLength= inputArray.length;

let missingNumberIs=getMissingNumber(inputArray,arrayLength);

console.log("Missing Number is :"+missingNumberIs);
