package com.iths;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/castles")
public class CastleController {

    private final CastleService castleService;

    public CastleController(CastleService castleService) {
        this.castleService = castleService;
    }

    @Get("/random")
    public Castle randomCastle() {
        return castleService.randomCastle();
    }
}