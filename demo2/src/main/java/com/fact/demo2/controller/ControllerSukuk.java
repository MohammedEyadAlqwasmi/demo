package com.fact.demo2.controller;

import com.fact.demo2.codeSukuk.DetailsSukuk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/sukuk")
public class ControllerSukuk {

    @Autowired
    WebClient.Builder client;


    @PostMapping("/Test")
    public DetailsSukuk  getWebClient()
    {
        MultiValueMap<String, String> bodyValues = new LinkedMultiValueMap<>();
        bodyValues.add("key", "value");
        bodyValues.add("another-key", "another-value");
     String url = "http://10.10.78.208:7003/soa-infra/resources/SukukALhaj/SUKAECHCheckCustomer!1.0/RestService/";
        DetailsSukuk detailsSukuk=  client.build().post().uri(url)
                .accept(MediaType.APPLICATION_FORM_URLENCODED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromFormData(bodyValues))
             .retrieve().bodyToMono(DetailsSukuk.class).block();
  return detailsSukuk;
    }
}
