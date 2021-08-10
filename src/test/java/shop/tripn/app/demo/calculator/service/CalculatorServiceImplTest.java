package shop.tripn.app.demo.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org. mockito.BDDMockito.given;
import static org. assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
//@ExtendWith(MockitoExtension.class)
class CalculatorServiceImplTest {

    @MockBean
    CalculatorServiceImpl calculatorService;

    @Test
    void test_createRandomNumbers(){
        given(calculatorService.createRandomNumbers()).willReturn(30);
        assertThat(calculatorService.createRandomNumbers()).isEqualTo(30);
    }
}