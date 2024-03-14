// 산술 연산자의 피연산자는 모두 숫자여야 하므로, 숫자가 아닌 피연산자를 숫자 타입으
// 로 암묵적 타입 변환한다.

console.log(1+'24'); //124
console.log(1-'24'); //-23
console.log(1*'24'); //24
console.log(1/'24'); //0.0416
console.log(1%'javaScript'); //NaN

// 비교 연산자로 크기를 비교하기 위해 모두 숫자 타입이어야 하므로, 숫자가 아닌 피연산
// 자를 숫자 타입으로 암묵적 타입 변환한다.
console.log(10>'5');

// + 단항 연산자는 피연산자가 숫자 타입의 값이 아니면 숫자 타입의 값으로 암묵적 타입
// 변환한다

console.log(+'');
console.log(+'1');
console.log(+'javaScript');
console.log(+true);
console.log(+false);
console.log(+null);
console.log(+NaN);
console.log(+undefined);
console.log(+Symbol);
console.log(+{});
console.log(+[]);
console.log(+function(){});

// 빈 문자열 빈배열 null false=0으로 임시 형변환
// true=1로 임시 형변환
// 객체 undefined function은 변환되지않아 NaN


