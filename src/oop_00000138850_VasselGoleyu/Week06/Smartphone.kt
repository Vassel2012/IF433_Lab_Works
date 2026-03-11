package oop_00000138850_VasselGoleyu.Week06

class Smartphone : Camera, Phone {

    override fun takePhoto() {

        super<Camera>.takePhoto()
        super<Phone>.takePhoto()

    }

}