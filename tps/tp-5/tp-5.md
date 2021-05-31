RETO I: Intentemos, entonces alinear estas dos palabras, para comprender mejor el problema. Alineá en la siguiente table de comparaciones las palabras "BANANA" y "MANZANA".**

1)
>BANANA
>MANZANA

2)
>BAN-ANA
>MANZANA

3)
> BANANA
>MANZANA

Consigo mas aciertos en la opción 2, pero eso no significa que sea la mejor porque, por ejemplo, podria tener algún tipo de penalización por usar un gap en esa posición que terminara afectando el puntaje de la identidad.

RETO II: En la siguiente tabla probá distintos alineamientos para las palabras "ANA" y "ANANA". Verás que en el margen superior izquierdo aparece un valor de identidad calculado para cada alineamiento que intentes.**

1)
>ANA--
>ANANA

Se logra una identidad de 0.6

2)
>A--NA
>ANANA

Se logra una identidad de 0.6

3)
>-A-NA
>ANANA

Se logra una identidad de 0.4

4)
>--ANA
>ANANA

Se logra una identidad de 0.6

Los puntajes no son todos iguales, y la identidad se podría ver afectada por la penalización por los gaps que estamos introduciendo para mejorar el puntaje.
Para calcularlo, se me ocurre darle un valor a las coincidencias y diferencias para al finalizar el alineamiento tenga un puntaje calculado.

RETO III: En la siguiente tabla probá distintos alineamientos para las palabras "ANA" y "ANANA". Verás que en el margen superior izquierdo aparece un valor de identidad calculado para cada alineamiento que intentes y un botón para cambiar la penalidad que se le otorga a dicho para el cálculo de identidad.

Si la penalidad es 0 no influye en el valor obtenido para el cálculo de identidad.
Si aumento la penalidad a 1 ahora si tiene inferencia en el valor calculado para la identidad. Logrando que por cada gap se descuente un 0.2 al valor final.
De igual manera si aumento la penalidad a n el valor que se descuenta está dado por el cálculo de
> -( n * 0.2)
De manera que a medida que aumenta la penalidad obtengo una identidad más negativa.

A mayor penalidad es más difícil lograr una identidad positiva.

RETO IV: En la siguiente tabla probá distintos alineamientos para las secuencias nucleotídicas. Podrás ver las traducciones para cada secuencia.

En este caso puedo lograr una identidad de ~0.77 con el siguiente alineamiento
>TGC-GA-GG
>TGCCGAAGG

Como tengo dos pares de codones incompletos no se puede generar una traducción para cada codón.
si aumentamos la penalidad n veces se obtiene una identidad menor dada por el cálculo
> -( n * 0.1^)

RETO VII: calculá el E-value y % identidad utilizando el programa Blast de la siguiente secuencia input usando 20000 hits, un e-value de 100 y tomando aquellos hits con un mínimo de 70% cobertura. Observe y discuta el comportamiento de : E-value vs. % id, Score vs % id, Score vs E-value

Secuencia: VVGGLGGYMLGSAMSRPIIHFGSDYEDRYYRENMHRYPNQVYYRPMDEYSNQNNFVHDCVNITIKQHTV TTTTKGENFTETDVKMMERVVEQMCITQYERESQAYYQRGSSMVLFSSPPVILLISFLIFLIVG

Estos valores están relacionados en que, cuando varia uno, varian también los otros dos.
El e-value es el valor de referencia para saber que tan certera es esa proteina en esa cadena, cuando menor sea el valor mas confianza transmite.
En blast, la proteina que tiene el menor e-value también tiene el mayor score y porcentaje de identidad, es decir, es la misma proteina.

RETO VIII: Realizá nuevas búsquedas usando la mitad de la secuencia problema y para un cuarto de la secuencia original. Compará los gráficos obtenidos.¿Qué conclusiones puede sacas?

Si utilizamos la mitad de la secuencia, cambiaron los valores. El e-value más confiable es mayor que el valor con la cadena original y el valor máximo también es mucho menor. También cambio la proteína con un coverage del 100%, antes era "prion protein precursor [Homo sapiens]" ahora con la secuencia por la mitad es "Chain A, Major prion protein".
Estos valores se ven más agraviados cuando menor sea la longitud de la cadena.

RETO IX: Utilizando ​BLAST utilice búsquedas de similitud secuencial para identificar a la siguiente proteína:MIDKSAFVHPTAIVEEGASIGANAHIGPFCIVGPHVEIGEGTVLKSHVVVNGHTKIGRDNEIYQFASIGEVNQDLKYAGEPTRVEIGDRNRIRESVTIHRGTVQGGGLTKVGSDNLLMINAHIAHDCTVGNRCILANNATLAGHVSVDDFAIIGGMTAVHQFCIIGAHVMVGGCSGVAQDVPPYVIAQGNHATPFGVNIEGLKRRGFSREAITAIRNAYKLIYRSGKTLDEVKPEIAELAETYPEVKAFTDFFARSTRGLIR

Pertenece a la familia de [Escherichia coli K-12], es una enzima (pertenece a la familia de los enterobacterias). La función de esta proteina es la de catalizar reacciones químicas.

Según BLAST utilizando la base de datos PDB se encuentran unas 30 coincidencias de secuencias.
Si cambio la base de datos a "nr" nos encontramos con que las coincidencias son mayores a 100 y encuentra una mayor coincidencia con la familia de Protoebacterias.

RETO X: Realizá una nueva corrida del BLAST, utilizando la misma secuencia, pero ahora contra la base de datos PDB. ¿Se obtienen los mismo resultados? ¿Qué tipo de resultados (hits) se recuperan? ¿Cuándo nos podría ser útil este modo de corrida?

Luego de realizar la comparación se obtiene otro resultado, "UDP N-ACETYLGLUCOSAMINE O-ACYLTRANSFERASE" vs "UDP N-ACETYLGLUCOSAMINE O-ACYLTRANSFERASE" en la primera hay siete posibles organismo que poseen esta proteina mientras que en la segunda solo dos, pero esos dos son dos de los siete de la primer cadena.
Puedo asumir que en las bases de datos tienen cargados ambas cadenas pero con diferentes mutaciónes o datos de la mismas.