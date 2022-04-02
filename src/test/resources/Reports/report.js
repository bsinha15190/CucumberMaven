$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "Verifing Facebook Details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifining Facebook login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User in on Facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDfefn.user_in_on_Facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDfefn.username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDfefn.login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify success msg",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDfefn.success_msg()"
});
formatter.result({
  "status": "passed"
});
});