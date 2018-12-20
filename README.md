STEPS

1. Execute neosuniversity-config-server   application 
2. Execute neosuniversity-limit-service   application 
3. Execute on a browser
* http://localhost:8888/neosuniversity-config-server/qa
* You can see the correct information profile (qa)
* http://localhost:8080/limits
* You can see maximum= 22 and minimum= 2 values but you should see maximum= 33 and minimum= 3
* Beacause into bootstrap.properties file we have spring.profiles.active=qa but at Does not Change the profile enviroment.


4.- The properties files are on https://github.com/hhugohm/neosuniversity-config-local.git
* application-dev.properties
* application-qa.properties
* application.properties

