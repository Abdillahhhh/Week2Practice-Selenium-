# 📘 Selenium Automation Setup

Repositori ini berisi project otomasi menggunakan **Selenium**. Sebelum menjalankan project ini, pastikan kamu telah menginstal beberapa tools dan dependency penting.

---

## 🔧 Prasyarat Instalasi

Sebelum menjalankan Selenium, pastikan kamu sudah menginstal:

### 1. **Java Development Kit (JDK)**
- Unduh dan install JDK dari: https://www.oracle.com/java/technologies/javase-downloads.html
- Pastikan `JAVA_HOME` sudah diatur di environment variables.

### 2. Maven
Unduh dari: https://maven.apache.org/download.cgi
Ekstrak dan tambahkan path bin Maven ke environment variables.
Cek instalasi: mvn -v

### 3. Selenium
Selenium akan otomatis dikelola sebagai dependency Maven (lihat pom.xml).
Tidak perlu instal manual, cukup jalankan: mvn clean install

### 4. Maven Surefire Plugin
Plugin ini digunakan untuk menjalankan test case dan membuat reporting secara otomatis.

### 5. ▶️ Menjalankan Project
untuk menjalankan project ini cukup: mvn clean test
