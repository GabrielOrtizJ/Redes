import java.net.DatagramPacket
import java.net.InetAddress
import java.net.MulticastSocket

fun main(){
    val  multicastgrupo = "224.0.0.3"
    try {
        val multicast = MulticastSocket(1234)
        val direccion =  InetAddress.getByName(multicastgrupo)
        multicast.joinGroup(direccion)

        val enviar = "hola".toByteArray()
        val enviarpaquete = DatagramPacket(enviar,enviar.size,direccion,1234)
        multicast.send(enviarpaquete)
        while (true){
            val recibir = ByteArray(1024)
            val paquete = DatagramPacket(recibir,recibir.size)
            multicast.receive(paquete)
            val convertir = String(paquete.data,paquete.offset,paquete.length)
            println(convertir)
        }
    }catch (e:Exception){
        e.printStackTrace()
            }
}