package edenilson.amaya.numeros_edenilson

class Calcular {
  fun dividir (numero:Int):String{
      val mensaje:String

      if (numero % 2 == 0){
          mensaje = "Es par"
      }
      else{
          mensaje = "Es impar"
      }
      return  mensaje
  }
}