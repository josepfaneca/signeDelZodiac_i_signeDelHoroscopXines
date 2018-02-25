# signeDelZodiac_i_signeDelHoroscopXines
# Un programa que permeti consultar el signe del zodíac  o el signe de l'horòscop xinés.

# CFGS Desenvolupament d'Aplicacions Multiplataforma Mòdul 3 – Programació bàsica UF2 – Programació modular
#                                      Exercicis de repàs

EXERCICI

Es demana que feu un programa que permeti consultar el signe del zodíac  o el signe de l'horòscop xinés. Inicialment el programa mostrarà un menú on es podrà escollir 
1. si es vol consultar el signe del zodíac, 
2. de l'horòscop xinés 
3. o bé sortir de l'aplicació. 
Seguidament, 
1. si s'ha escollit el zodíac es preguntarà el dia i el mes. 
2. Si s'ha escollit l'horòscop xinés només es preguntarà el mes. 

Un cop entrades les dades 
1. es calcularà el signe demanat 
2. i es mostrarà el resultat.

Tingueu en compte que per calcular el signe del zodíac podeu fer servir la taula següent:

Període
 Signe del zodíac
Del 21 de desembre al 20 de gener
Capricorn
Del 21 de gener al 20 de febrer
Aquari
Del 21 de febrer al 20 de març
Peixos
Del 21 de març al 20 de abril
Aries
Del 21 de abril al 20 de maig
Taure
Del 21 de maig al 20 de juny
Bessons
Del 21 de juny al 20 de juliol
Cranc
Del 21 de juliol al 20 de agost
Lleó
Del 21 de agos al 20 de setembre
Verge
Del 21 de setembre al 20 de octubre
Balança
Del 21 de octibre al 20 de novembre
Escorpí
Del 21 de novembre al 20 de desembre
Sagitari


El signe de l'horòscop xinés es calcula seguint la següent taula:

Mes
Signe
0
Mono
1
Gall
2
Gos
3
Porc
4
Rata
5
Bou
6
Tigre
7
Conill
8
Drac
9
Serp
10
Cavall
11
Cabra

Els anys múltiples de 12, és a dir aquells que el residu en dividir per 12 és 0, són Rata. A partir d'aquest, els signes se succeeixen en l'ordre que indica la taula, de manera que aquell que sigui múltiple 12 + 1 tindrà signe Bou. Com és natural, cíclicament, cada 12 anys els signes es repeteixen.

Recordeu que per calcular el residu d'una divisió, en JAVA usem la operació %. Si de qualsevol any obtenim any % 12. aconseguirem saber el residu i amb ell podrem coneixer el signe.

A l'hora de fer l'aplicació intenteu organitzar el codi en funcions que us ajudin a implementar el programa. 

Per exemple podeu crear per determinar els signes, dues funcions de càlcul (una per calcular el zodíac i l'altre l'horòscop xinés) que rebin les dades necessàries (mes i dia o mes) i retornin una cadena amb el valor del signe.

També podeu implementar funcions que us ajudin a demanar les dades necessàries: entrarEnter, entrarChar, etc. i a mostrar els resultats.

Finalment, no us oblideu d'encapsular cada procés (signe del zodíac o horòscop xinés) en mòduls totalment independents fent servir també funcions. 
