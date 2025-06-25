package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    while(true)
    {
        val name : String?
        print("Please enter your name: ")
        name = readlnOrNull()
        if(name != null)
        {
            println("The name of client is: $name")
        }
        else{
            println("Name not found")
            break
        }

    }

}