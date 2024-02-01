import java.io.BufferedInputStream
import java.io.FileInputStream
import java.io.OutputStream
import java.net.Socket

fun main(){
    val socket = Socket("localhost",6000)
    val out:OutputStream = socket.getOutputStream()
    val fichero = "C:\\Asignaturas\\AccesoDatos\\Redes\\imagen.bmp"
    val file = FileInputStream(fichero)

    val imagen = BufferedInputStream(file)
    val byte = ByteArray(4096)

    var leer: Int

    while(imagen.read(byte).also {leer = it}!=-1){

        out.write(byte,0,leer)

    }
    out.flush()
    imagen.close()
    socket.close()
    println("imagen enviada")
}