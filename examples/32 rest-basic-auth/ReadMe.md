using rest basic auth


csrf : cross site request forgery : http session can be tracked by third party

to avoid csrf attacks enable csrf

spring enable csrf protection by default

or you can manually do by calling method

          public class SecurityConfig extends WebSecurityConfigurerAdapter{
            @Override
            protected void configure(HttpSecurity http) throws Exception {
              http.csrf().disable()  //this line disables csrf attacks
              .authorizeRequests().anyRequest().authenticated().and().httpBasic();
            }
