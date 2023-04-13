package com.mgp.verifier.promocode;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PromoCodeController {

    private final PromoCodeService promoCodeService;

    @GetMapping(value = "/promo-code")
    public ResponseEntity<PromoCodeValidationResponse> validate(@RequestParam(required = true) String code) {
        return ResponseEntity.ok(promoCodeService.validatePromoCode(code));
    }

    @GetMapping(value = "/promo-codes")
    public ResponseEntity<List<PromoCode>> listAllPromoCodes(){
        return ResponseEntity.ok(promoCodeService.listAllPromoCodes());
    }
}
