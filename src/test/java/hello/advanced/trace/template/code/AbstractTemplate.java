package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

/**
 * 템플릿 메스트 패턴 테스트
 * 변하는 부분과 변하지 않는 부분 분리
 * 템플릿 메서드 패턴은 부모 클래스에 변하지 않는 템플릿 코드를 두고
 * 자식 클래스에 상속과 오버라이딩을 이용해 변하는 부분을 처리한다.
 */
@Slf4j
public abstract class AbstractTemplate {
    public void execute() {
        long startTime = System.currentTimeMillis();
        //비즈니스 로직 실행
        call();
        //비즈니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }

    protected abstract void call();
}
