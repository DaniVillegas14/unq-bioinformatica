RETO I: Podrías buscar un ejemplo de macromoléculas que almacenen información sobre la "identidad" de un organismo dado?

Un ejemplo de macromolécula podría ser los carbohidratos, que almacenan combustible para las necesidades energéticas futuras.

RETO II: Proponé una forma de expresar la información contenida en la estructura primaria de las proteínas usando tipos de datos de los lenguajes de programación que conocés

Para expresar la información contenida en la estructura primaria de las proteínas utilizaría un array de caracteres y cada uno de estos indica un aminoácido diferente.

RETO III: ¿En qué tipo de datos podrías expresar la información de la estructura terciaria proteica?

Para expresar la información contenida en la estructura terciaria de las proteínas utilizaría un array para agrupar los dominios y en base a eso formar la estructura definitiva.

RETO IV Rosalind Franklin es una científica muy relevante, que tuvo menos reconocimiento del merecido.¿Cuáles fueron sus contribuciones en este campo? ¿Qué nos cuenta su historia acerca del mundo de la ciencia?

Rosalind Franklin hizo posible uno de los descubrimientos más importantes del siglo pasado en particular en Biología. En 1953 tomó su famosa fotografía 51 en la que utilizó la difracción de rayos-X para capturar la estructura de doble hélice del ADN, vital para la comprensión de la vida. Lamentablemente, no tuvo el reconocimiento que se mereció.

RETO V:Proponé en pseudocódigo un programa que prediga la estructura secundaria que adoptará cada residuo(aminoácido) de la secuencia proteica dada, especificandola como H (si es una hélice), B (si es una hoja betaplegada) y L (si es un bucle o loop).

val proteins = listOf(Glu, Ala, Leu, Arg, His)

var structure = ""

fun predictSecondaryStructure(protein) {
    proteins.forEach(aminoacid -> {
        structure += aminoacid.clasification
    })
    return structure
}

Cada aminoacido conoce su clasificacion, por lo que la estructura podria retornar una cadena "HHBHL" por ejemplo.

RETO VI: ¿Qué hace distintos a dos individuos de una especie? Propone una forma de corroborar tu respuesta realizando un diagrama de un posible método computacional para dicho fin

Lo que hace distintos a dos individuos de una especie es el ADN. 
Comparamos las cadenas de nucleotidos de cada individuo:

val adn1 = listOf(CG,AT,CG,CG,CG,AT...)

val adn2 = listOf(CG,AT,CG,CG,CG,AT...)

fun ADNsEquals(adn1, adn2) {

    adn1.forEach(index -> {
        if !(adn1[i].equals(adn2[i])) 
            return false
    })
    
    return true
}
