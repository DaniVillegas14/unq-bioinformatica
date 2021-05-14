
import java.lang.System.console

import jdk.nashorn.internal.objects.NativeFunction.function


fun main() {
    print("Ingresa una proteina: ")
    val protein = readLine()
    if (protein != null) {
        print("EL ARN posible resultante es: ", getARNEncoder(protein))
    }
}

fun getARNEncoder(protein: String) {
    var arn = ''
    protein.toList().forEach(aminoacid => {
        arn += AminoAcidProtein.findAminoacid(aminoacid)
    })
    return arn
}

object AminoAcidProtein {
    const val G = 'GGU'
    const val S = 'AGU'
    const val R = 'CGU'
    const val W = 'UGG'
    const val C = 'AGU'
    const val E = 'GAA'
    const val D = 'GAU'
    const val K = 'AAA'
    const val N = 'AAU'
    const val Q = 'CAA'
    const val H = 'CAU'
    const val Y = 'UAU'
    const val A = 'GCU'
    const val T = 'ACU'
    const val P = 'CCU'
    const val S = 'UCU'
    const val V = 'GUU'
    const val M = 'AUG'
    const val I = 'AUU'
    const val L = 'UUA'
    const val F = 'UUU'

    fun getlist(): List<String> = listOf(G,S,R,W,C,E,D,K,N,Q,H,Y,A,T,P,S,V,M,I,L,F)

    fun findAminoacid(aminoacid: Char): String =
            this.getlist().firstOrNull { it == aminoacid } :? ''
}
