import java.io.BufferedOutputStream
import java.io.FileOutputStream
import java.io.InputStream
import java.net.ServerSocket

fun main(){
    val server = ServerSocket(6000)
    val cliente = server.accept()

    val input:InputStream = cliente.getInputStream()
    val fichero = FileOutputStream("C:\\Asignaturas\\AccesoDatos\\Redes\\imagen2.bmp")
    val buffer = BufferedOutputStream(fichero)
    val leer = ByteArray(4096)
    var byteleido :Int

    while (input.read(leer).also {byteleido = it }!= -1){
        buffer.write(leer,0,byteleido)

    }
    buffer.flush()
    buffer.close()
    server.close()

    println("Imagen recibida y creada correctamente")

}