package me.iiaii.oauth2tutorial.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // 어떤 것이 인증을 요구하는지 지정
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .antMatcher("/**").authorizeRequests()
                .antMatchers("/").permitAll()               // 보호될 필요 없는 uri
                .anyRequest().authenticated()
                .and()
                .oauth2Login();
    }
}
