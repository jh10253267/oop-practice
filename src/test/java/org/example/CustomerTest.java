package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * 음식점에서 음식을 주문하는 과정
 * 요구사항
 * 1.도메인을 구성하는 객체에는 어떤 것들이 있는지 고민
 * ㄴ손님(0), 메뉴판(0), 돈가스/냉면/만두(0), 요리사(0), 요리(o)
 * 2.객체들간의 관계를 고민
 * ㄴ 손님 -- 메뉴판.
 * ㄴ 손님 -- 요리사
 * ㄴ요리사 -- 요리
 * 3.동적인 객체를 정적인 타입으로 추상화하여 도메인 모델링하기
 * ㄴ손님 - 손님타입
 * ㄴ냉면/만두 -요리타입
 * ㄴ메뉴판 = 메뉴타입
 * 4.협력을 설계
 * 5.객체들을 포함하는 타입에 적절한 책임을 할당
 * 6.구현하기
 */

public class CustomerTest {
    @DisplayName("메뉴 이름에 해당하는 요리를 주문한다.")
    @Test
    void order() {
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 6000)));
        Cooking cooking = new Cooking();
        Customer customer = new Customer();
        assertThatCode(() -> customer.order("만두", menu, cooking));

    }
}
