## Запуск приложения
### Подготовительный этап
1. Установить и запустить IntelliJ IDEA;
2. Установить и запустить Docker Desktop;
3. Установить и запустить DBeaver;
4. Сделать `git clone` репозитория с Github [по ссылке](https://github.com/anggri29/qa-diploma);
5. Открыть проект `qa-diploma` в IntelliJ IDEA;
6. Создать соединение с MySQL в DBeaver;
7. Создать соединение с PostgreSQL в DBeaver;

### Запуск тестового приложения
1. Запустить MySQL, PostgreSQL, NodeJS через терминал командой:    
    ```
   docker-compose up --build
   ```
2. В новой вкладке терминала запустить тестируемое приложение:
* Для MySQL:
    ```
   java -Dspring.datasource.url=jdbc:mysql://localhost:3306/app -jar artifacts/aqa-shop.jar
    ```
* Для PostgreSQL:
   ```
   java -Dspring.datasource.url=jdbc:postgresql://localhost:5432/app -jar artifacts/aqa-shop.jar
   ```
3. Проверить, что ссылка открывается, и приложение доступно по адресу:
   ```
   http://localhost:8080/
   ```

### Запуск тестов
В новой вкладке терминала запустить тесты:
1. Для MySQL:
   ```
   ./gradlew clean test "-Ddb.url=jdbc:mysql://localhost:3306/app"
   ```
2. Для PostgreSQL:
   ```
   ./gradlew clean test "-Ddb.url=jdbc:postgresql://localhost:5432/app"
   ```

### Перезапуск тестов и приложения
Если нужно перезапустить приложение в окне терминала нужно ввести команду `Ctrl+С` и повторить необходимые действия из предыдущих разделов.

## Формирование отчёта о тестировании
* Сформировать Allure-репорт можно командой:
   ```
   ./gradlew allureServe
   ```
* Сформировать Gradle-репорт можно командой:
   ```
   ./gradlew clean build
   ```
   Для просмотра отчета пройти путь: 
