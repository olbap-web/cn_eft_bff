// package cl.duoc.ejemplo.bff.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
// import org.springframework.web.filter.CorsFilter;

// @Configuration
// public class CorsConfig {

//     @Bean
//     public CorsFilter corsFilter() {
//         CorsConfiguration configuration = new CorsConfiguration();
//         configuration.addAllowedOrigin("http://localhost:4200"); // Permite solicitudes desde localhost:4200
//         configuration.addAllowedMethod("*"); // Permite todos los métodos (GET, POST, etc.)
//         configuration.addAllowedHeader("*"); // Permite todos los encabezados
//         configuration.setAllowCredentials(true); // Permite credenciales (opcional)

//         UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//         source.registerCorsConfiguration("/**", configuration);
//         return new CorsFilter(source);
//     }
// }