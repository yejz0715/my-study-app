let arr = [
  ["a", "b"],
  ["c", "d"],
  ["e", "f"],
  ["g", "h"],
  ["i", "j"],
];
console.log(arr);

arr = new Array(5);
for (let i = 0; i < arr.length; i++) {
  arr[i] = new Array(2);
}

let arr1 = [
  [1, 2],
  [3, 4],
];
arr1.push([5, 6]);
console.log(arr1);

const row = 2;
const column = 2;
const arr2 = new Array(row);
console.log(arr2);

for (var i = 0; i < column; i++) {
  arr2[i] = new Array(2);
}
console.log(arr2);
