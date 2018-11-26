package com.temperocerto.gerenciamentotemperocerto

class Client(Name_ : String, Tel_ : Int, Local_ : String){

    var Name : String = Name_
    var Tel : Int = Tel_
    var Local : String = Local_
    var Saldo : Double? = 0.0

    fun setSaldo(value : Double){

        this.Saldo = this.Saldo!! + value

    }
}
