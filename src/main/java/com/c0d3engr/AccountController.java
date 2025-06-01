package com.c0d3engr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/accounts") // supports versioning "api/v1"
public class AccountController {


    // This method return accounts
    @GetMapping
    public List<Account> getAccounts()
    {
        return List.of(
                new Account(
                1,
                "wetch",
                "account1@email.com"
        ),
        new Account(
                2,
                "vetch",
                "account2@email.com"
        )
        );
    }
}
