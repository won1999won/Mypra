/* 2. 단축 평가 */
/* 표현식을 평가하는 도중 평가 결과가 확정된 경우 나머지 평가 과정을 생략하는 것 */

/* 논리 연산자 (logical operator) 
    - || (OR)
    - && (AND)
    - ! (NOT)
*/

// OR, AND 연산자 표현식의 결과는 boolean이 아닐 수도 있다.

// OR의 경우 'apple'이 이미 Truthy 값이므로 true로 평가되고,
// 논리 연산의 결과를 결정한 첫 번째 피연산자 apple을 그대로 반환한다.
console.log('apple' || 'banana');   // apple
console.log(false || 'banana');     // banana
console.log('apple' || false);      // apple


console.log('apple' && 'banana');   // banana
console.log(false && 'banana');     // false
console.log('apple' && false);      // false

var num = 1;

if(num % 2 == 0) {
    console.log('짝수');
} else {
    console.log('홀수');
}

num % 2 == 0 && console.log('짝수');
num % 2 == 0 || console.log('홀수');


// 객체를 가리키기를 기대하는 변수가 null 또는 undefined가 아닌지 확인하고 
// 프로퍼티를 참조할 때 단축 평가를 유용하게 활용할 수 있다.
var obj = null;

// var val = obj.value;  //TypeError: Cannot read properties of null (reading 'value')

// obj가 Falsy(null, undefined) 값이면 좌항만 실행하여 var <- null
// obj가 Truthy 값이면 var <- obj.value
var val = obj && obj.value;




