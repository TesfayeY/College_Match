### 1. User Stories (Required and Optional)

#### Required Must-have Stories

- User can login using a Google account.
- User can search for a college.
- User can like/save a college.
- User can view academic rigor on a scale of 1 to 10.
- User can see the ranks of colleges in top 10, top 20, etc.
**- User can fill out a survey of college preferences during registration.**
- Find links to different colleges’ websites.

#### Optional Nice-to-have Stories

- Find links to different colleges’ websites.
- User can see photos of college campuses.
- User can add a college (if it does not exist).
- User can follow a specific college for news or any updates (using a News API).

### 2. Screen Archetypes

#### Login Screen

- User can login with their Google account.

#### Stream

- User can view a feed of photos for a specific college.
- User can press the like button under a college name to like it.

#### Creation

- User can make a comment.

#### Search

- Users can search for a college using a specific keyword or phrase.

### 3. Navigation

#### Tab Navigation (Tab to Screen)

- **Home tab**
- **Search tab**
- **Favourites & Likes tab**
- **News tab**
- **Profile tab**

#### Flow Navigation (Screen to Screen)

- **Home view**
  - **Details view**
- **Search view**
  - **Details view**
- **Favourites and likes**
  - **Details view**
- **News view**
  - **News details view**
- **Profile view**
  - **Settings**
  - **About**

#### Project structure
- *├── MainActivity.kt*
- *├── NetworkThread.kt*
- *├── CollegeAdapter.kt*
- *├── HomeFragment.kt*
- *├── QuestionsActivity.kt*
- *├── AppPreferences.kt*
- *└── models*
 - *   └── Models.kt*


