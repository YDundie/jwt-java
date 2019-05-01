package com.dundie.security.jwtsecurity.contollers;

import com.dundie.security.jwtsecurity.model.JwtToken;
import com.dundie.security.jwtsecurity.model.JwtUser;
import com.dundie.security.jwtsecurity.security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator){
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping("/{userName}")
    public JwtToken generateToken(@RequestBody final JwtUser jwtUser){

        return new JwtToken(jwtGenerator.generate(jwtUser));



    }

}
