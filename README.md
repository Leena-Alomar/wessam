# 🏅 Wessam (وسام)

## 📌 Project Description
Wessam (وسام) is an intelligent sports management and analytics platform that connects coaches, trainees, gyms, and organizers.  
The platform leverages **AI-powered analytics** to improve training quality and support data-driven decision making.

---

## 🧩 Contributions (Leena)
- 🤖 Designed and implemented **AI-powered features**
- 📊 Built **analytics & dashboards** for insights and reporting
- 🧩 Designed **ER Diagram (ERD)**
- 🔄 Created **Use Case Diagram**
- 🎨 Designed **Figma UI interfaces**
- 📦 Created and maintained **DTOs**
- 📝 Wrote full **system documentation**

---

## 🔗 System Design & Documentation
- 🎨 **Figma UI Design**  
  https://www.figma.com/design/JB0Gov46coABiU4SIsEtbm/Gym-landing-page-website--Community-

- 🧩 **ER Diagram (ERD)**  
  https://mermaid.live/view#pako:eNqtVttu4jAQ_...

- 🔄 **Use Case Diagram**  
  https://drive.google.com/file/d/1ZX58tYyVYizoSxi4GZqc3QLax3pZ9bxb/view

- 📘 **API Documentation (Postman)**  
  https://documenter.getpostman.com/view/49815088/2sBXVbJZXe

---

## 🤖 AI & Analytics Endpoints

### 🧑‍🎓 Trainee & AI Coach
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/coach/{traineeId}` | AI personalized coaching advice |
| GET | `/get/registerd/{traineeId}` | Trainee registered courses |

---

### 📚 Courses & AI Analytics
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/get/top/{courseId}` | Top-rated courses |
| GET | `/get/recommended/{traineeId}/{sportId}` | AI recommended courses |
| GET | `/get/dateRange/{sportId}/{startDate}/{endDate}` | Courses by date range |
| GET | `/get/upcoming` | Upcoming courses |
| GET | `/get/totalTrainee/{id}` | Total trainees per course |
| GET | `/get/feedback/{courseId}` | AI course feedback analysis |

---

### 🏆 Tournament Analytics
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/get/upcoming` | Upcoming tournaments |
| GET | `/get/dateRange/{sportId}/{startDate}/{endDate}` | Tournaments by date range |
| GET | `/get/totalTrainee/{id}` | Total trainees per tournament |

---

### 🏅 Sport Analytics
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/api/v1/sport/get` | Get all sports |
| GET | `/api/v1/sport/analyze/sport/{sportId}` | Analyze sport popularity |

---

## 🧠 Technologies Used
- Java  
- Spring Boot  
- RESTful APIs  
- JPA / Hibernate  
- MySQL  
- AI Prompt-based Analysis  
- Figma (UI/UX)

---

## 📌 Notes
This README highlights **individual contributions by Leena** as part of the Wessam platform project.
