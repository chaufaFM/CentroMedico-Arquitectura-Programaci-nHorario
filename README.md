
# Centro Médico — Programación de Horarios

## Descripción del proyecto

Proyecto académico desarrollado para el curso **Diseño e Implementación de Arquitectura Empresarial**.

El sistema tiene como objetivo gestionar la programación de horarios de atención de los médicos de un centro médico, permitiendo registrar y consultar fechas y horas de atención.

El proyecto utiliza una arquitectura basada en aplicaciones independientes que se comunican mediante servicios REST.

## Arquitectura del sistema

Actualmente, el sistema está compuesto por dos aplicaciones Spring Boot:

| Aplicación | Descripción | Puerto |
|---|---|---|
| MicroProgramacion | Microservicio backend encargado de registrar y consultar programaciones de horarios. | 8082 |
| VistaProgramacion | Aplicación web desarrollada con Thymeleaf que consume el microservicio. | 8083 |

### Comunicación entre aplicaciones

```text
Usuario
   |
   v
VistaProgramacion (Puerto 8083)
   |
   | HTTP REST - RestTemplate
   v
MicroProgramacion (Puerto 8082)
   |
   | Spring Data JPA
   v
Base de datos H2
```

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- Thymeleaf
- H2 Database
- Maven
- IntelliJ IDEA
- Git y GitHub

## Estructura del repositorio

Los proyectos se agrupan por servicio, conservando sus nombres originales.

```text
CentroMedico/
├── programacion/
│   ├── MicroProgramacion/
│   └── VistaProgramacion/
├── .gitignore
└── README.md
```

## Funcionalidades implementadas

### MicroProgramacion (Backend)

- Registrar una programación de horario.
- Consultar la lista de programaciones registradas.
- Almacenar información mediante Spring Data JPA y H2.
- Exponer servicios REST para la comunicación con otras aplicaciones.

### VistaProgramacion (Frontend)

- Mostrar el formulario de registro de programación.
- Capturar la fecha de atención y las horas de inicio y fin.
- Enviar los datos al microservicio mediante RestTemplate.
- Disponer de una página inicial para el listado de programaciones.

## Endpoints REST

| Método | Endpoint | Descripción |
|---|---|---|
| POST | /programacion/grabar | Registrar una programación de horario. |
| GET | /programacion/listar | Consultar las programaciones registradas. |

### Ejemplo de solicitud POST

URL:

`http://localhost:8082/programacion/grabar`

Cuerpo JSON:

```json
{
  "fechaAtencion": "2026-10-15",
  "horaInicio": "08:00",
  "horaFin": "10:00"
}
```

### Ejemplo de solicitud GET

`http://localhost:8082/programacion/listar`

## Requisitos del sistema

Para ejecutar el proyecto se necesita:

- JDK 21.
- Maven o Maven Wrapper.
- IntelliJ IDEA u otro IDE compatible con Maven.
- Puertos 8082 y 8083 disponibles.

## Instalación y ejecución

### 1. Clonar el repositorio

```bash
git clone URL_DEL_REPOSITORIO
```

### 2. Ejecutar el backend

Abrir el proyecto:

`programacion/MicroProgramacion`

Ejecutar la clase:

`MicroProgramacionApplication.java`

El microservicio estará disponible en:

`http://localhost:8082`

### 3. Ejecutar el frontend

Abrir el proyecto:

`programacion/VistaProgramacion`

Ejecutar la clase:

`VistaProgramacionApplication.java`

La aplicación web estará disponible en:

`http://localhost:8083/verGrabar`

### 4. Registrar una programación

1. Acceder al formulario web.
2. Seleccionar la fecha de atención.
3. Indicar la hora de inicio.
4. Indicar la hora de fin.
5. Presionar el botón para registrar la programación.

**Nota:** actualmente se utiliza una base de datos H2 en memoria. Los registros se pierden cuando se reinicia el backend.

## Estado del proyecto

### Funcionalidades implementadas

- Microservicio de programación de horarios.
- Persistencia de datos mediante JPA y H2.
- Endpoints REST para registro y listado.
- Aplicación web desarrollada con Thymeleaf.
- Comunicación entre frontend y backend.
- Formulario web de registro de programación.

### Funcionalidades pendientes

- Completar la visualización del listado en la interfaz web.
- Implementar los demás módulos del proceso de programación.
- Integrar los servicios adicionales definidos en la arquitectura del sistema.

## Documentación

La carpeta `docs/` está destinada a almacenar los diagramas y documentos técnicos del proyecto, incluyendo los modelos de arquitectura desarrollados durante el curso.

## Información académica

**Curso:** Diseño e Implementación de Arquitectura Empresarial.

**Caso de estudio:** Centro Médico.

**Proceso asignado:** Proceso 1 — Programación de horarios de atención de médicos.
