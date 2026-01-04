# Wessam (وسام)  

📌 **Project Description**  
Wessam (وسام) is an intelligent sports management and analytics platform connecting coaches, trainees, gyms, and organizers.  
The platform uses AI-powered analytics to enhance training quality and enable data-driven decision making.  

👩‍💻 **Contributor**  
Leena  


---

## 🧩 Individual Contributions (Leena)  

### 🤖 AI & Analytics
- AI personalized coaching recommendations for trainees   
- AI analysis of course feedback  
- AI analysis of coach feedback  
- AI sport popularity analysis    
- Analytics dashboards and statistical endpoints  

### 🧑‍🎓 Trainee Management
- View trainee registered courses  
- Analytics related to trainee participation  

### 📚 Course Management (Analytics)
- Retrieve courses by date range  
- Retrieve upcoming courses  
- Retrieve top courses based on performance  
- Calculate total trainees per course 
- AI feedback analysis for courses  
  

### 🏆 Tournament Management (CRUD + Analytics)
- Retrieve upcoming tournaments  
- Retrieve tournaments by date range  
- Calculate total trainees per tournament  
  

### 🏅 Sport Management (CRUD + Analytics)
- Create, update, delete, and retrieve sports  
- AI-based sport popularity analysis  

### 🏢 Organizer Management (CRUD)
-  update, delete, and retrieve organizers  

### 🏋️ Gym Management (CRUD)
- update, delete, and retrieve gyms  

### 📊 Coach Management(CRUD)
-  update, delete, and retrieve coaches  
- Coach performance analytics  
- Course reminder integration with Google Calendar  

### 🧩 System Design & Architecture
- Designed ER Diagram (ERD)  
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
| GET | /get/recommended/{traineeId}/{sportId} | recommended courses |
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
| PUT | /api/v1/organizer/update/{id} | Update organizer |
| DELETE | /api/v1/organizer/delete/{id} | Delete organizer |

### 🏋️ Gyms
| Method | Endpoint | Description |
|--------|---------|------------|
| GET | /api/v1/gym/get | Get all gyms |
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
| POST | /reminder/{courseId} | Add course reminder to Google Calendar |
| GET | /Get | Get All coach |
| PUT | /update | Update coach details |
| DELETE | /delete | Delete 



---

### 🧠 Technologies Used
- Java  
- Spring Boot  
- RESTful APIs  
- JPA / Hibernate  
- MySQL  
- AI Prompt-based Analysis  
- Figma (UI/UX)  

