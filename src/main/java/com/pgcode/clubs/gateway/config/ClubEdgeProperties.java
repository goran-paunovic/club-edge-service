package com.pgcode.clubs.gateway.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Goran Paunovic
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "club")
public class ClubEdgeProperties {
    private String catalogServiceUrl;
}
