# <u>SureCloud Interview Task</u> #

A skeleton project to write and run tests written in cucumber.

### Objective

Visit https://qa-interview-service.public.test.uk.surecloud.com/login. Here you will be presented with a login page.

The objective is to write a set of cucumber scenarios of how you would test the login page.

Once a list of scenarios have been created, select one and write the backend step definitions to be able to execute the test.

### Notes

There is one user setup that will log in. Their credentials are:

| Email                        | Password            |
|------------------------------|---------------------|
| test-candidate@surecloud.com | supersecretpassword |

This task should take no longer than 45 minutes.

To run the test scenarios, a run configuration `Run Test` has been created to do this for you.  
Alternatively you can run this from a command line `./gradlew test -P cucumber.tags="@QATask"`  
