"use strict";
let nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4];
let reader = 1;
let writer = 1;
for (reader; reader < nums.length; reader++) {
    if (nums[reader] !== nums[reader - 1]) {
        console.log(`Nums reader => ${nums[reader]} \n Nums Writer => ${nums[writer]}`);
        nums[writer] = nums[reader];
        writer++;
    }
}
console.log(writer);
//# sourceMappingURL=app.js.map