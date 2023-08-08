"use strict";
let nums = [0, 1, 2, 2, 3, 0, 4, 2];
let val = 2;
let reader = 0;
let writer = 0;
for (reader; reader < nums.length; reader++) {
    if (nums[reader] !== val) {
        nums[writer++] = nums[reader];
    }
}
console.log(writer);
//# sourceMappingURL=app.js.map