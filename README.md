# 🍵💻 LovePC Cafe

<p align="center">
  <img src="docs/images/cute_pc_cafe.gif" alt="Cute PC Cafe Animation" width="300"/>
</p>

---

## 💖 소개
**LovePC Cafe**는 **PC방 주문/조리 시뮬레이션 앱**이에요!  
사용자가 주문하면 관리자가 실시간으로 조리 상태를 확인하고, 테스트 PG 결제까지 시뮬레이션할 수 있어요.  

📌 **기술 스택**: Spring Boot + MyBatis + MySQL + WebSocket  

---

## 🏗 프로젝트 구조
```text
com.lovepc.cafe
├─ config
├─ controller
├─ domain
├─ mapper
├─ service
└─ util
```
> 자세한 파일 구조는 repo에서 확인 가능  

---

## 🛠 주요 기능

### 👤 사용자
- 로그인 / 마이페이지
- 메뉴 주문 & 결제 (💵 현금/계좌이체, 테스트 PG)
- 주문 현황 및 **실시간 알림**

### 👩‍💼 관리자
- 로그인 / 마이페이지
- 메뉴판 관리 (사진, 설명, 가격)
- 카테고리 관리 (한식, 일식 등)
- 주문 상태 확인, **조리 수락/실패 처리**
- 결제 확인 후 조리 시작

### 🔄 공통
- WebSocket **실시간 알림**
- 접속 기록 관리
- UTF-8 지원

---

## 💾 DB 테이블
| 테이블 | 설명 |
|--------|------|
| pc_user | 일반 사용자 테이블 |
| pc_admin | 관리자 테이블 |
| menu_category | 메뉴 카테고리 |
| menu_item | 메뉴판 |
| menu_orders | 주문 및 결제 상태 |
| login_history | 접속 기록 |

---

## ⚙️ 개발 환경

<p align="center"> 
    <img src="https://img.icons8.com/color/48/java-coffee-cup-logo.png" width="32" alt="Java"/> 
    <img src="https://img.icons8.com/color/48/spring-logo.png" width="32" alt="Spring Boot"/> 
    <img src="https://img.icons8.com/color/48/mysql-logo.png" width="32" alt="MySQL"/> 
    <img src="https://img.icons8.com/color/48/visual-studio-code-2019.png" width="32" alt="VSCode"/> 
</p>

- Java 17
- Spring Boot 3.4.11
- Gradle 8.14.x
- MySQL 8.x
- VSCode + Java Extension Pack

---

## 🚀 실행 방법

1️⃣ MySQL에서 DB 생성 후, `application.properties`에 DB 설정 추가

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/lovepccafe?useUnicode=true&characterEncoding=UTF-8&allowPublicKeyRetrieval=true&useSSL=false
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
```

2️⃣ Gradle 빌드 및 실행

```bash
./gradlew build
./gradlew bootRun
```

3️⃣ 브라우저/앱에서 API 호출 및 WebSocket 알림 테스트
- 💳 테스트 PG 연동 주문 시, payment_status 컬럼 업데이트

- WebSocket으로 관리자/사용자에게 실시간 알림

- 결제 확인 후 조리 시작

⚠️ 주의

- VSCode Java Extension Pack 설치 필요

- JDK 17 + JAVA_HOME 설정 필요

- Gradle과 JDK 버전 일치 필수

---

🎯 앞으로 추가할 기능

- 귀여운 UI/UX + 움직이는 GIF/아이콘 🥰

- 배달/확장 기능 🚀

- 통계 및 접속 기록 분석 📊

- 실제 PG 연동 💳

<p align="center"> <img src="docs/images/cute_pc_cafe2.gif" width="300" alt="Cute Animation"/> </p>