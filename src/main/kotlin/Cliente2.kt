import java.io.ObjectOutputStream
import java.net.Socket

class Cliente2 {
    fun enviar(persona: Persona){
        val socket = Socket("localhost", 6767)
        val output = ObjectOutputStream(socket.getOutputStream())
        output.writeObject(persona)
        output.flush()
        output.close()
        socket.close()
    }
}