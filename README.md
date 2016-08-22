# gae-springrest-gradle-seed
Standard Google App Engine + Gradle + Spring Rest seed

##	To run the application
	$ gradle appengineRun

The application will be build to war and kept in bin folder and the files are exploded to build folder
the application will run on port 8080, visit the below Url to launch the app on browser

	$ http://localhost:8080
	
## Unit Testing
	$ gradle test

This will do unit testing on the sourcecode and will produce the results in 
build -> reports -> tests directory

## Jacoco Code Coverage
	$ gradle jacocoTestReport

This will do unit testing on the sourcecode with debug:true options and will do instrumentation on the classes
and will produce the results in build -> reports -> jacoco directory