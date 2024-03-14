// 동적 타입(dynamic/weak type) 언어
// JavaScript, Python 등
// 자바스크립트는 var, let, const 키워드를 사용해 변수를 선언할 뿐 데이터 타입을 사전
// 에 선언하지 않는다.
// 즉, 동적 타입 언어는 변수 선언이 아닌 할당에 의해 타입이 결정(타입 추론)되며 재할당
// 에 의해 변수의 타입은 언제든지 동적으로 변할 수 있다.
// 변수의 값이 언제든지 변경 될 수 있기 때문에 값을 확인하기 전에는 타입을 확신할 수
// 없다.
// 개발자의 의도와 상관 없이 자바스크립트 엔진에 의해 암묵적으로 타입이 자동 변환되
// 기도 한다.
// 즉, 유연성은 높지만 신뢰성은 떨어진다.
// 이로 인해 변수를 사용하기 전 데이터 타입 체크를 하기도 하는데 이는 번거롭기도 하고
// 코드의 양도 증가한다.
// 동적 타입 언어의 단점을 보완하기 위해서 변수 사용 시 유의할 점은 다음과 같다.
// 1. 변수는 꼭 필요한 경우에 한해 제한적으로 사용
// 2. 변수의 유효 범위(스코프)를 최대한 좁게 만듦
// 3. 전역 변수 지양
// 4. 변수보다 상수를 사용해 값의 변경 억제
// 5. 변수명을 통해 변수의 목적이나 의미를 파악할 수 있도록 함


var test;
console.log(typeof test); //언디파인드

test=1;
console.log(typeof test); //넘버

test='java';
console.log(typeof test); //스트링

test=true;
console.log(typeof test); //불린

test=Symbol();
console.log(typeof test); //심볼

test=null;
console.log(typeof test); //널(버그로 오브젝트로 출력)

test={};
console.log(typeof test); //오브젝트

test=[];
console.log(typeof test); //오브젝트

test=function(){};
console.log(typeof test); //오브젝트

