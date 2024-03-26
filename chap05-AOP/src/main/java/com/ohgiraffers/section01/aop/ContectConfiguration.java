package com.ohgiraffers.section01.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//aspectj의 autoProxy 사용에 관한 설정을 해야 동작
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ContectConfiguration {


}
