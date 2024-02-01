import java.util.Base64

fun main(){

    val palabra = "hola"
    val codifico = Base64.getEncoder().encodeToString(palabra.toByteArray())
    println(codifico)
    val descodificar = String(Base64.getDecoder().decode(codifico))
    println(descodificar)
}