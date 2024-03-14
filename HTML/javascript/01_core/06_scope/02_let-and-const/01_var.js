/* 1.var */

// 1. 변수 중복 선언 허용
var msg = "안녕하십니까~";
console.log(msg);

// 초기화문이 있는 변수 선언문은 JS엔진에 의해 var 키워가 없는 것처럼 동작한다.
var msg = "안녕히 가십시오~";
console.log(msg)

// 초기화문이 없는 변수 선언문은 중복 선언하면 무시된다.
var msg;
console.log(msg);

// 2. 함수 레벨 스코프 (function-level-scope.js에서 확인한 내용)
// 함수가 아닌 스코프에서 var키워드로 선언한 변수는 모두 전역 변수가 된다.

// 3. 변수 호이스팅
// var 키워드로 변수를 선언하면 변수 호이스팅이 일어난다.
// 즉, 변수 선언문 이전에 참조할 수 있다.

console.log(test);   // 변수는 선언 되었고 undefined로 초기화 되었다.
test = "안녕하세요! 반갑습니다!!";
console.log(test);
var test;       // 변수 선언은 런타임 이전에 암묵적으로 실행된다.
