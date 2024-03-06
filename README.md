# CHATROOM API PROJECT - 'Big Blether' 👩🏽‍💻💬👨🏾‍💻

![Alt text](https://lovely32.com/cdn/shop/products/image_9ff117ab-9e03-4b00-b486-59cb602b6001_1200x1200.jpg?v=1669466173 "Big Blether Logo")

## Project Aims:
To create a functioning chatroom API onto to which a front-end can be seamlessly implemented. The primary intention was to facilitate chatrooms containing multiple users, rather than direct messages between two users *i.e. more akin to Reddit than Facebook Messenger.* In this project, we wanted to provide all users with the capability of creating a chatroom, whilst ensuring a space was reserved for more mature topics and content, hence we facilitated implementation of age restriction into indivudal chatrooms, where required. 

### Dependencies Used:
The project was built with Maven, using Java and Spring Boot Version 3.2.3. 
We also added the following dependencies:
- **Spring Web**
- **Spring Boot DevTools**
- **PostgreSQL Driver**
- **Spring Data JPA**


### Instructions on how to use Big Blether:

Limited Message property content (String) length to 200 characters - to enable short and punchy messages *e.g. as used in X (formerly Twitter), Instagram, etc.* 

### Relevant Diagrams:
- Class Diagram of MVP: INSERT GITHUB LINK
- Class Diagram of MVP + Extensions *(in blue)*: INSERT GITHUB LINK
- Entity Relationship Diagram: INSERT GITHUB LINK

### Available Routes:
*For Chatroom:*
- **POST a chatroom:** localhost:8080/chatrooms 
- **GET a chatroom:** localhost:8080/chatrooms
- **GET a chatroom by id:*** localhost:8080/chatrooms/{id}
- **GET a list of chatrooms ordered by how recently they were used:** localhost:8080/chatrooms/recent
- **GET the most active chatroom *(defined as most messages sent within it)***: localhost:8080/chatrooms/mostActive
- **PATCH a chatroom by id:** localhost:8080/chatrooms/{id}
- **DELETE a chatroom by id:** localhost:8080/chatrooms/{id}
<p>
<br>*For User:*</p>
- **POST a user:** localhost:8080/users
- **GET a list of all users:** localhost:8080/users
- **GET an individual user by id:** localhost:8080/users/{id}
- **PATCH a user by id:** localhost:8080/users/{id}
- **DELETE a user by id:** localhost:8080/users/{id}
<p>
<br>*For Message:*</p>
- **POST a message:** localhost:8080/messages
- **GET a list of all messages:** localhost:8080/messages
- **GET a message by it's id:** localhost:8080/messages/{id}
- **GET a message that contains a specific text:** localhost:8080/messages/content/{text}
- **GET a list of messages send by a specific user:** localhost:8080/messages/user/{id}
- **GET a list of messages posted in a specific chatroom:** localhost:8080/messages/chatroom/{id}
- **PATCH a specific message using it's id:** localhost:8080/messages/{id}
- **DELETE a specific message using it's id:** localhost:8080/messages/{id}


### MVP Functionality:
- Create a user. 
- Update user infomation. 
- Delete a user. 
- Allow a user to post a message in a chatroom.
- Allow users to read messages sent by other uses in a chatroom. 

### Extension Funtionality:
- Added **Timestamp to messages.**
- Created a **derived query to find a specifc chatroom by its id.**
- Created a **derived query to find a specific user by their id.**
- Created a **derived query to find all messages that contain a specific text.**
- Created a **custom query to display chatrooms by how recently messages were sent within them, ordered from most to least recent.**
- Created a **native query to find the most active chatroom (i.e. the chatroom with the most messages sent overall).**
- Added **age restriction functionality** by creating and implementing a method to check a user's age and compare it to the age limit of the chatroom, prior to them being able to post a message (and therefore to see a chatroom's content) in a chatroom.
- **????Reactions**