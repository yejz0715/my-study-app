//String 내장함수

let userName = "안녕하세요! 저는 이예지입니다!";

// toUpperCase, toLowerCase
console.log(userName.toUpperCase()); // 모두 대문자로 변환
console.log(userName.toLowerCase()); // 모두 소문자로 변환

// indexOf, charAt
console.log(userName.indexOf("!")); // 검색할 문자열의 첫번째 위치를 반환
console.log(userName.charAt(5)); // 겁색할 위치에 어떤 문자열이 있는지 반환

// trim
console.log(userName.trim()); // 문자열의 앞/뒤 공백 제거

// substring, substr
console.log(userName.substring(6, 17)); // 시작위치 - 끝위치까지 문자열 잘라서 사용
console.log(userName.substr(0, 6)); // 시작위치 - 갯수

// replace, replaceAll
console.log(userName.replace("!", "?")); // 검색할 문자열의 첫번째 위치만 변경
console.log(userName.replaceAll("!", "?")); // 문자열 전체에서 검색할 문자열을 찾아 변경

// repeat
console.log(userName.repeat(3)); // 입력한 횟수만큼 문자열을 반복하여 출력
//split
console.log(userName.split(" ")); // 입력한 문자열을 기준으로 나눔(쪼갬)

console.log(userName.includes("안녕")); // return type true/false,문자열이 포함되어있다면 true, 없으면 false