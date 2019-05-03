# What is this

This is a tiny application to test the integration of [Micronaut Application Framework](<http://micronaut.io/>) and [Requery Data Access Library](<https://github.com/requery/requery>) with gradle build tool.

## Current status

I am able to run this application in Eclipse, but failed to build it with gradle. 

## Set up APT with Gradle in Eclipse

- Open menu "Window/Show View/Others...", Select "Gradle Tasks" & "Gradle Executions"
- Refresh "Gradle Tasks" Panel
- Run Gradle Task "ide/eclipse" in "Gradle Tasks" Panel
- Refresh Project in Package Explorer
- (Optional) Execute "Refresh Gradle Project" in Package Explorer context menu 
 
## Initial Database

- run the provided sql: tables.sql
- modify jdbc connection url, username and password in application.yml

## Run Application in Eclipse

- select "Application.java" in Package Explorer and execute "Run As -> Java APplication" from context menu

## Build From Gradle Command Line

```sh
./gradlew build
```

The above command fails. Need help to solve this!