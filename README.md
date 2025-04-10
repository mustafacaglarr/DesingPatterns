
# ☕ Java Spring Boot Design Patterns - User Registration Demo

Bu proje, Java Spring Boot kullanılarak aynı işlemin (kullanıcı kaydı) farklı **tasarım desenleri** (design patterns) ile nasıl gerçekleştirilebileceğini gösteren eğitim amaçlı bir örnektir.

## 🎯 Amaç

Her bir tasarım desenini gerçek bir kullanım senaryosu üzerinden (kayıt işlemi) anlatmak ve örneklemek.

## 🛠️ Kullanılan Tasarım Desenleri

| Pattern        | Açıklama |
|----------------|----------|
| Singleton      | Tüm uygulama boyunca yalnızca bir `RegistrationService` örneği kullanılır. |
| Factory Method | Kullanıcı tipine (örneğin, standart ya da sosyal medya ile) göre farklı kayıt sınıfları üretilir. |
| Observer       | Kayıt sonrası tetiklenen olaylar (mail gönderme, log tutma vs.) dinleyiciler aracılığıyla yapılır. |
| Strategy       | Farklı kayıt stratejileri (standart, sosyal medya) çalıştırılır. Strateji çalışma zamanında belirlenir. |
| Decorator      | Kayıt işlemi, loglama veya doğrulama gibi davranışlarla dinamik olarak genişletilir. |


## 🚀 Nasıl Çalıştırılır?

1. Projeyi klonlayın:
   ```bash
   git clone https://github.com/kullaniciadi/design-patterns-registration.git
   cd design-patterns-registration
   ```

2. Projeyi çalıştırın:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Aşağıdaki endpoint'leri test edin (Postman ile):

   - `POST /singleton/register`
   - `POST /factory/register?type=standard`
   - `POST /observer/register`
   - `POST /strategy/register?strategy=standard`
   - `POST /decorator/register`

