
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

## 📁 Proje Yapısı

```
registration/
├── controller/
│   ├── SingletonRegistrationController.java
│   ├── FactoryRegistrationController.java
│   ├── ObserverRegistrationController.java
│   ├── StrategyRegistrationController.java
│   └── DecoratorRegistrationController.java
│
├── service/
│   ├── RegistrationService.java
│   ├── ObserverRegistrationService.java
│   └── StrategyRegistrationService.java
│
├── repository/
│   └── UserRepository.java
│
├── model/
│   └── User.java
│
├── factory/
│   ├── Registration.java
│   ├── StandardRegistration.java
│   ├── SocialRegistration.java
│   └── RegistrationFactory.java
│
├── observer/
│   ├── RegistrationEvent.java
│   └── RegistrationEventListener.java
│
├── strategy/
│   ├── RegistrationStrategy.java
│   ├── StandardRegistrationStrategy.java
│   ├── SocialRegistrationStrategy.java
│   └── RegistrationStrategyResolver.java
│
└── decorator/
    ├── RegistrationProcessor.java
    ├── BasicRegistrationProcessor.java
    └── LoggingRegistrationDecorator.java
```

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

3. Aşağıdaki endpoint'leri test edin (Postman veya curl ile):

   - `POST /singleton/register`
   - `POST /factory/register?type=standard`
   - `POST /observer/register`
   - `POST /strategy/register?strategy=standard`
   - `POST /decorator/register`

## 📌 Notlar

- Veritabanı olarak in-memory bir yapı (örneğin, Map) kullanılabilir.
- Email gönderimi gibi işlemler sadece log çıktısı şeklindedir.
- Her desen, tek bir sorumluluğu yerine getirecek şekilde yapılandırılmıştır.

## 👨‍💻 Katkıda Bulun

Bu projeyi geliştirmek istersen, yeni tasarım desenleri ekleyebilir (örneğin Command, Template Method), testler yazabilir veya dokümantasyonları detaylandırabilirsin.

Pull request'ler her zaman hoş karşılanır!

## 🧠 Öğrenme Hedefleri

- SOLID prensiplerini anlama
- Tasarım desenlerinin uygulamalı kullanımı
- Spring Boot ile temiz mimari tasarımı

## 📜 Lisans

MIT License. İstediğiniz gibi kullanabilirsiniz.
