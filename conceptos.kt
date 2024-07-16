fun texto() {
    var nombree: String = "Valery_Sarith"
    println(nombree)
}


fun edad(){
    var contador: Int = 17
    println(contador)
}
fun texto2(){
    var apellido: String = "Zambrano \n"
	print (apellido)
}

//las constantes se declaran con la palabra "val" (las vuelve inmutables).
//Las variables se declaran con la palabra "var" (se pueden modificar)


fun lugarNacimiento (){
   val ciudad:String = "Bogota" 
   println (ciudad)
}
//la propiedad de opcional se define con parametros cuando declaramos la variable.
//Así, si llamamos la funcion "direccion()" Imprimirá que la dirección es desconocida. Pero si agregamos la direccion como parámetro entre los parentesis, mostrará
//lo que introduzcamos
fun direccion(name: String = "Desconocida"){
    println ("La dirección es $name.")
}

//Un valor puede dejarse nulo usando el operador "?" después del tipo de dato, esto asegura que el valor no pueda dejarse vacio ya que deben
//introducirse valores en los parámetros

fun color(colorOjos : String?){
    if (colorOjos != null )
	println("$colorOjos")
}

//función para llamar a todas las variables

fun main (){
    edad()
    texto()
	texto2()
	lugarNacimiento()
    direccion("Carrera 91")
    color("Cafes")
}

