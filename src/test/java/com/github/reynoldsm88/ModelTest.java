package com.github.reynoldsm88;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ModelTest {


    @Test
    public void verifyLombokAnnotations() {
        Model actual = Model.builder()
                            .num( 1 )
                            .text( "hello" )
                            .build();

        assertThat( 1, equalTo( actual.getNum() ) );
        assertThat( "hello", equalTo( actual.getText() ) );
    }

}
