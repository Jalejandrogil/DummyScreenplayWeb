#language: es
Característica: Logueo en pagina de orange


  Esquema del escenario: Logueo de Admin
    Dado "Jorge" quiere loguearse en la pagina de Orange
    Cuando el se loguea
    Entonces el podra ver el nombre "<nombre>"

    Ejemplos:

    |nombre|
    |Paul Collings      |
    |sd23 Collings      |
    |Jorge      |

