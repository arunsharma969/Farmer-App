# Code on the Go (CoGo) Offline & Online Build Guide

प्रोजेक्ट में **Offline Build** के लिए `offline-repo` फ़ोल्डर जोड़ दिया गया है, जिसमें `guava-33.3.1-jre.jar` और उससे संबंधित सभी जरूरी फाइल्स शामिल हैं।

### Offline Build सेटअप:

1. **`offline-repo` फ़ोल्डर:**
   - प्रोजेक्ट के रूट (Root) में `offline-repo` फ़ोल्डर मौजूद है।
   - इसमें `com/google/guava/...` की सभी फाइल्स हैं।

2. **`settings.gradle.kts`:**
   - इसमें `maven { url = uri("${rootDir}/offline-repo") }` जोड़ा गया है, जिससे Gradle बिना इंटरनेट के भी लोकल फाइलों से बिल्ड कर लेता है।

3. **`build.gradle.kts`:**
   - इसके `buildscript` में भी `offline-repo` जोड़ा गया है।

---

### Code on the Go में ऑफलाइन बिल्ड करने के 2 तरीके:

#### तरीका 1 (सबसे आसान - प्रोजेक्ट के अंदर से):
- सुनिश्चित करें कि आपके प्रोजेक्ट फ़ोल्डर (`/storage/emulated/0/CodeOnTheGoProjects/applegrow-ai...`) के अंदर `offline-repo` फ़ोल्डर मौजूद है।
- `settings.gradle.kts` और `build.gradle.kts` में `maven { url = uri("${rootDir}/offline-repo") }` वाली लाइन होनी चाहिए।
- Code on the Go में **Build** बटन दबाएं।

#### तरीका 2 (Code on the Go के लोकल मावेन में कॉपी करना):
अगर Code on the Go का बिल्ड सिर्फ `/data/data/com.itsaky.androidide/files/home/maven/localMvnRepository` में चेक कर रहा है, तो Code on the Go के **Terminal** में यह 2 कमांड चलाएं:

```bash
mkdir -p /data/data/com.itsaky.androidide/files/home/maven/localMvnRepository/com/google/guava/guava/33.3.1-jre/
cp offline-repo/com/google/guava/guava/33.3.1-jre/* /data/data/com.itsaky.androidide/files/home/maven/localMvnRepository/com/google/guava/guava/33.3.1-jre/
```
इसके बाद ऑफलाइन बिल्ड 100% सफल हो जाएगा!
