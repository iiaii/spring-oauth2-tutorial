package me.iiaii.oauth2withentities.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IndexControllerTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void 메인페이지_로딩() throws Exception {
        // given
        String body = this.restTemplate.getForObject("/", String.class);

        
        // when
        
        
        // then
        assertThat(body).contains("스프링 부트로 시작하는 웹 서비스");
    }
}