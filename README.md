# Test-DSS

How to run :

1). Install IntelliJ
2). Download File this project
3). If its not done yet, please install postgres v.11
3). Open PG Admin (or any Database Administrator for Postgre)
4). Open PG Admin and create new connection for postgre with the credential below :
    a. Hostname : simple-project.postgres.database.azure.com
    b. database name : test-dss
    c. username : luviana7
    d. password : Saykoji1313

    look at this image.
    ![image](https://github.com/zenrole/Test-DSS/assets/44823181/c6b110c8-d2cc-4bcc-8b13-e42a732eec92)

    e. Set the parameter to be :
        SSL_Mode : Require
        Connection Timeout 20
    look at this image.
    ![image](https://github.com/zenrole/Test-DSS/assets/44823181/5f665c6f-b9ea-49ef-bc5b-a5af32e0afd3)

    Then save the connection and connect to the database.

5. Open the Spring project, open the resource folder inside src folder and configure "Application Propertis" file to be like the example below:
   ![image](https://github.com/zenrole/Test-DSS/assets/44823181/e9f4f58e-063f-4f51-846e-8538977c39d3)

6. Run the project.

Endpoint :

localhost:8080/karyawan | GET METHOD | Get all karyawan
localhost:8080/karyawan/{id} | GET METHOD | Get karyawan based on ID
localhost:8080/karyawan | POST METHOD | Insert new karyawan
locallhost:8080/karyawan/{id} | DELETE METHOD | Delete karyawan based on ID
