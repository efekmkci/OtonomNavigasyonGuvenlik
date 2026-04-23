# 🏎️ Otonom Araç Navigasyon Güvenlik Modülü (SVM)

Bu proje, otonom araçların engeller arasından en güvenli rotayı çizmesini sağlayan **Support Vector Machine (SVM)** tabanlı bir karar mekanizması yazılımıdır.

---

## 🎯 Proje Amacı
Verilen koordinat setlerini birbirinden en geniş **"Güvenlik Koridoru"** ile ayıracak matematiksel modeli tasarlamak ve bu ayrıştırıcı denklemi bulan algoritmayı **OOP** prensipleriyle implemente etmektir.

---

## 🛠️ Teknik Özellikler ve Mimari
Proje, sorumlulukların ayrılması prensibine uygun olarak 3 ana katmanda kurgulanmıştır:

| Katman | Sınıf | Görev |
| :--- | :--- | :--- |
| **Domain Layer** | `Nokta.java` | Veri kapsülleme ve koordinat yönetimi. |
| **Logic Layer** | `SVMAlgoritması.java` | Hinge Loss ve SGD tabanlı eğitim mantığı. |
| **Presentation** | `Main.java` | Otonom karar simülasyonu ve test verileri. |

---

## 📈 Performans ve Karmaşıklık Analizi (Big-O)
Otonom sistemlerin gerçek zamanlı çalışabilmesi için performans optimize edilmiştir:

* **Eğitim Karmaşıklığı:** $O(N \times I)$
    * *N:* Veri noktası sayısı, *I:* İterasyon sayısı.
* **Karar/Tahmin Karmaşıklığı:** $O(1)$
    * **Neden Önemli?** Sabit zamanlı ($O(1)$) tahmin süresi, aracın yüksek hızlarda milisaniyeler içinde manevra kararı almasını sağlar.

---

## 🛡️ Güvenlik ve Optimizasyon
### Neden "En Güvenli" ve "Optimum"?
1.  **Maksimum Marjin:** Algoritma, sadece engelleri ayırmaz; her iki engel grubuna olan dik uzaklığı maksimize ederek en geniş **Güvenlik Koridoru**'nu oluşturur.
2.  **Hata Toleransı:** En geniş boşluğun seçilmesi, sensör gürültüsü veya anlık veri sapmalarında çarpışma riskini en aza indirir.
3.  **Genelleme:** Model, sadece mevcut verilere değil, görülmemiş yeni engel konumlarına karşı da en yüksek tolerans eşiğini sunar.

---

## 🚀 Kurulum ve Çalıştırma
1. Projeyi bilgisayarınıza klonlayın.
2. IntelliJ IDEA veya herhangi bir Java IDE'si ile açın.
3. `Main.java` sınıfını çalıştırarak eğitim sonuçlarını ve otonom karar çıktılarını konsoldan takip edin.

---
**Teslimat Notu:** Bu proje; kodlar, sunum dosyası ve teknik video anlatımı şeklinde 3 ayrı parça olarak teslim edilmiştir.
