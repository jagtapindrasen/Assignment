$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/singtel/features/todos.feature");
formatter.feature({
  "name": "Manage todo list as a todoMVC user",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on twitter login page",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoSteps.redirect_ToLandingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Process",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I login with username \"8087688615\" and password \"Indrasen@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "TodoSteps.login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});