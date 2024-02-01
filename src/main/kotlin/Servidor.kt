import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.net.ServerSocket

fun main() = runBlocking{
    val server = ServerSocket(6000)

    println("servidor abierto en el puerto 6000")

    while(true){
        val cliente = server.accept()
        println("cliente conectado")

        launch (Dispatchers.IO){

            val resultado = cliente.getInputStream().bufferedReader().readLine()
            println("El resultado es $resultado")
            cliente.close()

        }

    }
}