import java.net.Socket

fun main() {

    val cliente = Socket("localhost",6000)
    cliente.getOutputStream().write("Hola amigo\n".toByteArray())
    cliente.close()

}