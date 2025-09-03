# 📚 Projeto Spring MVC Java - Gestão de Livros

![Java](https://img.shields.io/badge/Java-17-red?logo=java&logoColor=white)
![Spring MVC](https://img.shields.io/badge/Spring-MVC-brightgreen?logo=spring&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-Build-blue?logo=gradle&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)

---

## 📖 Sobre o Projeto
Este repositório contém uma aplicação web desenvolvida em **Java com Spring MVC**, utilizando **Gradle** como ferramenta de build.  

O sistema implementa um CRUD simples para **gestão de livros**, com páginas web integradas ao Spring MVC seguindo o padrão **Model-View-Controller**.

---

## 🛠️ Tecnologias Utilizadas
- **Java 17+**
- **Spring MVC**
- **Gradle**
- **Thymeleaf** (views em HTML)
- **HTML5 / CSS3 / JS**
- **H2 Database (ou outro configurado)**

---

## 📂 Estrutura do Projeto
```
spring-mvc-java/
│── src/
│   ├── main/
│   │   ├── java/       
│   │   │   └── br/com/fiap/spring/mvc/
│   │   │       ├── controller/   # Controllers (ex: LivroController)
│   │   │       ├── entity/       # Entidades (ex: Livro)
│   │   │       ├── repository/   # Repositórios
│   │   │       └── service/      # Serviços (ex: LivroService)
│   │   ├── resources/   
│   │   │   ├── static/           # Arquivos estáticos (CSS, JS)
│   │   │   └── templates/        # Views (LivroLista.html, LivroCadastro.html)
│   │   └── application.properties
│── build.gradle         
│── settings.gradle      
│── README.md            
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

## 🌐 Endpoints Implementados

### 📚 LivroController

- `GET /livros/lista` → Listar todos os livros  
- `GET /livros/cadastro` → Exibir formulário de cadastro  
- `POST /livros/cadastro` → Salvar novo livro (com validação)  
- `GET /livros/cadastro/{id}` → Editar livro existente  

### 🖥️ Views
- `LivroLista.html` → Página de listagem de livros  
- `LivroCadastro.html` → Página de cadastro/edição de livro  

---

## ✅ Melhorias Futuras
- Validações adicionais de formulário  
- Implementar paginação e ordenação de livros  
- Adicionar exclusão de livros (`DELETE`)  
- Testes unitários com JUnit e Mockito  
- Deploy em nuvem (Heroku, Azure ou AWS)  

---

## 👨‍💻 Autor
**Cauã Marcelo Machado**  
📌 Estudante de TI | Backend Developer (Java & Spring) | Cloud Enthusiast  

🔗 [LinkedIn]([https://www.linkedin.com/in/cauã-machado](https://www.linkedin.com/in/caua-machado-dev))  
🔗 [GitHub](https://github.com/CauaMachad0)

---

## 📜 Licença
Este projeto é de uso acadêmico/estudo, livre para consultas e melhorias.  
