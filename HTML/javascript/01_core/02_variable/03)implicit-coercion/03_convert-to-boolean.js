// 자바스크립트 엔진은 불리언 타입이 아닌 값을 Truthy 값(참으로 평가 되는 값) 또는
// Falsy 값(거짓으로 평가되는 값)으로 구분한다.
// Truthy → true, Falsy → false로 암묵적 타입 변환된다

if(true) console.log("if(true)"); //true
if(false) console.log("if(true)"); //false
if(undefined) console.log("if(undefined)"); // fals
if(null) console.log("if(null)"); // fals
if(0) console.log("if(0)"); // fals
if(NaN) console.log("if(NaN)"); // fals
if('') console.log("if('')"); // fals
if('JavaScript') console.log("if('JavaScript')"); // true

// false undefined null 0 NaN ''은 falsy
// 이 이외의 모든 값은  trusy
