// ; Boolean 생성자 함수를 new 연산자 없이 호출한다.
// ; ! 부정 논리 연산자를 두 번 사용한다.

console.log(Boolean('JavaScript')); // Boolean 생성자 함수
console.log(Boolean(''));
console.log(Boolean(1));
console.log(Boolean(0));
console.log(Boolean(Nan));
console.log(Boolean(Infinity));
console.log(Boolean(null));
console.log(Boolean(undefined));
console.log(Boolean({}));
console.log(Boolean([]));


console.log(!!'JavaScript'); // ! 부정 논리 연산자 두번 사용
console.log(!!'');
console.log(!!1);
console.log(!!0);
console.log(!!Infinity);
console.log(!!null);
console.log(!!undefined);
console.log(!!{});
console.log(!![]);

