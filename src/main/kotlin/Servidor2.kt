import java.io.ObjectInputStream
import java.net.ServerSocket
import javax.print.attribute.standard.PrinterInfo

class Servidor2(){
    fun iniciar(){
        val server = ServerSocket(6767)
        val cliente = server.accept()
        val input = ObjectInputStream(cliente.getInputStream())
        val objetoPersona = input.readObject() as Persona
        println("Nombre"+ objetoPersona.nombre +"   "+objetoPersona.edad)


    }
}