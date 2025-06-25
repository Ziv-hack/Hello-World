package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var i = 0
    while(true)
    {
        print("Please enter client name:    ")
        getNameRequest.name = readlnOrNull()
        if(getNameRequest.printNameRequest(i))
        {
            i++
        }
        else{
            break
        }

    }

}