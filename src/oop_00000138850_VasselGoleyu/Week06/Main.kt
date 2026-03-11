package oop_00000138850_VasselGoleyu.Week06

fun processCheckout(paymentMethod: PaymentMethod) {

    paymentMethod.pay(100000.0)

}

fun main() {

    val lamp = SmartLamp("1", "Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()

    hub.turnOffAllSwitches()

}