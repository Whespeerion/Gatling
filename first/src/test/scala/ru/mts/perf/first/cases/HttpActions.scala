package ru.mts.perf.first.cases

import io.gatling.http.Predef._
import io.gatling.core.Predef._

object HttpActions {

  val getMainPage = http("GET /")
    .get("/")
    .check(status is 200)

}
