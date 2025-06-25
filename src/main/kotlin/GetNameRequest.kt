package org.example

object getNameRequest{
    var name : String? = null
        get() {
            return field
        }
        set(value) {field = value}

    fun printNameRequest(num : Int) : Boolean {
        if (name != null)
        {
            println("Client name is: $name, printed $num times")
            return true
        }
        else{
            println("Client name not found!")
            return false
        }
    }

}