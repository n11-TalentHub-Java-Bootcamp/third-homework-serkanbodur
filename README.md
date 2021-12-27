# third-homework n11 TalentHub Java Bootcamp


### Project Description

This project is a project using Spring and MongoDB that can do basic CRUD operations such as insert,delete,find

### Project Structure

- Entity
- DTO
- DAO
- Service
- Controller
- Exceptions


### Project End Points

[User Paths](third-homework/src/main/java/com/example/thirdhomework/controller/UserController.java)

| Request Method | Route           | Request Body                                                                                                                  | Description                         |
|----------------|-----------------|-------------------------------------------------------------------------------------------------------------------------------|-------------------------------------|
|       GET      | /api/users/     | {  }                                                                                                                          | Get all users                       |
|       GET      | /api/users/{id} | {  }                                                                                                                          | Get a User using id                 |
|      POST      | /api/users/     | {  "name" : "test_user", "surname" : "test_user_sur", "email" : "test@mail.com" , "phone" : "2233" , "userName" : "tested"  } | Save a User                         |
|     DELETE     | /api/users/     | {  }                                                                                                                          | Delete a User using id as parameter |


[Comment Paths](third-homework/src/main/java/com/example/thirdhomework/controller/ProductCommentController.java )

| Request Method | Route              | Request Body                                                                                        | Description                            |
|----------------|--------------------|-----------------------------------------------------------------------------------------------------|----------------------------------------|
|       GET      | /api/comments/     | {  }                                                                                                | Get all comments                       |
|       GET      | /api/comments/{id} | {  }                                                                                                | Get a Comment using id                 |
|      POST      | /api/comments/     | {  "comment" : "test_comment" , "commentDate" : "2021-10-10" , "productId" : "1" , "userId" : "2" } | Save a Comment                         |
|     DELETE     | /api/comments/{id} | {  }                                                                                                | Delete a Comment using id as parameter |
