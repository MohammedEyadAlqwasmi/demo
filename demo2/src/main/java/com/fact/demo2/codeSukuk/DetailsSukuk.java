package com.fact.demo2.codeSukuk;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetailsSukuk {

    @JsonProperty("MessageHeader")
    public MessageHeader messageHeader;
    @JsonProperty("MessageBody")
    public MessageBody messageBody;
}
