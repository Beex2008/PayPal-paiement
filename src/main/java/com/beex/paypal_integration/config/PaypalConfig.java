package com.beex.paypal_integration.config;

import com.beex.paypal_integration.config.paypal.PaypalController;
import com.paypal.base.rest.APIContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaypalConfig {

    private static final Logger log = LoggerFactory.getLogger(PaypalConfig.class);

    @Value("${paypal.client.id}")
    private String clientId;

    @Value("${paypal.client.secret}")

    private String clientSecret;

    @Value("${paypal.client.mode}")
    private String mode;

    @Bean
    public APIContext apiContext(){
        log.info("PayPal Client ID: {}", clientId);
        log.info("PayPal Mode: {}", mode);
        return new APIContext(clientId, clientSecret, mode);
    }
}
