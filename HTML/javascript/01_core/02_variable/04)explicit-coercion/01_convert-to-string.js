// 개발자의 의도에 따라 값의 타입을 변환하는 것이다.
// 자바스크립트에서 기본 제공하는 표준 빌트인 생성자 함수(String, Number,
// Boolean)를 new 연산자 없이 호출하는 방법, 빌트인 메서드를 사용하는 방법, 암
// 묵적 타입 변환을 이용하는 방법이 있다.

// String 생성자 함수를 new 연산자 없이 호출한다.
console.log(String(10));
console.log(String(NaN));
console.log(String(Infinity));
console.log(String(true));
// Object.prototype.toString 메서드를 사용한다.
console.log((10).toString);
console.log((NaN).toString);

// 문자열 연결 연산자를 이용한다.
