// 심벌은 ES6에서 추가된 7번째 타입으로, 변경 불가능한 원시 타입의 값이다.
// 다른 값과 중복 되지 않는 유일무이한 값으로 이름 충돌할 위험이 없는 객체의 유일
// 한 프로퍼티 키를 만들기 위해 사용한다.
// 심벌 이외의 원시 값은 리터럴을 통해 생성하지만 심벌은 Symbol 함수를 통해 호출
// 해 생성한다.
// 지금은 데이터 타입의 한 종류라고만 이해하고 넘어가면 된다. (자세한 내용은
// ES6+ 챕터에서 다룸)

var key=Symbol('key');
console.log(typeof key);


var obj={};
obj[key]='value';
console.log(obj[key]);


// 자바스크립트의 데이터 타입은 크게 원시 타입과 객체 타입으로 분류한다.
// 자바스크립트는 객체 기반의 언어이며, 자바스크립트를 이루고 있는 거의 모든 것이
// 객체이다.
// number, string, boolean, undefined, null, symbol 6가지 데이터 타입 이외의 값
// 은 모두 객체 타입이다.
// (객체, 함수, 배열 등에 대해서 추후 자세히 다룸)


var testobj={};
var testarr=[1,2,3,4,5];

console.log(typeof testobj);
console.log(typeof testarr);
