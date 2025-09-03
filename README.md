# 🚀 Projeto Spring MVC Java

![Java](https://img.shields.io/badge/Java-17-red?logo=java&logoColor=white)
![Spring MVC](https://img.shields.io/badge/Spring-MVC-brightgreen?logo=spring&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-Build-blue?logo=gradle&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)

---

## 📖 Sobre o Projeto
Este repositório contém uma aplicação desenvolvida em **Java com Spring MVC**, utilizando **Gradle** como ferramenta de build.  
O objetivo é demonstrar a estrutura de um projeto web seguindo o padrão **MVC (Model-View-Controller)**, com boas práticas de organização e implementação.

---

## 🛠️ Tecnologias Utilizadas
- **Java 17+**
- **Spring MVC**
- **Gradle**
- **Thymeleaf / JSP (dependendo da view configurada)**
- **HTML5 / CSS3**
- **H2 Database (ou outro configurado)**

---

## 📂 Estrutura do Projeto
```
spring-mvc-java/
│── src/
│   ├── main/
│   │   ├── java/        # Código fonte (controllers, models, services)
│   │   ├── resources/   # Arquivos de configuração
│   │   └── webapp/      # Views (HTML/JSP)
│── build.gradle         # Configurações do Gradle
│── settings.gradle      # Configurações do projeto
│── README.md            # Documentação
```

---

## ▶️ Como Executar o Projeto

### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/CauaMachad0/spring-mvc-java.git
cd spring-mvc-java
```

### 2️⃣ Construir o projeto
```bash
./gradlew build
```

### 3️⃣ Rodar aplicação (Tomcat/Jetty embutido ou configurado)
```bash
./gradlew bootRun
```

---

## 🌐 Endpoints Principais (Exemplo CRUD)

### 🏍️ MotoController
- `GET /motos` → Listar todas as motos  
- `GET /motos/{id}` → Buscar moto por ID  
- `POST /motos` → Cadastrar nova moto  
- `PUT /motos/{id}` → Atualizar moto existente  
- `DELETE /motos/{id}` → Excluir moto  

### 📄 OcorrenciaController
- `GET /ocorrencias` → Listar todas as ocorrências  
- `GET /ocorrencias/{id}` → Buscar ocorrência por ID  
- `POST /ocorrencias` → Registrar nova ocorrência  
- `PUT /ocorrencias/{id}` → Atualizar ocorrência  
- `DELETE /ocorrencias/{id}` → Excluir ocorrência  

*(Ajuste conforme seus controllers e mapeamentos no código)*

---

## ✅ Melhorias Futuras
- Integração com **Spring Boot** para simplificar configuração
- Autenticação e Autorização com **Spring Security**
- Testes automatizados com **JUnit e Mockito**
- Deploy em nuvem (Heroku / Azure / AWS)

---

## 👨‍💻 Autor
**Cauã Marcelo Machado**  
📌 Estudante de TI | Backend Developer (Java & Spring) | Cloud Enthusiast  

🔗 [LinkedIn]([https://www.linkedin.com/in/cauã-machado](https://www.linkedin.com/in/caua-machado-dev))  
🔗 [GitHub](https://github.com/CauaMachad0)

---

## 📜 Licença
Este projeto é de uso acadêmico/estudo, livre para consultas e melhorias.  
