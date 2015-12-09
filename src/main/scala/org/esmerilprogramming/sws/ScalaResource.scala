package org.esmerilprogramming.sws

import java.util.Date
import javax.ws.rs.{Path, GET}

/**
  * @author Helio Frota
  */
@Path("/")
class ScalaResource {

  @GET
  def get() = {
    "Hail at " + new Date()
  }
}
