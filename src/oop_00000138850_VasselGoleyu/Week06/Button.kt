package oop_00000138850_VasselGoleyu.Week06

class Button(override val name: String) : Clickable {

    override fun click() {
        println("$name telah diklik")
    }

}