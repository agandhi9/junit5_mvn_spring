package com.example.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@Component
public class HttpClientReponseUtil {

    static final Logger LOGGER = LoggerFactory.getLogger(HttpClientReponseUtil.class);

    public HttpStatus getStatusCode(String url) {

            try {
                ClientHttpResponse response = new SimpleClientHttpRequestFactory().createRequest(new URI(url), HttpMethod.GET).execute();
                return response.getStatusCode();
            } catch (IOException | URISyntaxException e) {
                LOGGER.error("Connection refused: connect !!!", e);
            }
            return HttpStatus.NOT_FOUND;
        }
}
