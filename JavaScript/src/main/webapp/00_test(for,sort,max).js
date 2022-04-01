//최댓값 for문
const numArr = [2, 34, 4, 5, 76];

function solutionF(arr) {
  let maxNum = arr[0];

  for (let i = 1; i < arr.length; i++) {
    if (maxNum < arr[i]) {
      maxNum = arr[i];
    }
  }
  return maxNum;
}
console.log(solutionF(numArr));

//sort
function solutionS() {
  numArr.sort((a, b) => a - b);
  return numArr[numArr.length - 1];
}
console.log(solutionS(numArr));

//max
function solutionM() {
  let m = Math.max(...numArr);
  return m;
}
console.log(solutionM(numArr));
