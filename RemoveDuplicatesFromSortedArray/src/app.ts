// Remove Duplicates from Sorted Array

// Data
// nums => Integer Array [ Non Decreasing Order ]

// Tasks 
// Remove the duplicates IN PLACE. 
// Each element should appear only once. 
// The relative order should be kept the same 

// Return 
// Number of unique elements. 

let nums: number[] = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]; 
let reader: number = 1; 
let writer: number = 1; 

for(reader; reader < nums.length; reader++)
{
    if(nums[reader] !== nums[reader - 1])
    {
        console.log(`Nums reader => ${nums[reader]} \n Nums Writer => ${nums[writer]}`)
        nums[writer] = nums[reader];
        writer++
    }
}

console.log(writer)
