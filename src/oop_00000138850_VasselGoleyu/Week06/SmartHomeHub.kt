package oop_00000138850_VasselGoleyu.Week06

class SmartHomeHub {

    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {

        for (device in devices) {

            if (device is Switchable) {
                device.turnOff()
            }

        }

    }

}