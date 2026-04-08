![Psyduck.webp](../../../../../../../Images/Psyduck.webp)
# Análisis de Requerimientos (Parte 1)
## Escenario 1: Plataforma de Entrenadores Pokémon

---

**Contexto:** Una empresa de videojuegos desea desarrollar una aplicación web que permita a los usuarios registrarse como entrenadores, gestionar sus Pokémon y participar en combates en línea contra otros jugadores, dentro de una liga competitiva. El cliente no ha entregado documentación formal; únicamente necesidades generales.

---

## 1. Identificación de Requerimientos

Se extraen tanto los requerimientos **explícitos** (mencionados directamente) como los **implícitos** (inferidos razonablemente del contexto del sistema).

### Requerimientos Explícitos

| ID   | Requerimiento identificado                                                                 |
|------|--------------------------------------------------------------------------------------------|
| RE01 | Registro de usuarios como entrenadores Pokémon                                             |
| RE02 | Gestión de Pokémon por parte del entrenador (agregar, ver, organizar)                      |
| RE03 | Creación y gestión de equipos Pokémon                                                      |
| RE04 | Participación en combates contra otros jugadores en línea                                  |
| RE05 | Visualización del progreso del entrenador dentro de una liga competitiva                   |
| RE06 | Interacción entre jugadores                                                                |
| RE07 | Experiencia fluida del usuario durante los combates                                        |
| RE08 | Soporte para múltiples usuarios conectados simultáneamente                                 |
| RE09 | Seguridad en las cuentas de los usuarios                                                   |
| RE10 | Historial de batallas claro y accesible                                                    |
| RE11 | Posibilidad futura de torneos, recompensas y modos de juego adicionales                    |

### Requerimientos Implícitos

| ID   | Requerimiento inferido                                                                              |
|------|-----------------------------------------------------------------------------------------------------|
| RI01 | Autenticación de usuarios (inicio de sesión con credenciales seguras)                               |
| RI02 | Recuperación de contraseña                                                                          |
| RI03 | Persistencia de datos en base de datos (usuarios, Pokémon, equipos, batallas)                       |
| RI04 | Sistema de matchmaking para emparejar jugadores en combates                                         |
| RI05 | Comunicación en tiempo real durante los combates (WebSockets o similar)                             |
| RI06 | Sistema de ranking o clasificación dentro de la liga                                                |
| RI07 | Validación de reglas del juego durante los combates (turnos, habilidades, etc.)                     |
| RI08 | Interfaz de usuario responsive (adaptable a distintos tamaños de pantalla)                          |
| RI09 | Gestión de sesiones activas y tokens de seguridad                                                   |
| RI10 | Notificaciones al usuario (retos recibidos, resultados de combate, etc.)                            |
| RI11 | Panel de administración para gestionar usuarios y contenido                                         |
| RI12 | Catálogo de Pokémon disponibles (con estadísticas, habilidades, tipos)                              |
| RI13 | Límites en la composición del equipo (máximo de Pokémon por equipo, reglas de la liga)             |
| RI14 | Protección contra trampas o manipulación en combates (validación del lado del servidor)             |
| RI15 | Escalabilidad de la infraestructura para soportar carga alta                                        |

---

## 2. Clasificación de Requerimientos

### Requerimientos Funcionales (RF)

Definen **qué debe hacer el sistema**; son acciones, comportamientos o funciones concretas.

| ID   | Requerimiento                                                                 | Justificación                                                                 |
|------|-------------------------------------------------------------------------------|-------------------------------------------------------------------------------|
| RF01 | Registro de entrenadores (RE01)                                               | Acción directa del sistema: crear y almacenar un usuario nuevo                |
| RF02 | Gestión de Pokémon del entrenador (RE02)                                      | Funcionalidad CRUD sobre entidades del dominio                                |
| RF03 | Creación y gestión de equipos (RE03)                                          | Operación concreta sobre datos del sistema                                    |
| RF04 | Sistema de combates en línea (RE04)                                           | Funcionalidad central del producto                                            |
| RF05 | Visualización del progreso y liga competitiva (RE05)                          | El sistema debe calcular y mostrar datos de rendimiento                       |
| RF06 | Interacción entre jugadores (RE06)                                            | Funciones sociales como retar, enviar mensajes o aceptar combates             |
| RF07 | Historial de batallas (RE10)                                                  | El sistema debe registrar y presentar resultados anteriores                   |
| RF08 | Autenticación y recuperación de contraseña (RI01, RI02)                       | Funciones de acceso y seguridad del usuario                                   |
| RF09 | Sistema de matchmaking (RI04)                                                 | Lógica de negocio para emparejar jugadores                                    |
| RF10 | Comunicación en tiempo real (RI05)                                            | Funcionalidad técnica necesaria para la interacción durante combates          |
| RF11 | Sistema de ranking (RI06)                                                     | Cálculo y presentación de posiciones en la liga                               |
| RF12 | Validación de reglas del juego (RI07)                                         | Lógica funcional del combate (turnos, movimientos válidos, etc.)              |
| RF13 | Notificaciones al usuario (RI10)                                              | Acciones del sistema para informar al usuario de eventos                      |
| RF14 | Catálogo de Pokémon (RI12)                                                    | Conjunto de datos y funcionalidad de consulta                                 |
| RF15 | Panel de administración (RI11)                                                | Funcionalidad de gestión del sistema para operadores                          |

### Requerimientos No Funcionales (RNF)

Definen **cómo debe comportarse el sistema** (calidad, rendimiento, seguridad, usabilidad).

| ID    | Requerimiento                                                                 | Justificación                                                                 |
|-------|-------------------------------------------------------------------------------|-------------------------------------------------------------------------------|
| RNF01 | Experiencia fluida durante los combates (RE07)                                | Atributo de calidad: usabilidad y rendimiento percibido                       |
| RNF02 | Soporte para múltiples usuarios simultáneos (RE08)                            | Atributo de rendimiento y disponibilidad                                      |
| RNF03 | Seguridad de las cuentas (RE09)                                               | Atributo de seguridad del sistema                                             |
| RNF04 | Persistencia de datos (RI03)                                                  | Atributo de confiabilidad: los datos no deben perderse                        |
| RNF05 | Interfaz responsive (RI08)                                                    | Atributo de usabilidad y portabilidad                                         |
| RNF06 | Gestión segura de sesiones y tokens (RI09)                                    | Atributo de seguridad                                                         |
| RNF07 | Escalabilidad de la infraestructura (RI15)                                    | Atributo de rendimiento y crecimiento del sistema                             |
| RNF08 | Protección contra trampas en combates (RI14)                                  | Atributo de integridad y confiabilidad del sistema                            |

---

## 3. Redacción Correcta de Requerimientos

Todos los requerimientos se reformulan con el estándar **"El sistema debe…"**, eliminando ambigüedades y haciéndolos medibles cuando aplica.

| ID    | Requerimiento redactado correctamente                                                                                                                 |
|-------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| RF01  | El sistema debe permitir el registro de nuevos usuarios como entrenadores, solicitando nombre de usuario, correo electrónico y contraseña válidos.    |
| RF02  | El sistema debe permitir al entrenador agregar, visualizar, editar y eliminar Pokémon de su colección personal.                                       |
| RF03  | El sistema debe permitir al entrenador crear equipos de combate con un mínimo de 1 y un máximo de 6 Pokémon por equipo.                               |
| RF04  | El sistema debe permitir a dos entrenadores enfrentarse en combates por turnos en tiempo real a través de la plataforma web.                          |
| RF05  | El sistema debe mostrar al entrenador su posición actual en la liga, su puntaje acumulado y su historial de victorias y derrotas.                     |
| RF06  | El sistema debe permitir a los usuarios enviar y recibir retos de combate de otros jugadores registrados en la plataforma.                            |
| RF07  | El sistema debe registrar y mostrar el historial completo de batallas de cada entrenador, incluyendo fecha, rival, equipo utilizado y resultado.      |
| RF08  | El sistema debe autenticar al usuario mediante correo y contraseña, y ofrecer un mecanismo de recuperación de contraseña vía correo electrónico.      |
| RF09  | El sistema debe emparejar automáticamente a jugadores de nivel similar cuando soliciten un combate aleatorio, en un tiempo máximo de 30 segundos.     |
| RF10  | El sistema debe mantener comunicación en tiempo real entre los dos jugadores durante un combate, con una latencia máxima de 200 ms.                   |
| RF11  | El sistema debe calcular y actualizar el ranking de la liga en tiempo real tras cada combate finalizado.                                              |
| RF12  | El sistema debe validar del lado del servidor que cada movimiento ejecutado en un combate cumple con las reglas del juego establecidas.               |
| RF13  | El sistema debe enviar notificaciones al usuario cuando reciba un reto, cuando un combate finalice o cuando su posición en la liga cambie.            |
| RF14  | El sistema debe proveer un catálogo de Pokémon con sus estadísticas base, tipos, habilidades y movimientos disponibles.                               |
| RF15  | El sistema debe proveer un panel de administración que permita gestionar usuarios, Pokémon del catálogo y reportes de conducta.                       |
| RNF01 | El sistema debe garantizar una experiencia de combate sin interrupciones perceptibles, con un tiempo de respuesta máximo de 500 ms por acción del usuario. |
| RNF02 | El sistema debe soportar al menos 1.000 usuarios conectados simultáneamente sin degradación del rendimiento.                                          |
| RNF03 | El sistema debe almacenar las contraseñas de los usuarios usando un algoritmo de hashing seguro y proteger las cuentas contra accesos no autorizados. |
| RNF04 | El sistema debe garantizar la persistencia de todos los datos de usuario, Pokémon, equipos y batallas, sin pérdida de información ante fallos del sistema. |
| RNF05 | El sistema debe ser accesible y funcional en dispositivos de escritorio, tabletas y móviles, adaptando su interfaz al tamaño de pantalla disponible.  |
| RNF06 | El sistema debe invalidar sesiones inactivas tras 30 minutos y gestionar tokens de sesión de forma segura usando estándares como JWT.                 |
| RNF07 | La arquitectura del sistema debe ser escalable horizontalmente para permitir aumentar la capacidad ante incrementos de usuarios sin rediseño del sistema. |
| RNF08 | El sistema debe ejecutar la lógica de combate exclusivamente en el servidor para prevenir trampas o manipulación de datos por parte del cliente.      |

---

## 4. Priorización de Requerimientos

**Criterios utilizados:**
- **Alta:** Crítico para el funcionamiento básico del producto (MVP); sin él el sistema no es viable.
- **Media:** Importante para la experiencia del usuario y el valor de negocio, pero no bloquea el lanzamiento.
- **Baja:** Deseable o preparatorio para funcionalidades futuras; puede diferirse.

| ID    | Descripción resumida                              | Prioridad | Justificación                                                                 |
|-------|---------------------------------------------------|-----------|-------------------------------------------------------------------------------|
| RF01  | Registro de entrenadores                          | Alta      | Sin registro no hay usuarios; es el primer paso obligatorio                   |
| RF08  | Autenticación y recuperación de contraseña        | Alta      | Seguridad base del sistema; dependencia de todos los demás módulos            |
| RF02  | Gestión de Pokémon                                | Alta      | Funcionalidad central del dominio; sin Pokémon no hay combates                |
| RF03  | Creación de equipos                               | Alta      | Dependencia directa del sistema de combates                                   |
| RF04  | Combates en línea                                 | Alta      | Propuesta de valor principal del producto                                     |
| RF10  | Comunicación en tiempo real                       | Alta      | Requisito técnico indispensable para los combates                             |
| RF12  | Validación de reglas del juego                    | Alta      | Sin esto los combates serían inválidos o manipulables                         |
| RNF03 | Seguridad de cuentas                              | Alta      | Preocupación explícita del cliente; riesgo legal y de confianza               |
| RNF02 | Soporte de usuarios simultáneos                   | Alta      | Preocupación explícita del cliente; sin esto el sistema no escala             |
| RF07  | Historial de batallas                             | Media     | Preocupación del cliente, pero no bloquea el MVP funcional                    |
| RF05  | Progreso y liga competitiva                       | Media     | Agrega valor competitivo; requiere que combates estén funcionando primero     |
| RF11  | Ranking de la liga                                | Media     | Dependiente del sistema de combates; refuerza la experiencia competitiva      |
| RF06  | Interacción entre jugadores (retos)               | Media     | Mejora la experiencia social; puede iniciarse con matchmaking automático      |
| RF09  | Matchmaking automático                            | Media     | Necesario para escalar, pero puede comenzar con retos directos               |
| RF13  | Notificaciones                                    | Media     | Mejora la experiencia de usuario pero no es bloqueante                        |
| RF14  | Catálogo de Pokémon                               | Alta      | Sin catálogo no se pueden gestionar Pokémon; dependencia crítica              |
| RNF01 | Experiencia fluida en combates                    | Alta      | Preocupación explícita del cliente; impacta directamente la retención         |
| RNF04 | Persistencia de datos                             | Alta      | Sin persistencia no hay continuidad del juego                                 |
| RNF05 | Interfaz responsive                               | Media     | Amplía la base de usuarios; no bloquea el lanzamiento en escritorio           |
| RNF06 | Gestión segura de sesiones                        | Alta      | Componente de seguridad básica; debe implementarse desde el inicio            |
| RNF07 | Escalabilidad de infraestructura                  | Media     | Importante para crecimiento, pero puede implementarse iterativamente          |
| RNF08 | Protección contra trampas                         | Alta      | Garantiza integridad del juego; debe estar desde los combates iniciales       |
| RF15  | Panel de administración                           | Baja      | Necesario operativamente, pero puede desarrollarse después del MVP            |

---

## 5. Identificación de Dependencias y Bloqueos

### Tabla de dependencias

| Requerimiento       | Depende de                              | Notas                                                                      |
|---------------------|-----------------------------------------|----------------------------------------------------------------------------|
| RF08 Autenticación  | RF01 Registro                           | No puede haber login sin registro previo                                   |
| RF02 Gestión Pokémon| RF08, RF14                              | El usuario debe estar autenticado y el catálogo debe existir               |
| RF03 Equipos        | RF02                                    | No se pueden crear equipos sin Pokémon disponibles                         |
| RF04 Combates       | RF03, RF10, RF12                        | Requiere equipos formados, canal en tiempo real y reglas válidas           |
| RF07 Historial      | RF04                                    | Solo existe si hay combates registrados                                    |
| RF11 Ranking        | RF04, RF05                              | Depende de resultados de combates                                          |
| RF09 Matchmaking    | RF06, RF04                              | Necesita el sistema de combates y la interacción entre jugadores           |
| RF13 Notificaciones | RF06, RF04, RF11                        | Los eventos que disparan notificaciones deben existir primero              |

### Bloqueos potenciales

| Bloqueo                                   | Descripción                                                                                     | Mitigación sugerida                                              |
|-------------------------------------------|-------------------------------------------------------------------------------------------------|------------------------------------------------------------------|
| Definición del catálogo de Pokémon        | Sin un catálogo oficial definido no se pueden modelar las entidades del juego                   | Usar la PokéAPI como fuente externa o definir un subconjunto inicial |
| Reglas del sistema de combate             | Las reglas de turnos, daño y habilidades no están especificadas por el cliente                  | Reunión de definición de reglas antes de iniciar RF04           |
| Tecnología de tiempo real                 | La elección de WebSockets, WebRTC o similar impacta la arquitectura completa                    | Definir stack tecnológico en fase de diseño temprana             |
| Volumen exacto de usuarios simultáneos   | El cliente dice "múltiples usuarios" sin dar cifras concretas                                   | Validar con el cliente el número esperado de usuarios concurrentes |
| Diseño del sistema de liga               | No está claro cómo funciona la liga (temporadas, ascensos, puntos)                              | Requiere validación con el cliente antes de implementar RF05/RF11 |

---

## 6. Matriz de Trazabilidad

| ID    | Tipo | Módulo / Caso de uso asociado             | Posible prueba o validación                                                                 |
|-------|------|--------------------------------------------|---------------------------------------------------------------------------------------------|
| RF01  | F    | Módulo de usuarios – Registro              | Verificar que un usuario nuevo puede registrarse con datos válidos y recibe confirmación    |
| RF02  | F    | Módulo de Pokémon – Gestión de colección   | Verificar agregar, editar y eliminar Pokémon de la colección de un entrenador autenticado  |
| RF03  | F    | Módulo de equipos – Creación de equipo     | Verificar que un equipo con 1–6 Pokémon se crea correctamente y queda asociado al usuario  |
| RF04  | F    | Módulo de combate – Combate en línea       | Simular dos jugadores en combate y verificar que las acciones se procesan en tiempo real   |
| RF05  | F    | Módulo de liga – Progreso del entrenador   | Verificar que tras un combate el puntaje y posición del entrenador se actualiza            |
| RF06  | F    | Módulo social – Retos entre jugadores      | Verificar que un jugador puede retar a otro y este recibe el reto correctamente            |
| RF07  | F    | Módulo de historial – Batallas             | Verificar que tras cada combate se registra correctamente en el historial del jugador      |
| RF08  | F    | Módulo de usuarios – Autenticación         | Verificar login con credenciales válidas e inválidas; probar recuperación de contraseña    |
| RF09  | F    | Módulo de matchmaking – Emparejamiento     | Verificar que dos jugadores de nivel similar son emparejados en menos de 30 segundos       |
| RF10  | F    | Infraestructura – Comunicación en tiempo real | Medir latencia entre acciones del cliente y respuesta del servidor (máx. 200 ms)         |
| RF11  | F    | Módulo de liga – Ranking                   | Verificar que el ranking se actualiza inmediatamente tras finalizar un combate             |
| RF12  | F    | Módulo de combate – Validación de reglas   | Intentar ejecutar movimientos inválidos y verificar que el servidor los rechaza            |
| RF13  | F    | Módulo de notificaciones                   | Verificar que el usuario recibe notificación al ser retado y al finalizar un combate       |
| RF14  | F    | Módulo de catálogo – Pokémon disponibles   | Verificar que el catálogo muestra estadísticas, tipos y movimientos correctos por Pokémon  |
| RF15  | F    | Panel de administración                    | Verificar que un administrador puede suspender usuarios y editar el catálogo               |
| RNF01 | NF   | Módulo de combate – Rendimiento             | Prueba de rendimiento: medir tiempo de respuesta promedio durante combates bajo carga      |
| RNF02 | NF   | Infraestructura – Concurrencia             | Prueba de carga: simular 1.000 usuarios conectados y verificar que no hay degradación      |
| RNF03 | NF   | Módulo de usuarios – Seguridad             | Auditoría de seguridad: verificar hashing de contraseñas y protección contra fuerza bruta |
| RNF04 | NF   | Base de datos – Persistencia               | Prueba de recuperación: simular fallo del sistema y verificar que los datos persisten      |
| RNF05 | NF   | Frontend – Usabilidad responsive           | Pruebas en distintos dispositivos y resoluciones (móvil, tablet, escritorio)               |
| RNF06 | NF   | Módulo de usuarios – Gestión de sesiones   | Verificar que sesiones inactivas expiran en 30 minutos y que los tokens son válidos        |
| RNF07 | NF   | Infraestructura – Escalabilidad            | Prueba de escalabilidad: añadir instancias y verificar distribución de carga               |
| RNF08 | NF   | Módulo de combate – Integridad             | Intentar manipular datos del combate desde el cliente y verificar que el servidor los rechaza |

---

## 7. Análisis de Ambigüedades

Se identifican aspectos del enunciado que son **ambiguos**, **incompletos** o que **requieren validación con el cliente**.

---

### Ambigüedad 1: ¿Cómo funciona el sistema de combate?

**Fragmento del enunciado:** *"participar en combates contra otros jugadores en línea"*

**Problema:** El enunciado no especifica el modelo de combate. No se define si:
- Los combates son por turnos o en tiempo real simultáneo.
- Hay límite de tiempo por turno.
- Qué reglas de daño, tipos o habilidades se aplican.
- Si siguen las reglas de alguna edición de los juegos oficiales o son reglas propias.

**Impacto:** Afecta directamente el diseño de RF04, RF10 y RF12. Sin esta definición no se puede modelar la lógica de negocio central.

**Pregunta para el cliente:** ¿El sistema de combate seguirá las mecánicas de algún juego Pokémon oficial o se diseñarán reglas propias? ¿Los combates son por turnos?

---

### Ambigüedad 2: ¿Qué significa "múltiples usuarios simultáneos"?

**Fragmento del enunciado:** *"La capacidad de soportar múltiples usuarios conectados simultáneamente"*

**Problema:** El término "múltiples" es completamente indefinido desde el punto de vista técnico. No se sabe si se habla de:
- 100 usuarios simultáneos (aplicación pequeña)
- 10.000 usuarios (aplicación de escala media)
- 100.000 o más (aplicación masiva)

**Impacto:** Esta cifra determina toda la arquitectura de infraestructura, los costos de despliegue, la tecnología de base de datos, el uso de CDN, balanceo de carga, etc. Definirla incorrectamente puede resultar en sobrediseño costoso o en un sistema que colapsa.

**Pregunta para el cliente:** ¿Cuántos usuarios concurrentes se esperan en el lanzamiento? ¿Cuál es la proyección de crecimiento a 6 y 12 meses?

---

### Ambigüedad 3: ¿Cómo está estructurada la liga competitiva?

**Fragmento del enunciado:** *"visualización del progreso de cada entrenador dentro de una liga competitiva"*

**Problema:** El concepto de "liga" no está definido. No se sabe:
- Si hay temporadas con inicio y cierre.
- Cómo se ganan o pierden puntos (ELO, puntos fijos, etc.).
- Si hay divisiones, ascensos o descensos.
- Si la liga es global, regional o por grupos de amigos.
- Si hay recompensas al final de temporada.

**Impacto:** Afecta el diseño de RF05 y RF11. Implementar un sistema de liga sin estas definiciones podría resultar en un producto que no satisface la visión del cliente.

**Pregunta para el cliente:** ¿Puede describir cómo imagina que funciona la liga? ¿Hay temporadas, divisiones, un sistema de puntos específico?

---

### Ambigüedad 4 (adicional): ¿Qué implica "seguridad de las cuentas"?

**Fragmento del enunciado:** *"La seguridad de las cuentas"*

**Problema:** "Seguridad" es un término amplio que puede incluir desde hashing de contraseñas hasta autenticación de dos factores (2FA), limitación de intentos de inicio de sesión, detección de bots, o cumplimiento de normativas como GDPR.

**Impacto:** Afecta el alcance y costo de RNF03 y RNF06. Sin claridad, el equipo puede subestimar o sobredimensionar los controles de seguridad.

**Pregunta para el cliente:** ¿Hay requisitos regulatorios específicos? ¿Se requiere autenticación de dos factores? ¿Se recopilan datos de menores de edad que impliquen cumplimiento de normativas especiales?

---

### Ambigüedad 5 (adicional): ¿Qué alcance tienen las funcionalidades futuras?

**Fragmento del enunciado:** *"en el futuro le gustaría incluir nuevas funcionalidades como torneos, recompensas y modos de juego adicionales, aunque estas aún no están completamente definidas"*

**Problema:** Mencionar funcionalidades futuras sin definirlas es una señal de alerta: si no se tienen en cuenta en el diseño inicial, pueden generar deuda técnica severa o rediseños costosos.

**Impacto:** El equipo de arquitectura necesita saber si el sistema debe diseñarse para extensibilidad desde el inicio (por ejemplo, sistema de plugins para modos de juego) o si puede comenzar con una arquitectura más simple.

**Pregunta para el cliente:** ¿En qué plazo aproximado se esperan estas funcionalidades? ¿Se puede definir al menos un MVP de torneos para tenerlo en cuenta en el diseño inicial?

---

## Resumen

| Categoría               | Cantidad |
|-------------------------|----------|
| Requerimientos funcionales   | 15       |
| Requerimientos no funcionales | 8        |
| **Total requerimientos**      | **23**   |
| Requerimientos de alta prioridad | 13    |
| Requerimientos de media prioridad | 8   |
| Requerimientos de baja prioridad  | 2   |
| Ambigüedades identificadas        | 5   |
