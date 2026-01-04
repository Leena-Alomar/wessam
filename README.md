<<<<<<< HEAD
# 🏅 Wessam (وسام)

## 📌 Project Description
Wessam (وسام) هو منصة ذكية لإدارة الرياضة وتحليل البيانات تربط بين المدربين، المتدربين، الصالات الرياضية والمنظمين.  
تساعد المنصة في تحسين التدريب واتخاذ القرارات باستخدام **تحليلات مدعومة بالذكاء الاصطناعي**.

### الميزات الرئيسية
- 🏋️ **تحليل أداء المدربين**  
- 📚 **توصيات الكورسات للمتدربين**  
- 💬 **تحليل انطباعات المتدربين**  
- 📊 **تقييم شعبية الرياضات**  

### الفوائد
- المتدربين يحصلون على إرشادات شخصية  
- المدربين يمكنهم متابعة أداءهم  
- المنظمات الرياضية تتخذ قرارات مبنية على البيانات  

---

## 👥 Team Members
- Leena  
- Abdulrahman  
- Mohannad  

---
## 🧩 My Contributions
| Contribution | Description |
|-------------|-------------|
|  AWS | رفع ونشر المشروع على سيرفرات امازون |
|  Moyassar | اضافة ميزة الدفع ميسر |
|  ER Diagram | تصميم ER Diagram |
|  TESTING |   Postman اختبار النظام بالكامل |
|  Documentation | توثيق النظام |
|  DTO   |  بناء المودلز  |
|  AI Features | المشاركة في انشاء ميزات متعلقة بالذكاء الاصطناعي | 
---

## 🔗 System Diagrams
| Diagram | Link |
|--------|------|
| 🎨 Figma UI Design | [Figma Link](https://www.figma.com/design/JB0Gov46coABiU4SIsEtbm/Gym-landing-page-website--Community-?node-id=0-1&t=aV0c2TGbKTqVvj1E-1) |
| 🧩 ER Diagram (ERD) | [Mermaid Live Link](https://mermaid.live/view#pako:eNqtVttu4jAQ_...) |
| 🔄 Use Case Diagram |[ [Google Drive Link](https://drive.google.com/XXXXXXXX)](https://drive.google.com/file/d/1ZX58tYyVYizoSxi4GZqc3QLax3pZ9bxb/view?usp=drivesdk) |
|  API documentation  | [postman link](https://documenter.getpostman.com/view/49815088/2sBXVbJZXe)  |

---

# My Work
## 🏋️ Coach Registration & Management
path: /api/v1/coach

| Method | Endpoint | Description |
|------|--------|------------|
| POST | `/register` | Coach registration |
| PUT | `activate/{coachId}` | Activate a coach (Gym) | 

---

---


## 🏢 Branch Management
path: /api/v1/branches
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/get-all` | Get all branches (Admin) |
| POST | `/add` | Add new branch (Gym) |
| PUT | `/update/{branchId}` | Update branch (Gym) |
| DELETE | `/delete/{branchId}` | Delete branch (Gym) |
| GET | `/get-gym` | Get branches by gym |

---

## 🏢 Gym Management 
path: /api/v1/gym

| Method | Endpoint | Description |
|--------|---------|-------------|
| POST | `/register` | Register a new gym | 
| PUT | `/activate/{gymId}` | Activate gym |
| GET | `/subscibe/` (month\quarter\half\year) | Subsecribe and pay |

---

## 🧑‍🎓 Trainee
path: /api/v1/trainee
| Method | Endpoint | Description |
|--------|---------|-------------|
| POST | `/register` | Trainee registration |
| GET | `/nutrition` | generate a day nutrition with AI | 
| PUT | `/update/{id}` | Update trainee profile |

---

## 📚 Courses & AI Analytics
path: /api/v1/course/

| Method | Endpoint | Description |
|--------|---------|-------------|
| POST | `/add` | Add new course |
| PUT | `/update/{id}` | Update course | 
| GET | `/top` | Get course details |

---

---

### 📚 course registration
path: /api/v1/course-registration/

| Method | Endpoint | Description |
|--------|---------|-------------|
| POST | `/register/{courseId}` | Register in course and pay | 
| DELETE | `/get-by-course/{courseId}` | get a course registration | 
| GET | `/delete/registration` | delete registration | 
| GET | `/complete/{registrationId}` | mark student complete a course |

---

### Course Review
path: /api/v1/reviews
| HTTP Method | Endpoint | Auth    | Description|
| ----------- | --------------------- | ------- | ---- |
| GET | `/get/{courseId}`| Public  | Get all reviews for a specific course |
| POST | `/add` | TRAINEE | Add a review for a completed course |
| PUT | `/update/{reviewId}` | TRAINEE | Update an existing course review |
| `DELETE`    | `/delete/{reviewId}`  | TRAINEE | Delete a course review                                       |
| `GET`       | `/summary/{courseId}` | Public  | Get AI-generated summary and insights for a completed course |


---

### 🏅 Sport Management
| Method | Endpoint | Description | Name |
|--------|---------|-------------|------|
| GET | `/api/v1/sport/get` | Get all sports | Leena |
| POST | `/api/v1/sport/add` | Add new sport | Leena |
| PUT | `/api/v1/sport/update/{id}` | Update sport | Leena |
| DELETE | `/api/v1/sport/delete/{id}` | Delete sport | Leena |
| GET | `/api/v1/sport/analyze/sport/{sportId}` | Analyze sport popularity | Leena |

---

### 🏢 Organizer Management
| Method | Endpoint | Description | Name |
|--------|---------|-------------|------|
| GET | `/api/v1/organizer/get` | Get all organizers | Leena |
| POST | `/api/v1/organizer/add` | Add new organizer | Leena |
| PUT | `/api/v1/organizer/update/{id}` | Update organizer | Leena |
| DELETE | `/api/v1/organizer/delete/{id}` | Delete organizer | Leena |

---

## 🧠 Technologies Used
=======
# Wessam (وسام)  

📌 **Project Description**  
Wessam (وسام) is an intelligent sports management and analytics platform connecting coaches, trainees, gyms, and organizers.  
The platform uses AI-powered analytics to enhance training quality and enable data-driven decision making.  


---

## 🧩 Individual Contributions (Leena)  

### 🤖 AI & Analytics
- AI personalized coaching recommendations for trainees  
- AI-powered course recommendation system  
- AI analysis of course feedback  
- AI analysis of coach feedback  
- AI sport popularity analysis  
- AI-powered tournament and course insights  
- Analytics dashboards and statistical endpoints  

### 🧑‍🎓 Trainee Management
- View trainee registered courses  
- Analytics related to trainee participation  

### 📚 Course Management (CRUD + Analytics)
- Retrieve courses by date range  
- Retrieve upcoming courses  
- Retrieve top courses based on performance  
- Calculate total trainees per course  
- AI feedback analysis for courses  
- AI next-level course recommendations  

### 🏆 Tournament Management (CRUD + Analytics)
- Retrieve upcoming tournaments  
- Retrieve tournaments by date range  
- Calculate total trainees per tournament  
- AI-generated insights for tournaments  

### 🏅 Sport Management (CRUD + Analytics)
- Create, update, delete, and retrieve sports  
- AI-based sport popularity analysis  

### 🏢 Organizer Management (CRUD)
- Create, update, delete, and retrieve organizers  

### 🏋️ Gym Management (CRUD)
- Create, update, delete, and retrieve gyms  

### 📊 Coach Management
- Create, update, delete, and retrieve coaches  
- Coach performance analytics  
- Course reminder integration with Google Calendar  

### 🧩 System Design & Architecture
- Worked on Designing The ER Diagram (ERD)  
- Designed Use Case Diagram  
- Created and updated DTOs  
- API Integration
- AI Integration  
- System documentation and technical writing  

### 🎨 UI/UX Design
- Designed Figma interfaces for system workflows  
- [Figma UI Design](https://www.figma.com/design/JB0Gov46coABiU4SIsEtbm/Gym-landing-page-website--Community-)  

### 🧩 ER Diagram (ERD)
- [Mermaid live view](https://mermaid.live/view#pako:eNqtVttu4jAQ_...)  

### 🔄 Use Case Diagram
- [Google Drive Link](https://drive.google.com/file/d/1ZX58tYyVYizoSxi4GZqc3QLax3pZ9bxb/view)  

### 📘 API Documentation (Postman)
- [Postman Collection](https://documenter.getpostman.com/view/49815088/2sBXVbJZXe)  

---

## 🚀 Key Endpoints Implemented by Leena  

### 🧑‍🎓 Trainee & AI Coach
| Method | Endpoint | Description |
|--------|---------|------------|
| GET | /get/registerd/{traineeId} | Get trainee registered courses |
| GET | /get/totalTrainee/{id} | Total trainees per course |
| GET | /get/feedback/{coachId} | AI course feedback analysis |

### 📚 Courses
| Method | Endpoint | Description |
|--------|---------|------------|
| GET | /top | Get top courses |
| GET | /get/recommended/{traineeId}/{sportId} | AI recommended courses |
| GET | /get/dateRange/{sportId}/{startDate}/{endDate} | Courses by date range |
| GET | /get/upcoming | Upcoming courses |
| GET | /review-summary/{courseId} | AI course feedback analysis |
| GET | /get/totalTrainee/{id} | Total trainees per course |

### 🏆 Tournaments
| Method | Endpoint | Description |
|--------|---------|------------|
| GET | /get/upcoming | Upcoming tournaments |
| GET | /get/dateRange/{sportId}/{startDate}/{endDate} | Tournaments by date range |
| GET | /get/totalTrainee/{id} | Total trainees per tournament |

### 🏅 Sports
| Method | Endpoint | Description |
|--------|---------|------------|
| GET | /api/v1/sport/get | Get all sports |
| POST | /api/v1/sport/add | Add new sport |
| PUT | /api/v1/sport/update/{id} | Update sport |
| DELETE | /api/v1/sport/delete/{id} | Delete sport |
| GET | /api/v1/sport/analyze/sport/{sportId} | Analyze sport popularity |

### 🏢 Organizers
| Method | Endpoint | Description |
|--------|---------|------------|
| GET | /api/v1/organizer/get | Get all organizers |
| POST | /api/v1/organizer/add | Add organizer |
| PUT | /api/v1/organizer/update/{id} | Update organizer |
| DELETE | /api/v1/organizer/delete/{id} | Delete organizer |

### 🏋️ Gyms
| Method | Endpoint | Description |
|--------|---------|------------|
| GET | /api/v1/gym/get | Get all gyms |
| POST | /api/v1/gym/add | Add gym |
| PUT | /api/v1/gym/update/{id} | Update gym |
| DELETE | /api/v1/gym/delete/{id} | Delete gym |

### 👨‍🏫 Coach
| Method | Endpoint | Description |
|--------|---------|------------|
| GET | /dashboard/{coachId} | Coach dashboard |
| GET | /review-summary/{courseId}/{coachId} | Analyze coach feedback |
| GET | /avg-rating/{coachId} | Get average coach rating |
| GET | /total-trainee/{coachId} | Total trainees per coach |
| GET | /total-courses/{coachId} | Total courses per coach |
| GET | /get | Get All coachs |
| POST | /reminder/{courseId} | Add course reminder to Google Calendar |
| PUT | /update | Update coach details |
| DELETE | /delete | Delete coach |


### 📚 Registered Courses (CRUD)
| Method | Endpoint | Description |
|--------|---------|------------|
| GET | /get | Get all courses registered  |
| PUT | /update/{registrationId} | Update registration details |
| DELETE | /delete/{registrationId} | Delete a registration (Trainee only) |
---

### 🧠 Technologies Used
>>>>>>> bbd68c28887d5b6790354db914f43cc5ce949364
- Java  
- Spring Boot  
- RESTful APIs  
- JPA / Hibernate  
- MySQL  
<<<<<<< HEAD
- AI Prompt-based Analysis (Open Ai)
- Figma (UI/UX)
- junit
- Moyassar payment
=======
- AI Prompt-based Analysis  
- Figma (UI/UX)  

>>>>>>> bbd68c28887d5b6790354db914f43cc5ce949364
