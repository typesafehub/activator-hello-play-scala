package controllers

import javax.inject.{Inject}

import play.api.mvc.{Action, Controller}

class Application @Inject() (webJarAssets: WebJarAssets) extends Controller {
  def index = Action {
    Ok(views.html.index(webJarAssets, "Hello Play Framework"))
  }
}