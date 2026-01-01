# 🏅 Wessam (وسام) – Smart Sports Management & Analytics Platform

## Overview
**Wessam** is an intelligent sports management and analytics platform that connects coaches, trainees, gyms, and tournament organizers. The platform enhances training effectiveness and enables data-driven decision-making using AI-powered analytics.

**Core Idea**: Empowering the sports community through smart management, personalized training, and actionable insights.

---

## Target Audience
- 🏋️ **Coaches** – Manage courses, track performance, and receive AI-driven feedback
- 🧑‍🎓 **Trainees** – Find courses, track progress, and get personalized recommendations
- 🏢 **Gyms** – Manage branches, coaches, and subscriptions
- 🏆 **Organizers** – Create and manage sports tournaments
- 👨‍💼 **Admins** – Oversee the entire platform and approve registrations

---

## Key Features

### 🏋️ For Coaches
- **Registration & Approval System**: Coaches register and await admin approval
- **Course Management**: Create, update, and delete courses
- **Performance Analytics**: Track total trainees, courses, and average ratings
- **AI Feedback Analysis**: Get insights from trainee feedback using AI
- **Branch Assignment**: Coaches are assigned to specific gym branches

### 🧑‍🎓 For Trainees
- **Course Discovery**: Browse courses by sport, coach, or level
- **AI-Powered Recommendations**: Get personalized course suggestions
- **Progress Tracking**: Monitor completed and ongoing courses
- **Next Level Suggestions**: System recommends courses for skill progression
- **AI Coach Advice**: Receive personalized training guidance
- **Certificate Generation**: Automated certificates upon course completion

### 🏢 For Gyms
- **Branch Management**: Create and manage multiple branch locations
- **Subscription System**: Monthly, quarterly, half-yearly, and yearly plans
- **Coach Activation**: Review and activate coach applications
- **Payment Integration**: Secure payment processing via Moyasar
- **Incident Reporting**: Report and track gym-related incidents
- **Status Management**: Active/inactive gym states with admin oversight

### 🏆 For Tournament Organizers
- **Tournament Creation**: Set up tournaments with rewards and schedules
- **Registration Management**: Track participant registrations
- **Social Media Integration**: AI-generated social media posts for tournaments
- **Sport-Specific Events**: Organize tournaments for different sports

### 🤖 AI-Powered Features
- **Course Recommendations**: Smart suggestions based on trainee level and preferences
- **Feedback Analysis**: Sentiment and insight extraction from reviews
- **Sport Popularity Analytics**: Data-driven insights on trending sports
- **Nutrition Tips**: AI-generated sport-specific nutrition advice
- **Home Workouts**: Personalized home training routines
- **Social Media Content**: Auto-generated tournament promotion posts
- **Coach Performance Insights**: Comprehensive feedback analysis for coaches

---

## System Roles

### 👨‍💼 Admin
- Approve/reject coach registrations
- Activate/deactivate gyms
- View all system data (coaches, trainees, courses, tournaments)
- Manage sports and organizers
- Oversee platform operations

### 🏢 Gym Owner
- Register gym with business certificate
- Create and manage branches
- Subscribe to platform (monthly/quarterly/yearly)
- Activate coaches for branches
- Report incidents
- Update gym information

### 🏋️ Coach
- Register and await approval
- Create and manage courses
- Assigned to a branch and specializes in a sport
- Receive ratings and reviews
- Mark course completion status
- Access performance dashboard
- Generate certificates for trainees

### 🧑‍🎓 Trainee
- Register and create profile
- Browse and enroll in courses
- Make payments (full or installment)
- Submit reviews and ratings
- Track course progress
- Receive AI-powered recommendations
- Download course certificates
- Participate in tournaments

### 🏆 Organizer
- Register with business certificate
- Create and manage tournaments
- Set tournament rewards and schedules
- Track participant registrations
- Generate promotional content

---

## Core Features Breakdown

### 📚 Course Management System
- Courses have entry levels (Beginner, Intermediate, Advanced)
- Pricing and scheduling
- Coach assignment
- Enrollment tracking (PENDING, ACTIVE, COMPLETED, DROPPED)
- Maximum capacity management
- Date range filtering

### 💳 Payment System
- **Payment Gateway**: Moyasar integration
- **Payment Types**:
  - Full course payment
  - Installment plans (for trainees)
  - Gym subscriptions (monthly, quarterly, half-yearly, yearly)
- **Payment Status**: PENDING, COMPLETED, FAILED
- **Payment Callbacks**: Automatic status updates
- **Refund Support**: Trainee can cancel pending registrations

### 🎓 Certificate Generation
- Automated certificate creation upon course completion
- Email delivery via n8n workflow integration
- Professional certificate templates
- Trainee and course information included

### ⭐ Review & Rating System
- Trainees review courses (1-5 stars)
- AI-powered feedback analysis
- Coach performance tracking
- Review management (add, update, delete)

### 🏆 Tournament System
- Sport-specific tournaments
- Registration tracking
- Champion designation
- Reward system
- Date-based filtering
- AI-generated promotional content

### 📊 Analytics & Dashboards
- **Coach Dashboard**:
  - Total trainees
  - Total courses
  - Average rating
  - AI feedback insights
  
- **Course Analytics**:
  - Top-rated courses
  - Total enrollments
  - Completion rates
  - Feedback analysis

- **Sport Analytics**:
  - Popularity trends
  - AI-powered insights
  - Participation statistics

### 🔔 Notification System
- Email notifications for:
  - Certificate generation
  - Course enrollment confirmation
  - Payment receipts
  - Zoom meeting URLs
- Incident reporting alerts

### 🎥 Online Meetings
- Zoom integration via n8n
- Automatic meeting URL generation
- Course-based virtual sessions

---

## Database Design

### Core Entities
- **User** – Base authentication table
- **Gym** – Gym businesses with certificates and subscriptions
- **Branch** – Physical gym locations
- **Coach** – Trainers with specializations
- **Trainee** – Athletes/students
- **Organizer** – Tournament organizers
- **Sport** – Available sports
- **Course** – Training courses
- **CourseRegistration** – Enrollment records
- **CourseReview** – Course ratings and feedback
- **TraineeFeedback** – Trainee performance feedback
- **Tournament** – Competitive events
- **RegisteredTournament** – Tournament participants

### Key Relationships
- Gyms have multiple branches
- Coaches belong to branches and specialize in sports
- Courses are taught by coaches
- Trainees enroll in courses through registrations
- Tournaments are organized by organizers for specific sports
- Reviews link trainees to courses

---

## Detailed API Endpoints

### 🏋️ Coach Management (`/api/v1/coach`)

| Method | Endpoint | Description | Auth | Author |
|--------|----------|-------------|------|--------|
| GET | `/get` | Get all coaches | Admin | Leena |
| POST | `/register` | Coach registration | Any | Mohannad, Abdulrahman |
| PUT | `/activate/{coachId}` | Activate coach | Gym | Mohannad |
| PUT | `/update` | Update coach profile | Coach | Leena |
| DELETE | `/delete` | Delete coach | Coach | Leena |
| GET | `/available/{date}` | Get available coaches by date | Any | - |

---

### 🏢 Branch Management (`/api/v1/branches`)

| Method | Endpoint | Description | Auth | Author |
|--------|----------|-------------|------|--------|
| GET | `/get-all` | Get all branches | Admin | Mohannad |
| POST | `/add` | Add new branch | Gym | Mohannad |
| PUT | `/update/{branchId}` | Update branch | Gym | Mohannad |
| DELETE | `/delete/{branchId}` | Delete branch | Gym | Mohannad |
| GET | `/get-gym` | Get branches by gym | Gym | Mohannad |

---

### 🏢 Gym Management (`/api/v1/gym`)

| Method | Endpoint | Description | Auth | Author |
|--------|----------|-------------|------|--------|
| POST | `/register` | Register new gym | Any | Mohannad |
| PUT | `/activate/{gymId}` | Activate gym | Admin | Mohannad |
| PUT | `/subscribe/month` | Monthly subscription (50 SAR) | Gym | Mohannad |
| PUT | `/subscribe/quarter` | Quarterly subscription (120 SAR) | Gym | Mohannad |
| PUT | `/subscribe/half` | Half-yearly subscription (220 SAR) | Gym | Mohannad |
| PUT | `/subscribe/year` | Yearly subscription (400 SAR) | Gym | Mohannad |
| PUT | `/complete-payment/{months}` | Complete payment callback | System | Mohannad |
| PUT | `/update` | Update gym profile | Gym | Leena |
| DELETE | `/delete` | Delete gym | Gym | Leena |
| POST | `/report` | Report incident | Gym | Abdulrahman |
| GET | `/get-all` | Get all gyms | Admin | Leena |
| GET | `/get-inactive` | Get inactive gyms | Admin | Abdulrahman |
| GET | `/get-active` | Get active gyms | Any | Abdulrahman |
| PUT | `/deactivate/{gymId}` | Deactivate gym | Admin | Abdulrahman |

---

### 📚 Course Management (`/api/v1/course`)

| Method | Endpoint | Description | Auth | Author |
|--------|----------|-------------|------|--------|
| GET | `/get` | Get all courses | Any | Mohannad |
| POST | `/add` | Add new course | Coach | Mohannad |
| PUT | `/update/{courseId}` | Update course | Coach | Mohannad |
| DELETE | `/delete/{courseId}` | Delete course | Coach | Mohannad |
| GET | `/next-level-courses` | Get next level courses | Trainee | Abdulrahman, Mohannad |
| POST | `/certificates/{courseRegId}` | Generate certificate | Trainee | Abdulrahman |

**Additional Endpoints** (From README):
- `GET /get/top/{courseId}` – Get top courses
- `GET /get/recommended/{traineeId}/{sportId}` – AI recommended courses
- `GET /get/dateRange/{sportId}/{startDate}/{endDate}` – Courses by date range
- `GET /get/upcoming` – Upcoming courses
- `GET /get/totalTrainee/{id}` – Total trainees per course
- `GET /get/feedback/{courseId}` – AI course feedback analysis

---

### 🎓 Course Registration (`/api/v1/course-registration`)

| Method | Endpoint | Description | Auth | Author |
|--------|----------|-------------|------|--------|
| GET | `/get-by-course/{courseId}` | Get registrations of course | Coach | Mohannad |
| POST | `/register/{courseId}` | Register in course | Trainee | Mohannad |
| DELETE | `/delete/{registrationId}` | Delete registration | Trainee | Mohannad |
| PUT | `/complete/{registrationId}` | Mark as completed | Coach | Abdulrahman |
| PUT | `/drop/{registrationId}` | Mark as dropped | Coach | Abdulrahman |
| GET | `/completed` | Get completed registrations | Admin | Mohannad |
| GET | `/dropped` | Get dropped registrations | Admin | Abdulrahman |
| PUT | `/pay-pending/{registrationId}` | Pay pending registration | Trainee | Mohannad |
| PUT | `/complete-payment` | Complete payment callback | System | Mohannad |

---

### 🧑‍🎓 Trainee Management (`/api/v1/trainee`)

| Method | Endpoint | Description | Auth | Author |
|--------|----------|-------------|------|--------|
| GET | `/get` | Get all trainees | Admin | Mohannad |
| POST | `/register` | Trainee registration | Any | Mohannad |
| PUT | `/update` | Update trainee profile | Trainee | Mohannad |
| DELETE | `/delete` | Delete trainee | Trainee | Abdulrahman |

---

### 🏆 Tournament Management (`/api/v1/tournament`)

| Method | Endpoint | Description | Auth | Author |
|--------|----------|-------------|------|--------|
| GET | `/get` | Get all tournaments | Any | Team |
| POST | `/add/{sportId}` | Add tournament | Organizer | Abdulrahman |
| PUT | `/update/{tournamentId}/{sportId}` | Update tournament | Organizer | Abdulrahman |
| DELETE | `/delete/{tournamentId}` | Delete tournament | Organizer | Abdulrahman |
| GET | `/generate-post/{tournamentId}` | Generate AI social post | Any | Abdulrahman |

---

### 🏆 Tournament Registration (`/api/v1/registeredTournament`)

| Method | Endpoint | Description | Auth | Author |
|--------|----------|-------------|------|--------|
| GET | `/get` | Get all registered tournaments | Admin | Team |
| POST | `/add/{tournamentId}` | Register for tournament | Trainee | Team |
| PUT | `/update/{oldTournamentId}/{newTournamentId}` | Update registration | Trainee | Team |
| DELETE | `/delete/{id}` | Cancel registration | Trainee | Team |

---

### 🏅 Sport Management (`/api/v1/sport`)

| Method | Endpoint | Description | Auth | Author |
|--------|----------|-------------|------|--------|
| GET | `/get` | Get all sports | Any | Leena |
| POST | `/add` | Add new sport | Admin | Leena |
| PUT | `/update/{id}` | Update sport | Admin | Leena |
| DELETE | `/delete/{id}` | Delete sport | Admin | Leena |
| GET | `/nutrition-tip/{sportId}` | Get AI nutrition tip | Any | Abdulrahman |
| GET | `/home-workout/{sportId}` | Get AI home workout | Any | Abdulrahman |

---

### 🏢 Organizer Management (`/api/v1/organizer`)

| Method | Endpoint | Description | Auth | Author |
|--------|----------|-------------|------|--------|
| GET | `/get` | Get all organizers | Admin | Leena |
| POST | `/add` | Add new organizer | Any | Leena |
| PUT | `/update/{id}` | Update organizer | Organizer | Leena |
| DELETE | `/delete/{id}` | Delete organizer | Admin | Leena |

---

### 💬 AI Chat Assistant (`/api/v1/chat`)

| Method | Endpoint | Description | Auth | Author |
|--------|----------|-------------|------|--------|
| POST | `/ask` | Ask AI assistant | Any | AI Team |

---

## Technology Stack

### Backend
- **Framework**: Spring Boot
- **Language**: Java
- **ORM**: Hibernate / JPA
- **Database**: MySQL
- **Validation**: Jakarta Validation
- **Security**: Spring Security

### Integrations
- **Payment Gateway**: Moyasar (Saudi payment processor)
- **Automation**: n8n workflows (certificates, Zoom URLs)
- **Video Conferencing**: Zoom API
- **Email**: Email integration for notifications
- **AI**: OpenAI / Custom AI models for recommendations and analytics

### Development Tools
- **Build Tool**: Maven
- **API Testing**: Postman
- **Unit Testing**: JUnit
- **Cloud Deployment**: AWS

### Design & Documentation
- **UI/UX Design**: Figma
- **Database Design**: ERD (Mermaid)
- **Use Cases**: Use Case Diagrams
- **API Documentation**: Postman Collection

---

## Team Contributions

### 👩‍💻 Leena
| Contribution | Description |
|--------------|-------------|
| AI Features | Implementation of AI-powered analytics and recommendations |
| Analytics & Dashboards | Performance tracking, leaderboards, and insights |
| ER Diagram | Database design and entity relationships |
| Figma Interfaces | UI/UX design and mockups |
| Use Case Diagram | System use case documentation |
| Documentation | Comprehensive system documentation |

### 👨‍💻 Abdulrahman
| Contribution | Description |
|--------------|-------------|
| N8N Workflows | Certificate generation and Zoom URL automation |
| AI Features | AI integration and smart features |
| JUnit Testing | Unit test creation and coverage |
| Testing | Postman API testing |
| ERD Diagram | Database design collaboration |
| Figma Interfaces | UI/UX design collaboration |
| Email Integration | Notification system implementation |

### 👨‍💻 Mohannad
| Contribution | Description |
|--------------|-------------|
| AWS Deployment | Server setup and production deployment |
| Moyasar Integration | Payment gateway implementation |
| ER Diagram | Database design collaboration |
| Testing | Comprehensive Postman testing |
| Documentation | System documentation |
| DTO Fixes | Data transfer object refinement |
| AI Features | AI feature collaboration |

---

## System Diagrams & Resources

| Resource | Link |
|----------|------|
| 🎨 Figma UI Design | [View Design]([Figma Link](https://www.figma.com/design/JB0Gov46coABiU4SIsEtbm/Gym-landing-page-website--Community-?node-id=0-1&p=f&t=ejlstXmr7kPECSjZ-0)) |
| 🔄 Use Case Diagram | [View Diagram]([Google Drive Link](https://drive.google.com/file/d/1ZX58tYyVYizoSxi4GZqc3QLax3pZ9bxb/view)) |
| 📚 API Documentation | [Postman Collection]([postman link](https://documenter.getpostman.com/view/49815088/2sBXVbJZXe)) |

---

## Key Business Logic & Workflows

### 💳 Payment Flow (Moyasar Integration)
1. **Initiation**: Trainee/Gym initiates payment (course registration or gym subscription)
2. **Payment Request**: System sends payment details to Moyasar API
   - Card details (name, number, CVC, month, year)
   - Amount (converted to smallest currency unit: SAR * 100)
   - Callback URL for payment confirmation
3. **Payment Processing**: Moyasar processes payment and redirects to callback URL
4. **Verification**: System calls `getPayment(paymentId)` to verify payment status
5. **Status Update**: 
   - For courses: Registration status changes from "Pending" → "Registered"
   - For gyms: Gym status changes to "Active" and subscription end date is set
6. **Confirmation**: User is notified of successful payment

### 🏢 Gym Subscription Flow
1. **Registration**: Gym owner registers with:
   - Username, password
   - Gym name, description
   - Business certificate ID
   - Initial status: "InActive"
2. **Admin Approval**: Admin reviews and changes status to "Pending"
3. **Subscription Selection**: Gym owner chooses plan:
   - **Monthly**: 50 SAR (1 month)
   - **Quarterly**: 120 SAR (3 months)
   - **Half-Yearly**: 220 SAR (6 months)
   - **Yearly**: 400 SAR (12 months)
4. **Payment Processing**: Payment processed via Moyasar
5. **Activation**: 
   - Subscription end date set/extended
   - Status changed to "Active"
   - Gym can now add branches and activate coaches

### 🏋️ Coach Registration & Activation Flow
1. **Coach Registration**:
   - Coach submits registration with personal details
   - Selects sport specialization and target branch
   - Initial status: "InActive"
   - System creates user account (role: COACH)
2. **Interview Scheduling**:
   - System triggers n8n workflow to create Zoom meeting
   - Email sent to coach with interview details and Zoom link
   - Email subject: "مقابلة شخصية لشاغر مدرب في نادي [Gym Name]"
3. **Gym Review**: Gym owner reviews coach application
4. **Activation**: 
   - Gym owner activates coach (only if coach's branch belongs to their gym)
   - Coach status changes to "Active"
   - Coach can now create courses

### 📚 Course Registration Flow
1. **Course Discovery**: Trainee browses available courses
2. **Level Check**: System verifies trainee's level matches course entry level
3. **Registration Creation**: 
   - CourseRegistration created with status "Pending"
   - Registration ID generated
4. **Payment Processing**: 
   - Trainee provides card details
   - Payment sent to Moyasar with registration ID as description
5. **Payment Confirmation**:
   - System receives callback from Moyasar
   - Verifies payment status
   - Updates registration status to "Registered"
6. **Course Access**: Trainee gains access to course content

### 🎓 Certificate Generation Flow
1. **Completion Check**:
   - Course end date must be in the past
   - Registration status must be "COMPLETE"
   - Only the registered trainee can request certificate
2. **Data Preparation**:
   - Trainee name, email
   - Course name, completion date
3. **n8n Workflow Trigger**:
   - System calls n8n webhook with certificate data
   - n8n generates PDF certificate
   - n8n sends email with certificate attachment
4. **Confirmation**: System receives success response from n8n

### 🎯 Course Completion Lifecycle
1. **Active**: Registration status is "Registered"
2. **Coach Marks Complete**: 
   - Coach can mark as "COMPLETE" only after end date
   - Validates coach ownership of the course
3. **Coach Marks Dropped**:
   - Coach can mark as "DROPPED" at any time
   - Used for trainees who quit mid-course
4. **Certificate Eligible**: Only "COMPLETE" status can generate certificates

### 🏆 Tournament Registration Flow
1. **Browse Tournaments**: Trainee views available tournaments
2. **Validation**:
   - Tournament must exist
   - Tournament start date must be in the future
   - Trainee must exist
3. **Registration**: RegisteredTournament record created
4. **Update Registration**: Trainee can switch to different tournament (if new tournament is also future-dated)
5. **Cancellation**: Trainee can cancel registration

### 📧 Incident Reporting System (AI-Powered)
1. **Report Submission**: Trainee submits incident report message
2. **AI Analysis**: 
   - System sends report to OpenAI for analysis
   - AI classifies priority: LOW, MEDIUM, HIGH
   - AI provides recommended action
3. **Email Generation**:
   - Subject line includes priority level
   - Email body includes: reporter info, original report, AI analysis
4. **Admin Notification**: Email sent to admin for action

### 🤖 AI-Powered Features

#### Nutrition Tips
- Input: Sport ID
- Process: AI generates sport-specific healthy snack recommendation
- Output: Under 20 words, in Arabic

#### Home Workouts
- Input: Sport ID
- Process: AI creates 5-minute home workout without equipment
- Output: In Arabic

#### Social Media Post Generation
- Input: Tournament ID
- Process: AI writes Instagram caption with hashtags
- Output: In Arabic, ready to post

#### Course Recommendations (Advanced)
- Based on trainee's current level
- Suggests "next level" courses:
  - Beginner → Intermediate
  - Intermediate → Advanced
- Filters courses starting after current date

### 🔒 Authorization Logic

The system uses logical role-based authorization (no technical auth middleware):

**Ownership Validation Examples**:
```
Coach updating course:
- Course → Coach → Branch → Gym ID must match authenticated Gym ID

Trainee deleting registration:
- Registration → Trainee ID must match authenticated Trainee ID

Gym deleting branch:
- Branch → Gym ID must match authenticated Gym ID
```

**Status-Based Access**:
- Inactive coaches cannot create courses
- Inactive organizers cannot create tournaments
- Pending gym subscriptions block course creation

### 📊 Data Validation Rules

**Course Registration**:
- Trainee level must match course entry level
- Course start date must be in future or present

**Certificate Generation**:
- Course must be ended (end date < today)
- Registration status must be "COMPLETE"
- Only enrolled trainee can request

**Tournament Registration**:
- Cannot register for past tournaments
- Cannot update to past tournament

**Coach Activation**:
- Only gym owner can activate coaches in their branches
- Coach must not already be active

**Feedback Dating**:
- Trainee feedback date must be within course start/end dates

---

## Future Enhancements
- Mobile application (iOS/Android)
- Advanced AI workout planning
- Live streaming for online courses
- Wearable device integration
- Social features and community building
- Multi-language support
- Advanced analytics dashboards

---

**Built with ❤️ by Team Wessam**
