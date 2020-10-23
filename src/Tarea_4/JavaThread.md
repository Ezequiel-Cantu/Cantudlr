# **Java Thread Scheduler**

#### **¿Qué es?** 
Java tiene un Scheduler, una lista de procesos, que monitoriza todos los hilos que se están ejecutando en todos los programas y decide cuales deben ejecutarse y cuales deben encontrarse preparados para su ejecución. Hay dos características de los hilos que el scheduler identifica en este proceso de decisión:
- Es la prioridad del hilo de ejecución.
- Es el indicador de demonio. 

La regla básica del scheduler es que si solamente hay hilos demonio ejecutándose, la Máquina Virtual Java (JVM) concluirá. Los nuevos hilos heredan la prioridad y el indicador de demonio de los hilos de ejecución que los han creado. <em>El scheduler determina qué hilos deberán ejecutarse comprobando la prioridad de todos ellos, aquellos con prioridad más alta dispondrán del procesador antes de los que tienen prioridad más baja. 
</em>

---
  **P r i o r i d a d e s**
  El scheduler determina el hilo que debe ejecutarse en función de la prioridad asignada a cada uno de ellos. El rango de prioridades oscila entre 1 y 10. La prioridad por defecto de un hilo de ejecución esNORM_PRIORITY, que tiene asignado un valor de 5. Hay otras dos variables estáticas disponibles, que son MIN_PRORITY, fijada a 1, y MAX_PRIORITY, que tiene un valor de 10. El método getPriority()puede utilizarse para conocer el valor actual de la prioridad de un hilo.
