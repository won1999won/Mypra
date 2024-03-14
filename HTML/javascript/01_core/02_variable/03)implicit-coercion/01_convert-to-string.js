// 문자열 연결 연산자(+)는 문자열 타입이 아닌 피연산자를 문자열 타입으로 암묵적으로
// 변환한다

console.log(10+'20');

// 탬플릿 리터럴 표현식 삽입은 표현식의 결과를 문자열타입으로 암묵적 변환
console.log(`10+20:${10+20}`);

// 문자열 타입이 아닌 값을 문자열 타입으로 암묵적 변환하는 결과
console.log(1+''); //1
console.log(NaN+''); //NaN
console.log(Infinity+''); //Infinity
console.log(true+''); //true
console.log(null+''); //null
console.log(undefined+''); //undefined
// console.log(Symbol+''); //error
console.log({}+''); //Object Object
console.log([]+''); //""
console.log(function(){}+''); //function

