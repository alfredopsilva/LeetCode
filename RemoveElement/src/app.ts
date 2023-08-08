// Parameters
// Nums => Array of Numbers
// Val => Integer to Remove from Nums 
// K => Nums Length

// Request
// Remove all Occurrences of Val in Nums
// Requires In-Place Solution

// Consideration
// Doesn't Matter what we return after K. 
// Remain integers can be returned in Any Order. 

let nums: number[] = [0, 1, 2, 2, 3, 0, 4, 2];
let val: number = 2; 

// Find ocurrencies
// Delete Ocurrencies 
// Change and Return this Array Length
// The approach above doesn't worked because we must solve this question with IN-PLACE algo.

let reader: number = 0; 
let writer: number = 0; 

for(reader; reader < nums.length; reader++)
{
    if(nums[reader] !== val)
    { 
        nums[writer++] = nums[reader]
    }
}

console.log(writer)


