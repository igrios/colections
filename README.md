# Colecciones en Java (Java Collections Framework)

El **Java Collections Framework (JCF)** provee un conjunto de **interfaces** y **clases** para trabajar con estructuras de datos como listas, conjuntos, colas y mapas.

---

## 1. Jerarquía Principal

- **`Collection<E>`**  
  Interface raíz de la jerarquía de colecciones. Define operaciones básicas como:
  - `add(E e)`
  - `remove(Object o)`
  - `size()`
  - `isEmpty()`
  - `iterator()`

- **Subinterfaces de `Collection`:**
  - **`List<E>`**  
    Colección ordenada, permite duplicados.  
    Implementaciones: `ArrayList`, `LinkedList`, `Vector`, `Stack`.

  - **`Set<E>`**  
    No permite duplicados, no garantiza orden (excepto implementaciones específicas).  
    Implementaciones: `HashSet`, `LinkedHashSet`, `TreeSet`.

  - **`Queue<E>`**  
    Modelo FIFO (primero en entrar, primero en salir).  
    Implementaciones: `PriorityQueue`, `LinkedList`.

  - **`Deque<E>`** (doble cola)  
    Permite inserción/eliminación en ambos extremos.  
    Implementaciones: `ArrayDeque`, `LinkedList`.

---

## 2. Mapas (no heredan de `Collection`)

- **`Map<K, V>`**  
  Estructura de pares clave-valor, claves únicas.  
  Operaciones:
  - `put(K key, V value)`
  - `get(Object key)`
  - `containsKey(Object key)`
  - `entrySet()`

- **Implementaciones principales:**
  - `HashMap` (sin orden garantizado, muy rápido).
  - `LinkedHashMap` (mantiene el orden de inserción).
  - `TreeMap` (ordenado por clave, usa Red-Black Tree).
  - `Hashtable` (legado, sincronizado).

---

## 3. Interfaces de apoyo

- **`Iterator<E>`**  
  Permite recorrer colecciones con:
  - `hasNext()`
  - `next()`
  - `remove()`

- **`ListIterator<E>`**  
  Extiende `Iterator` con recorrido en ambas direcciones.

- **`Comparable<T>` y `Comparator<T>`**  
  - `Comparable`: orden natural (`compareTo`).
  - `Comparator`: orden personalizado (`compare`).

---

## 4. Resumen de uso común

- **List** → cuando importa el orden y se permiten duplicados.  
- **Set** → cuando no se permiten duplicados.  
- **Queue/Deque** → cuando importa el orden de procesamiento.  
- **Map** → cuando se necesita asociar claves con valores.  

---

## 5. Ejemplo rápido

```java
List<String> nombres = new ArrayList<>();
nombres.add("Ignacio");
nombres.add("Yanina");

Set<Integer> numeros = new HashSet<>();
numeros.add(10);
numeros.add(20);
numeros.add(10); // duplicado, no se guarda

Map<String, Integer> edades = new HashMap<>();
edades.put("Ignacio", 30);
edades.put("Yanina", 28);
