import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.Socket
import java.net.URL
import java.net.http.HttpConnectTimeoutException

fun main(){
    val ip = "10.10.0.110"
    val puerto =82
    if(comprobarpuerto(ip,puerto)){
        println("el server esta abierto")
        val url = "http://$ip:$puerto"
        comprobarweb(url)

    }

}
fun comprobarpuerto(ip:String, puerto:Int):Boolean{
    return try{
        val perticion = Socket(ip,puerto)
        perticion.close()
        true
    }catch (e:Exception){
        false
    }
}
fun comprobarweb(url:String){

    val con = URL(url).openConnection() as HttpURLConnection

    con.requestMethod="GET"
    println(con.responseCode)
    if(con.responseCode == HttpURLConnection.HTTP_OK){
        val input = con.inputStream
        val leer = BufferedReader(InputStreamReader(input))
        var linea : String?
        while((leer.readLine().also { linea= it }!=null)){
            println(linea)
        }
        leer.close()
    }else{
        println("la peticion no fue correcta")
    }
    con.disconnect()
}
