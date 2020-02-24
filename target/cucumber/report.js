$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AnnualCover.feature");
formatter.feature({
  "line": 1,
  "name": "Create Annual cover",
  "description": "Existing user should be able to login to account using correct credentials",
  "id": "create-annual-cover",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Create Annual cover good",
  "description": "",
  "id": "create-annual-cover;create-annual-cover-good",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User navigates to test website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on Annual Cover button",
  "keyword": "Given "
});
formatter.match({
  "location": "mainPage_Steps.user_navigates_to_test_website()"
});
formatter.result({
  "duration": 225534614,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.mainPage_Steps.user_navigates_to_test_website(mainPage_Steps.java:9)\n\tat ✽.Given User navigates to test website(AnnualCover.feature:6)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "Existing user should be able to login to account using correct credentials",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login into account with correct credentials",
  "description": "",
  "id": "login-into-account;login-into-account-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User navigates to test website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the sign in button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters a valid username",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters a valid password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User ssie pałe",
  "keyword": "Then "
});
formatter.match({
  "location": "mainPage_Steps.user_navigates_to_test_website()"
});
formatter.result({
  "duration": 327883,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.mainPage_Steps.user_navigates_to_test_website(mainPage_Steps.java:9)\n\tat ✽.Given User navigates to test website(Login.feature:6)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "Login into account with incorect password",
  "description": "",
  "id": "login-into-account;login-into-account-with-incorect-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User navigates to test website",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User clicks on the sign in button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters a valid username",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters a not valid password",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User should see message about incorrect password",
  "keyword": "Then "
});
formatter.match({
  "location": "mainPage_Steps.user_navigates_to_test_website()"
});
formatter.result({
  "duration": 339185,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.mainPage_Steps.user_navigates_to_test_website(mainPage_Steps.java:9)\n\tat ✽.Given User navigates to test website(Login.feature:15)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 22,
  "name": "Login into account with incorect username",
  "description": "",
  "id": "login-into-account;login-into-account-with-incorect-username",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "User navigates to test website",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User clicks on the sign in button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User enters a not valid username",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User enters a valid password",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User should see message about not recognised user name",
  "keyword": "Then "
});
formatter.match({
  "location": "mainPage_Steps.user_navigates_to_test_website()"
});
formatter.result({
  "duration": 543835,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.mainPage_Steps.user_navigates_to_test_website(mainPage_Steps.java:9)\n\tat ✽.Given User navigates to test website(Login.feature:23)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("LoginBackGround.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "Existing user should be able to login to account using correct credentials",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Login into account with correct credentials",
  "description": "",
  "id": "login-into-account;login-into-account-with-correct-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "User enters \"\u003cUsername\u003e\" username",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enters \"\u003cPassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "login-into-account;login-into-account-with-correct-credentials;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 15,
      "id": "login-into-account;login-into-account-with-correct-credentials;;1"
    },
    {
      "cells": [
        "user1",
        "user1"
      ],
      "line": 16,
      "id": "login-into-account;login-into-account-with-correct-credentials;;2"
    },
    {
      "cells": [
        "user1",
        "user1"
      ],
      "line": 17,
      "id": "login-into-account;login-into-account-with-correct-credentials;;3"
    },
    {
      "cells": [
        "user2",
        "user1"
      ],
      "line": 18,
      "id": "login-into-account;login-into-account-with-correct-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to test website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the sign in button on homepage",
  "keyword": "And "
});
formatter.match({
  "location": "mainPage_Steps.user_navigates_to_test_website()"
});
formatter.result({
  "duration": 5179760,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.mainPage_Steps.user_navigates_to_test_website(mainPage_Steps.java:9)\n\tat ✽.Given User navigates to test website(LoginBackGround.feature:5)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "Login into account with correct credentials",
  "description": "",
  "id": "login-into-account;login-into-account-with-correct-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "User enters \"user1\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enters \"user1\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to test website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the sign in button on homepage",
  "keyword": "And "
});
formatter.match({
  "location": "mainPage_Steps.user_navigates_to_test_website()"
});
formatter.result({
  "duration": 418701,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.mainPage_Steps.user_navigates_to_test_website(mainPage_Steps.java:9)\n\tat ✽.Given User navigates to test website(LoginBackGround.feature:5)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 17,
  "name": "Login into account with correct credentials",
  "description": "",
  "id": "login-into-account;login-into-account-with-correct-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "User enters \"user1\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enters \"user1\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to test website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the sign in button on homepage",
  "keyword": "And "
});
formatter.match({
  "location": "mainPage_Steps.user_navigates_to_test_website()"
});
formatter.result({
  "duration": 495042,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.mainPage_Steps.user_navigates_to_test_website(mainPage_Steps.java:9)\n\tat ✽.Given User navigates to test website(LoginBackGround.feature:5)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "Login into account with correct credentials",
  "description": "",
  "id": "login-into-account;login-into-account-with-correct-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "User enters \"user2\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enters \"user1\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("LoginExt.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "Existing user should be able to login to account using correct credentials",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login into account with correct credentials",
  "description": "",
  "id": "login-into-account;login-into-account-with-correct-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User navigates to test website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the sign in button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \"\u003cUsername\u003e\" username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters \"\u003cPassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-into-account;login-into-account-with-correct-credentials;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 12,
      "id": "login-into-account;login-into-account-with-correct-credentials;;1"
    },
    {
      "cells": [
        "user1",
        "user1"
      ],
      "line": 13,
      "id": "login-into-account;login-into-account-with-correct-credentials;;2"
    },
    {
      "cells": [
        "user1",
        "user2"
      ],
      "line": 14,
      "id": "login-into-account;login-into-account-with-correct-credentials;;3"
    },
    {
      "cells": [
        "user2",
        "user1"
      ],
      "line": 15,
      "id": "login-into-account;login-into-account-with-correct-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Login into account with correct credentials",
  "description": "",
  "id": "login-into-account;login-into-account-with-correct-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User navigates to test website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the sign in button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \"user1\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters \"user1\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "mainPage_Steps.user_navigates_to_test_website()"
});
formatter.result({
  "duration": 717612,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.mainPage_Steps.user_navigates_to_test_website(mainPage_Steps.java:9)\n\tat ✽.Given User navigates to test website(LoginExt.feature:5)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "Login into account with correct credentials",
  "description": "",
  "id": "login-into-account;login-into-account-with-correct-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User navigates to test website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the sign in button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \"user1\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters \"user2\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "mainPage_Steps.user_navigates_to_test_website()"
});
formatter.result({
  "duration": 414656,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.mainPage_Steps.user_navigates_to_test_website(mainPage_Steps.java:9)\n\tat ✽.Given User navigates to test website(LoginExt.feature:5)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 15,
  "name": "Login into account with correct credentials",
  "description": "",
  "id": "login-into-account;login-into-account-with-correct-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User navigates to test website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the sign in button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \"user2\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters \"user1\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be taken to the successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "mainPage_Steps.user_navigates_to_test_website()"
});
formatter.result({
  "duration": 1630984,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.mainPage_Steps.user_navigates_to_test_website(mainPage_Steps.java:9)\n\tat ✽.Given User navigates to test website(LoginExt.feature:5)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});