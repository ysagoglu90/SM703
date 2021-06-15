package com.metu.sm703;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.metu.sm703.CollectorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroservicesSpringbootApplicationTests {

	@InjectMocks
	CollectorService collectorService;
	
	@Test
	public void addTwoDigits() {
		MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        
        
        assertThat(collectorService.collect("2", "3"))
        .isEqualTo(5);
        
	}
	
	@Test(expected = NumberFormatException.class)
	public void handleNotDigits() {
		MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        
        
        assertThat(collectorService.collect("a", "3"))
        .isEqualTo(5);
        
	}

}
