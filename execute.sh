#!/bin/bash

if [ -z "$1" ]; then
    echo "Indica programa"
    return 1
fi

arxiu="$1java"
programa="${1%.}"  

javac "$arxiu"
if [ $? -eq 0 ]; then
    java "$programa" < casosDePrueba.txt
else
    echo "Error en la compilación"
    return 1
fi
