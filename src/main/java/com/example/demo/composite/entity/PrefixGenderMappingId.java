package com.example.demo.composite.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class PrefixGenderMappingId implements Serializable {

    private  Long prefixId;

    private Long GenderId;

}
