package org.scoula.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//전달된 basePackages 하위 패키지에서 모두 뒤져서 Component 어노테이션이
//붙은 객체들을 찾아 컨텍스트에 등록한다.
@ComponentScan(basePackages = "org.scoula.domain")
public class ProjectConfig3 {
}
