# README #

### What is this repository for? ###

From this project we are automating QA test cases. When QA gets a dev release, automated test cases 
will be run without any human interaction and result will be given as XML doc. This can be integrated 
with Jenkins for more advanced options like UI test reports and auto accept/reject the dev release

### Requirements ###
* Java 1.8
* Maven 3.5.0

### How to build/run ###

* run $mvn clean install

### Run test cases ###

On Terminal

* Test cases will run automatically when user build the project

ON IDE

* In IDE locate /octopus-test-automation/src/main/java/com/viweQwest/appTesting/TestPlan/testing.xml
* Run the testing.xml

Run only the selected test cases

* In IDE go to /octopus-test-automation/src/main/java/com/viweQwest/appTesting/scripts
* Run selected test cases

### Check results ###

* In target file locate surefire-reports directory. You can find generated reports in several formats