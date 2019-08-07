package computerdatabase

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class CalculatorHistorySimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("http://localhost:8080")
    .acceptHeader("application/json")

  val calculator = scenario("Stressing calculator history")
    .exec(http("Sum request 1")
      .get("/calc/sum/90/115"))
    .pause(3)
    .exec(http("Sum request 2")
      .get("/calc/sum/79/5454"))
    .pause(3)

    .exec(http("Sub request 1")
      .get("/calc/sub/800/640"))
    .pause(3)
    .exec(http("Sub request 2")
      .get("/calc/sub/640/800"))
    .pause(3)

    .exec(http("Multiplication request 1")
      .get("/calc/multi/27/46"))
    .pause(3)
    .exec(http("Multiplication request 2")
      .get("/calc/multi/46/27"))
    .pause(3)

    .exec(http("Division request 1")
      .get("/calc/div/4500/90"))
    .pause(3)
    .exec(http("Division request 2")
      .get("/calc/div/9000/45"))
    .pause(3)

    .exec(http("Potentiaton request 1")
      .get("/calc/pow/3/15"))
    .pause(3)
    .exec(http("Potentiaton request 2")
      .get("/calc/pow/15/3"))
    .pause(3)
    
    .exec(http("History request 1")
      .get("/calc/history"))
    .pause(3)
    .exec(http("History request 2")
      .get("/calc/history"))
    .pause(3)

  setUp(calculator.inject(atOnceUsers(500)).protocols(httpProtocol))
}
