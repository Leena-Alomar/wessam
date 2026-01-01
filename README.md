# 🏅 Wessam (وسام)

## 📌 Project Description
Wessam (وسام) is an intelligent sports management and analytics platform that connects coaches, trainees, gyms, and organizers.  
The platform uses **AI-powered analytics** to enhance training quality and enable data-driven decision making.

---

## 👩‍💻 Contributor
- **Leena**

---

## 🧩 Full Contributions (Leena)

### 🤖 AI & Analytics
- AI personalized coaching recommendations for trainees
- AI-powered course recommendation system
- AI analysis of course feedback
- AI analysis of coach feedback
- AI sport popularity analysis
- AI-powered tournament and course insights
- Analytics dashboards and statistical endpoints

---

### 🧑‍🎓 Trainee Management
- View trainee registered courses
- Analytics related to trainee participation

---

### 📚 Course Management (CRUD + Analytics)
- Create, update, delete, and retrieve courses
- Retrieve courses by date range
- Retrieve upcoming courses
- Retrieve top courses based on performance
- Calculate total trainees per course
- AI feedback analysis for courses
- AI next-level course recommendations

---

### 🏆 Tournament Management (CRUD + Analytics)
- Retrieve upcoming tournaments
- Retrieve tournaments by date range
- Calculate total trainees per tournament
- AI-generated insights for tournaments

---

### 🏅 Sport Management (CRUD + Analytics)
- Create, update, delete, and retrieve sports
- AI-based sport popularity analysis

---

### 🏢 Organizer Management (CRUD)
- Create, update, delete, and retrieve organizers

---

### 📊 Dashboards & Statistics
- Coach performance analytics
- Course popularity analytics
- Tournament participation analytics
- Sport trend analysis dashboards

---

### 🧩 System Design & Architecture
- Designed **ER Diagram (ERD)**
- Designed **Use Case Diagram**
- Created and updated **DTOs**
- Full **API documentation**
- System documentation and technical writing

---

### 🎨 UI/UX Design
- Designed Figma interfaces for system workflows

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

## 🚀 Key Endpoints Implemented by Leena

### 🧑‍🎓 Trainee & AI Coach
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/coach/{traineeId}` | AI personalized coaching advice |
| GET | `/get/registerd/{traineeId}` | Get trainee registered courses |

---

### 📚 Courses
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/get/top/{courseId}` | Get top courses |
| GET | `/get/recommended/{traineeId}/{sportId}` | AI recommended courses |
| GET | `/get/dateRange/{sportId}/{startDate}/{endDate}` | Courses by date range |
| GET | `/get/upcoming` | Upcoming courses |
| GET | `/get/totalTrainee/{id}` | Total trainees per course |
| GET | `/get/feedback/{courseId}` | AI course feedback analysis |

---

### 🏆 Tournaments
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/get/upcoming` | Upcoming tournaments |
| GET | `/get/dateRange/{sportId}/{startDate}/{endDate}` | Tournaments by date range |
| GET | `/get/totalTrainee/{id}` | Total trainees per tournament |

---

### 🏅 Sports
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/api/v1/sport/get` | Get all sports |
| POST | `/api/v1/sport/add` | Add new sport |
| PUT | `/api/v1/sport/update/{id}` | Update sport |
| DELETE | `/api/v1/sport/delete/{id}` |
| GET | `/api/v1/sport/analyze/sport/{sportId}` | Analyze sport popularity |

---

### 🏢 Organizers
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/api/v1/organizer/get` | Get all organizers |
| POST | `/api/v1/organizer/add` | Add organizer |
| PUT | `/api/v1/organizer/update/{id}` | Update organizer |
| DELETE | `/api/v1/organizer/delete/{id}` |

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
This README documents the **complete individual contribution of Leena**, including **CRUD operations, AI features, analytics, system design, and documentation**, as part of the Wessam platform.
