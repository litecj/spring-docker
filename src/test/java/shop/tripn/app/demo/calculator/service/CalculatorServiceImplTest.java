package shop.tripn.app.demo.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import shop.tripn.app.demo.calculator.entity.Calculator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@SpringBootTest
@RunWith(SpringRunner.class)
class CalculatorServiceImplTest {
    @Mock
    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator(2, 4);
    }

    @Test
    void test_multi(){
        System.out.println(">>> "+calculator.toString());
    }
}