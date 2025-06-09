package org.scoula.app;

import org.scoula.config.ProjectConfig;
import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //새로 생성된 구성 클래스로 스프링이 컨텍스트 초기화
        //구성 클래스의 class를 매개변수로 지정
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //컨텍스트에서 원하는 빈 객체 추출하기
        Parrot p = context.getBean(Parrot.class);
        Parrot p2 = context.getBean(Parrot.class);
        System.out.println(p.getName());
        System.out.println(p2.getName());//똑같이 나옴

        System.out.println(p==p2);

        //getBean의 return 타입이 매번 다르며 캐스팅 없이 원하는 것을 리턴할 수 있다. 매개변수와 동일한 타입으로 리턴
        //getBean의 return 타입이 object 타입이라면 캐스팅을 해주어야 함
        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);
    }
}