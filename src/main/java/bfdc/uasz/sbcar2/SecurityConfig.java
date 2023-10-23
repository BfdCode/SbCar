package bfdc.uasz.sbcar2;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;

import bfdc.uasz.sbcar2.service.UserDetailsServiceImpl;



@Configuration
public class SecurityConfig {
    
    // @Autowired
    // private UserDetailsServiceImpl userDetailsService;

    // @Autowired
    // public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    //     auth.userDetailsService(userDetailsService)
    //     .passwordEncoder(new BCryptPasswordEncoder());
    // }


}

// SecurityFilterChain configureSecurity(HttpSecurity http) throws Exception {
//     http.csrf().disable().cors().and().authorizeHttpRequests().anyRequest().permitAll();
//     return http.build();


