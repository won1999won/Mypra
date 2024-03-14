// Number 생성자 함수를 new 연산자 없이 호출한다.
console.log(Number('10'));
console.log(Number('10,01'));
console.log(Number(true));
console.log(Number(false));
// parseInt, parseFloat 함수를 이용한다. (문자열 → 숫자만 가능)
console.log(parseInt('10')); // parseInt 함수
console.log(parseFloat('10.01')); // parseFloat 함수
console.log(parseInt('3.12'));
console.log(parseFloat('3.12'));
// + 단항 산술 연산자를 이용한다.
console.log(+''); // + 단항 연산자

// 산술 연산자를 이용한다.
console.log('10' * 1); // * 산술 연산자
console.log(true*1);
