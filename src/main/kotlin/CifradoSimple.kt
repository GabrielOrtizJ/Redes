fun main(){
    val secreta ="hola"
    val cifrar = cifrar(secreta)
    println(cifrar)

    val desifrar = decifrar(cifrar)
    println(desifrar)
}

fun cifrar(secreta : String):String{
    return secreta.map { (it - 3).toChar() }.joinToString ("")
}
fun decifrar(secreta : String):String{
    return secreta.map { (it + 3).toChar() }.joinToString ("")
}
