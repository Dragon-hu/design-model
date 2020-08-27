package com.qianfeng.observer;

import org.junit.Test;

public class ObserverTest {
    @Test
    public void testObserver(){
        ConcreteSubject s = new ConcreteSubject();

        s.attach(new ConcreteObserver("X",s));
        s.attach(new ConcreteObserver("Y",s));
        s.attach(new ConcreteObserver("Z",s));

        s.setSubjectState("ABC");
        s.notice();
    }
}
