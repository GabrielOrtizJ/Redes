import java.security.MessageDigest

fun main(){
    val texto = "hola"

    val sha512 = MessageDigest.getInstance("sha-512")

    val textoby = texto.toByteArray()

    val calcularhash = sha512.digest(textoby)

    val resltadoCorrecto = calcularhash.joinToString (""){"%02x".format(it)  }

    println(resltadoCorrecto)
}