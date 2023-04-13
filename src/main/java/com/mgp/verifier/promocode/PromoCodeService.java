package com.mgp.verifier.promocode;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.Boolean.*;

@Service
@AllArgsConstructor
public class PromoCodeService {

    private final PromoCodeRepository promoCodeRepository;

    public PromoCodeValidationResponse validatePromoCode(String code) {
        return promoCodeRepository.findPromoCodeByCode(code)
            .map(codeFound -> new PromoCodeValidationResponse(TRUE, codeFound.getCode(), codeFound.getDiscountAmount()))
            .orElse(new PromoCodeValidationResponse(FALSE, code, 0));
    }

    public List<PromoCode> listAllPromoCodes(){
        return promoCodeRepository.findAll();
    }

}
