import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress

fun main() {
    val datagrama = DatagramSocket(5000)
    val enviar = ByteArray(1024)

    val paquete = DatagramPacket(enviar,enviar.size)

   datagrama.receive(paquete)
    val texto = String(paquete.data,0,paquete.length)

    println(texto)

    val datagramaenviar = DatagramSocket()

    val mensaje = texto
    val enviar2 = mensaje.toByteArray()

    val ip = InetAddress.getByName("127.0.0.1")

    val paquetedata = DatagramPacket(enviar2,enviar2.size,ip,5000)

    datagramaenviar.send(paquetedata)
}