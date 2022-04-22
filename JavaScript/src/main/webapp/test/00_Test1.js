const person = {
  info: {
    name: "남주혁",
    gender: "male",
    job: "actor",
    introduce: function () {
      return `Hi, I'm ${this.name}`;
    },
    favorites: {
      foods: ["pizza", "milk", "candy"],
      color: "pink",
    },
  },
};
//console.log(person.info.favorites.color);
// Q1. 구조분해할당을 사용하여 color값 구하기
const {
  info: {
    favorites: { color, foods },
  },
} = person;
console.log(color);
// Q2. food 배열을 map을 사용하여 아래와 같은 형식으로 출력하기
// 출력 형식 : ["1 pizza","2 milk","3 candy"] ** index 주의할 것(1부터 시작)

const f = foods.map((food, index) => ` ${index + 1} ${food}`);
console.log(f);

// Q3. introduce() 1) 결과값에 m이 포함되어 있는지 확인하고,
// 2) 있다면 해당 문자열의 위치를 출력하고 없다면 없음이라는 결과를 출력하기
const {
  info: { introduce },
} = person;

const a = introduce();
// console.log(a.includes("m"));
// console.log(a.indexOf("m"));

if (a.includes("m")) {
  console.log(a.indexOf("m"));
} else {
  console.log("없음");
}
