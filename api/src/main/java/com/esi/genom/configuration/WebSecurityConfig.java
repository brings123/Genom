package com.esi.genom.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.annotation.Resource;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true)
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource(name = "userService")
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtAuthenticationEntryPoint unauthorizedHandler;

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(encoder());
    }

    @Bean
    public JwtAuthenticationFilter authenticationTokenFilterBean() throws Exception {
        return new JwtAuthenticationFilter();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable().
                authorizeRequests()
                .antMatchers("/auth/*", "/signup","/annonces","/contacts","/documents","/document","/role","/event","/events/*").permitAll()
                .antMatchers("/users","/users/*","/users/username/*","/users/delete/*").permitAll()
                .antMatchers("/downloadFile/*","/uploadMultipleFiles","/uploadFile").permitAll()
                .antMatchers("/roles/*","/contacts/new","contacts/*","/contacts/all").permitAll()

                .antMatchers("/caracteristique","/caracteristique/*","/caracteristique/categorie/*","/caracteristiques").permitAll()
                .antMatchers("/categorie","/categorie/*","/categories").permitAll()
                .antMatchers("/classe","/classe/*","/classe/categorie/*","/classes").permitAll()
                .antMatchers("/image","/image/ressource/*","/image/*","/images").permitAll()
                .antMatchers("/localisation","/localisation/*/*","/localisation/*","/localisations","/localisation/ressource/*").permitAll()
                .antMatchers("/ressource","/ressource/name/*","/ressource/classe/*","/ressource/type/*","/ressource/categorie/*","/ressource/categorie/*","/ressource/*","/ressources").permitAll()
                .antMatchers("/type","/type/categorie/*","/type/*","/types").permitAll()
                .antMatchers("/valeur","/valeur/caracteristique/*","/valeur/ressource/*","/valeur/*","/valeurs").permitAll()
                .antMatchers("/valeurabs","/valeurabs/caracteristique/*","/valeurabs/ressource/*","/valeurabs/*","/valeursabs").permitAll()
                .antMatchers("/lot1/**").permitAll()
                .antMatchers("/lot5/**").permitAll()
                .antMatchers("/Institutions","/institutions/{id}","/Institutions/new").permitAll()
                .anyRequest().authenticated()
                .and()
                .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http
                .addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }

}