package Com.cg;

import org.cg.CalculatorService;
import org.cg.ICalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CalServiceTest {

   private CalculatorService service;

    @BeforeEach
    public void init(){
        ICalculator cal= Mockito.mock(ICalculator.class);
        service=new CalculatorService(cal);

        when(cal.calculat(20,5)).thenReturn(25);
        when(cal.calculat(10,5)).thenReturn(15);
    }

    @Test
    void addserviceTest(){
//        assertEquals(25,service.addService(20,5));
        assertEquals(15,service.addService(10,5));
    }
}
