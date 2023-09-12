package com.fact.demo2.codeSukuk;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageHeader {

    @JsonProperty("TransactionID")
    public String transactionID;
    @JsonProperty("ApplicationCode")
    public String applicationCode;
    @JsonProperty("ApplicationUserName")
    public String applicationUserName;
}
