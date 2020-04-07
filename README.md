# Stress test with Gatling on a Golang Calculator

## To run this test you need to have the SBT installed, you can find the instructions on this link "https://www.scala-sbt.org/download.html"

## Running the stress test

1. First you need to run the calculator by entering the following command ```go run microservice.go```
2. Now you can run the gatling test by entering the following command ```sbt gatling:test``` on the main folder
3. To see the results of the stress test, acess `{main_folder}/target/gatling/calculatorhistorysimulation-{timestamp}/index.html`
4. There are a Jenkinsfile to run the stress test on Jenkins too
