package com.mgp.verifier.promocode;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PromoCodeValidationResponse {

    private Boolean isValid;
    private String code;
    private Integer discountAmount;

}
