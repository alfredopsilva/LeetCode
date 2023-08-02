
function merge(nums1: number[], m: number, nums2: number[], n: number): number[] {

    nums1.splice(m, nums2.length + nums1.length)    

    //Validade if m > 0 
    if(n > 0){
        for(let i = 0; i< n; i++){
            nums1.push(nums2[i])
        }
    }

    return nums1.sort((a,b) => a - b); 
};

console.log(merge([1,2,3,0,0,0], 3, [2,5,6],2)); 
console.log(merge([1],1,[],0)); 
console.log(merge([0],0,[1],1)); 