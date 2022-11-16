![](https://www.ufjf.br/wp-content/plugins/imgpgprinc_novo/arquivos/deptocomputacao/1.jpg)

# Practical Work of DCC025 - Object-oriented programming - Semester 2022-3
## Professor Gleiph Ghiotto

## 🩺 Doctor Appointment Schedule

## 🚀 Quick start

1.  **Pre-requisites**

    - **JDK 17**: https://www.oracle.com/br/java/technologies/downloads/#java17
    - **Maven 3.8.x**: https://maven.apache.org/download.cgi


1.  **Clone and move into the repository**

    ```shell
    git clone git@github.com:ceciliaromao/ufjf-dcc025-exercises.git
    cd agendamentoConsultas/
    ```
1.  **Run your application!**

    ```shell
    mvn install
    java -jar target/agendamentoConsultas-1.0-SNAPSHOT-jar-with-dependencies.jar
    ```

## 🔍 About the project

**Project's goal:**
- The project aims to create a system for medical scheduling. Five classes were created: `Person`, `Patient`, `Employees`, `Doctor` and `Admin`. 
- `Person` and `Employees` classes are abstract classes. 
- `Person` is the superclass; `Patient` and `Employees` are subclasses of `Person`; `Admin` and `Doctor` are subclasses of `Employees`.
- Two interfaces were also created: `Calendar` and `Users`.

**Class Description:**
- `Person`: It has basic attributes: `name`, `birthdate`, `address`, `gender`, `phoneNumber`, `email` and `password`, in addition to the methods for scheduling and consulting the agenda;
- `Patient`: It's a subclass of `Person` and has as new attributes `cpf` and `healthInsurance`, in addition to the polymorphic methods of scheduling an appointment for themself, and checking which times are scheduled on their behalf;
- `Employees`: It's a subclass of `Person` and a superclass of `Admin` and `Doctor`. It has a new attribute `section` and a new method of defining schedules, creating a vacancy in the agenda, which can be scheduled by a patient;
- `Doctor`: It's a subclass of `Employees`, with the new attribute `crm` and `specialty`, in addition to the polymorphic methods to define their scale and consult their schedule;
- `Admin`: It's a subclass of `Employees` and has a new attribute `registration`, and new methods to register a user, consult data on active users, edit and delete users, in addition to defining a general scale - inherited from `Service` class -, performing appointments or consulting a general agenda - inherited from `Person` class -, and remove a scheduled appointment.

## 👨‍💻 Conventions

**Branch Names**
  - all lowercase
  - only dashes (-) to separate words
  - no underscore or camelCase
  - should start with:
    ```
    feat/
    fix/
    docs/
    style/
    refactor/
    build/
    revert/
    ```
  - continue with author name
      eg: `feat/john-doe`
  - continue with short description
      eg: `feat/john-doe/implement-feature-x`
  - please keep it short
      good: `feat/john-doe/implement-return-form`
      bad: `feat/john-doe/allow-users-to-fill-in-return-data-with-a-form`

**Commit messages**
  - All commit messages must follow conventions stated here
    ```
    git commit -m "feat: allow edit payment"
                   ^--^  ^-----------------^
                    |     |
                    |     +-> Summary in present tense.
                    |
                    +-------> Type:  feat, fix, docs, style, refactor, build or revert.
    ``` 

**Merge Request titles**
  - should start with: `[feat | fix | docs | style | refactor | build | revert]`

  - continue with author name
    eg: `[feat][john-doe]`

  - followed by : and then space  
    eg: `[feat][john-doe]: `

  - continue with description
    eg: `[feat][john-doe]: Example of valid merge request title`



---
###### This application was developed by Computer Science students at Universidade Federal de Juiz de Fora
###### Developed by: Bruno Rocha Pedrosa, Eduardo Oliveira Almeida, Maria Cecília Romão Santos, Maycon Douglas Silva Cardoso
###### tags: `Java` `Object Oriented Programming` `Swing` `UFJF`
