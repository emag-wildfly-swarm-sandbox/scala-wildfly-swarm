package org.esmerilprogramming.sws

import org.jboss.shrinkwrap.api.ShrinkWrap
import org.wildfly.swarm.container.Container
import org.wildfly.swarm.jaxrs.JAXRSArchive

/**
 * @author Helio Frota
 */
object Main extends App {


  val container = new Container()

  val deployment = ShrinkWrap.create(classOf[JAXRSArchive], "scala-wildfly-swarm.war")
  deployment.addClass(classOf[ScalaResource])
  deployment.addAllDependencies()
  //container.start().deploy(deployment);

}
