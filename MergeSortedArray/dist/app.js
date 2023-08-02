"use strict";
function merge(nums1, m, nums2, n) {
    nums1.splice(m, nums2.length + nums1.length);
    if (n > 0) {
        for (let i = 0; i < n; i++) {
            nums1.push(nums2[i]);
        }
    }
    return nums1.sort((a, b) => a - b);
}
;
console.log(merge([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 2));
console.log(merge([1], 1, [], 0));
console.log(merge([0], 0, [1], 1));
//# sourceMappingURL=app.js.map