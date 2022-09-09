package com.github.reynoldsm88;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class Model {

    private int num;
    private String text;

}
