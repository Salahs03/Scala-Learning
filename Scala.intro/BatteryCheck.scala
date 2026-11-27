@main def batteryCheck() =
  val battery: Int = 15
  val needsCharging: Boolean = battery < 20
  if needsCharging then
    println("Plug in your charger")
  else println("Your battery is fine")