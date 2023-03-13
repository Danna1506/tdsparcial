package co.edu.umanizales.tads.model;

import lombok.Data;

@Data
public class ListSE {
    private Node head;

    /*
    Algoritmo de adicionar al final
    Entrada
        un niño
    si hay datos
    si
        llamo a un ayudante y le digo que se posicione en la cabeza
        mientras en el brazo exista algo
            pasese al siguiente
        va estar ubicado en el ùltimo

        meto al niño en un costal (nuevo costal)
        y le digo al ultimo que tome el nuevo costal
    no
        metemos el niño en el costal y ese costal es la cabeza
     */
    public void add(Kid kid){
        if(head != null){
            Node temp = head;
            while(temp.getNext() !=null)
            {
                temp = temp.getNext();
            }
            /// Parado en el último
            Node newNode = new Node(kid);
            temp.setNext(newNode);
        }
        else {
            head = new Node(kid);
        }
    }

    /* Adicionar al inicio
    si hay datos
    si
        meto al niño en un costal (nuevocostal)
        le digo a nuevo costal que tome con su brazo a la cabeza
        cabeza es igual a nuevo costal
    no
        meto el niño en un costal y lo asigno a la cabez
     */
    public void addToStart(Kid kid){
        if(head !=null)
        {
            Node newNode = new Node(kid);
            newNode.setNext(head);
            head = newNode;
        }
        else {
            head = new Node(kid);
        }
    }
    public void delete(kid)
    /* debo saber si la lista esta vacia, si no lo esta hace lo siguiente */
    if(!=estavacio){
        if (inicio==fin && children==inicio.dato);{
            /* es el primer nodo, y unico nodo que vamoa a rliminar*/
            inicio=fin=null;
        }
        /* tenemos al menos dos nodos */
      else if (kid== inicio.dato){
            inicio=inicio.siguiente;
        }/* dos nodos que el anterior apunte al primer nodo y el temporal al siguiente*/
        else { Node anterior, temp;
            anterior=inicio;
            temp=inicio.siguiente;
        }
      /* mientras temporal sea diferente de null, y diferente de edad igual a 5, siga recorriendo la lista
      hasta que encuentre algun objeto con estos valores
       */
        while(temp!= null && temp.dato!=age==5){
            anterior=anterior.siguiente;
            temp=temp.siguiente;
        }/* cuando se encuentra el valor de null o al niño con edad de 5 el while deja de funcionar,
      apunta a anterior de siguiente, y fin es igual a anterior porque el ultimo fue el que se elimino,por ende el
       anterior se vuelve fin*/
        if(temp!=null){
            anterior.siguiente=temp.siguiente;
            if(temp==fin){
                fin=anterior;
            }
        }

    }
}
/* mover al niño por posicion especifica*/
    public void moveKidForward(Children children, int numPositions) {

        Node
        Node inicio = head;


        Node previous = null;
        int inicioPosition = 0;
        int finalPosition = 0;


        // Avanza el objeto el número de posiciones deseadas
        for (int i = 0; i < numPositions; i++) {
            previous = inicio;
            inicio = inicio.next;
            inicioPosition++;

            // Si la posición final del objeto está más allá del final de la lista, mueve el objeto al final de la lista
            if (current == null && currentPosition < finalPosition) {
                previous.next = null;

            }
        }
    }