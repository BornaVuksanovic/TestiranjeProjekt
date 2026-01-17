* Projekt Automatsko testiranje Web aplikacije (REST API)

1. Prije izrade projekta instalirao sam potrebne alate:
     - Java JDK
     - TestNG
     - IntelliJ
     - Maven
     - JSON Server
  
2. Kao bazu podataka uzeo sam bazu iz jednog od mojih projekata.
   U bazi se nalaze knjige iz mojeg projekta BookWarm.
   Pomoću MongoDB, baze mog projekta, exportao sam tu bazu kao lokalni JSON fajl.
   CMD naredba za export:
   PS C:\Users\bocov\AppData\Roaming\npm> & "C:\Program Files\MongoDB\Tools\100\bin\mongoexport.exe"
   --uri "mongodb+srv://bocovuksanovic3_db_user:je8OrJaJzfAHoOFi@cluster0.behwzls.mongodb.net/books_db?appName=Cluster0"
   --collection books
   --out "C:\Users\bocov\db.json"
   --jsonArray

   Kao rute koristio sam rute iz moje aplikacije, ali prilagođene za testiranje.

3. Pokrenio sam JSON poslužitelj s naredbom:
   PS C:\Users\bocov\AppData\Roaming\npm> json-server --port 700 --routes routes.json --watch db.json
   <img width="822" height="869" alt="image" src="https://github.com/user-attachments/assets/55dfaedb-192c-4d29-baa7-4a7017e1e476" />

4. Pokrenio sam IntelliJ IDEA i izradio Maven projekt koristeći Java programski jezik.

5.  U Pom.xml datoteku dodao sam Maven ovisnosti.

6.  Kreirao sam foldere Java i Tests te u njih dodao 5 testnih klasa:
         1. Test - GET - dohvati recenziju knjige
         2. Test - POST - kreiraj
         3. Test - PUT - izmjeni
         4. Test - PATCH - izmjeni
         5. Test - DELETE -obriši

7. Stvorio sam testing.xml datoteku unutar projektne mape i dodao testove i nazive klasa.
   Desnim klikom miša na tu datoteku pokretao sam testove pritiskom na "Run".
   <img width="959" height="391" alt="image" src="https://github.com/user-attachments/assets/4268b1f3-c4b8-4ea7-9e44-007f87cc8c36" />

8. Pokretao sam testove iz komandne linije unutar projektne mape s naredbom:
   PS C:\Users\bocov\IdeaProjects\Project> C:\Users\bocov\apache-maven-3.9.12-bin\apache-maven-3.9.12\bin\mvn test

   Nakon toga dobio sam izvješća o izvršenim testovima (index.html).
   <img width="1124" height="540" alt="image" src="https://github.com/user-attachments/assets/20a96f2f-8809-431b-877b-63cfae08216b" />

   

   
   
