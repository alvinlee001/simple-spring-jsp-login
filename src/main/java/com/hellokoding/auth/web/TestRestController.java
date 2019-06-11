/*
 * Copyright © 2018 iFAST Corporation Ltd (“iFAST Corp”)
 *
 * iFAST Corp (or any other iFAST entity as authorized by iFAST Corp) grants permission to you, to have access to the above source codes (the “Source Codes”).
 *
 * You may not use the Source Codes except in compliance with the agreement and/or instruction of iFAST Corp (or any other iFAST entity as authorized by iFAST Corp). Except as agreed in writing or required by applicable law, the Source Codes are given on an "as is" basis, without warranties of any kind, either express or implied including, without limitation, any warranties regarding the contents or accuracy of the Source Codes.
 *
 * Except to the extent required by applicable law, in no event will iFAST Corp (or any other iFAST entity as authorized by iFAST Corp) be liable to you on any legal theory for any special, incidental, consequential, punitive or exemplary damages arising out of the use of the Source Codes, even if iFAST Corp (or any other iFAST entity as authorized by iFAST Corp) has been advised of the possibility of such damages.
 *
 */

package com.hellokoding.auth.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestRestController {

    @CrossOrigin(origins = "localhost", allowedHeaders = "*")
    @GetMapping("/test/endpoint")
    public Map<String, String> testEndpoint() {
        Map<String, String> result = new HashMap();
        result.put("haha", "testing");
        return result;
    }
}
