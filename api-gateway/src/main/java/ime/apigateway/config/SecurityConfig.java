package ime.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {
	
    @Bean
    SecurityWebFilterChain SecurityWebFilterChain(ServerHttpSecurity serverHttpSecurity) {
    
    	return serverHttpSecurity
    			.csrf(ServerHttpSecurity.CsrfSpec::disable)
    			.authorizeExchange(exchanges -> exchanges.pathMatchers("/api/secondary-basic").permitAll()
                        								.anyExchange().authenticated())
    			.oauth2ResourceServer( oauth -> oauth.jwt( Customizer.withDefaults() ) )
    			.build();
    }
    
}
