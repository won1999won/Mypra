// ES11(ECMAScript2020)에서 도입된 연산자
// 좌향의 피 연산자가 null또는 undefined인 경우 undefined를 반환하고
// 그렇지 않으면 우향의 프로퍼티 참조를 이어간다

var obj=null;

// let val=obj.value; //error

var val=obj?.value;
console.log(val);


var str="";

// str을 빈 문자열이라 falsy값으로 취급해 빈 문자열이 len에 담김
// var len=str&&str.length;
len=str?.length;
console.log(len);