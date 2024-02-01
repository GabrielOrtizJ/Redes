import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress

fun main(){
    val datagramaenviar = DatagramSocket()

    val mensaje = "hola"
    val enviar = mensaje.toByteArray()

    val ip = InetAddress.getByName("127.0.0.1")

    val paquetedata = DatagramPacket(enviar,enviar.size,ip,5000)

    datagramaenviar.send(paquetedata)
    datagramaenviar.close()

    val datagrama = DatagramSocket(5000)

    val enviar2 = ByteArray(1024)

    val paquete = DatagramPacket(enviar2,enviar2.size)

    datagrama.receive(paquete)
    val texto = String(paquete.data,0,paquete.length)

    println(texto.toUpperCase())



}