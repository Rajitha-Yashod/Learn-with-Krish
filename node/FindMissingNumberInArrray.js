
//sum is the missing number;
function getMissingNumber(arr,n){

    var sum = ((n*(n+1))/2)+((n+1)*arr[0]);
     for(let i=0; i<n;i++)
     sum-=arr[i];

     var missingNumber=sum;
     //console.log(missingNumber);
         
     if(missingNumber < arr[n - 1]){ // missed a number but not first or last number
         return missingNumber;
     }else if (missingNumber%2==0 && n%2==1){ //number of array element is odd and last namber is missed
         return missingNumber;
     }else if(missingNumber%2==1 && n%2==1){ //number of array element is odd and first namber is missed
         return (missingNumber-(n+1));
     }else if(missingNumber%2 ==0 && n%2 ==0){ //number of array element is even and first namber is missed
         return (missingNumber-(n+1));
     }else if(missingNumber%2 == 1 && n%2 ==0){ //number of array element is even and last namber is missed
        return missingNumber;
         return missingNumber;
     }

}

 //var inputArray =[21,23,24,25,26,27,28,29,30]; // 9-elements
 var inputArray =[22,23,24,26,25,27,28,21];     // 8-elements
 inputArray.sort();

let arrayLength= inputArray.length;

let missingNumberIs=getMissingNumber(inputArray,arrayLength);

console.log("Missing Number is :"+missingNumberIs);
