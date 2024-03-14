// 02 문자열타입

var string;
string ='javascript';// ''
string ="javascript";// ""
string =`javascript`;// ``   전부 사용해도 문제없음

string='작은 따옴표로 간싼 문자열 내의 "큰따옴표"는 문자열로 인식';
string="큰따옴표로 감싼 문자열내의 '작은따옴표'는 문자열로인식";

console.log(string);

// 탬플릿 리터럴

// ES6부터 도입된 백틱을 사용한 표현식
// 멀티라인 문자열 표현식 사용등
// 편리한 문자열 저리기능을 제공하는 문자열 표기법

// 일반문자열에서는 줄바꿈을 허용하지않음
// var str='뭔 
// 소리야';  

// 이스케이프 시쿤스를 사용
var str='뭔 \n소리야';

// 백틱 ` 사용시 줄바꿈허용
var multiline=`뭔,
소리야`;
// 표현식 삽입은 백틱내에서만 가능,일반 문자열 내에서는 문자열 취급
var lastname=`다`;
var fname='람쥐';
console.log('난'+fname+lastname+'다');
console.log(`난${lastname}인 ${fname} 다`);