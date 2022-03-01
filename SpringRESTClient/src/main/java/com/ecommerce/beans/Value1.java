package com.ecommerce.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value1 {

    private Long id;
    private String quote;

    public Value1() {
    }

    public Long getId() {
        return this.id;
    }

    public String getQuote1() {
        return this.quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote1(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}

