@rem hkzk.bat

@echo off
C:
cd "C:\Program Files\Java\hkzk"
java -jar hkzk-1.2.jar --spring.profiles.active=prod >>hkzk.log 2>&1 &


@rem server

cd "C:\Program Files\Java\hkzk"
sc create hkzksync binPath= hkzk.bat start= auto
