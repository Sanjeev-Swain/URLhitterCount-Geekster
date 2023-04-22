# URLhitterCount-Geekster
Framework Used : Spring MVC Architechture Languages Used : Java and Springboot Database Used : HashMap

Data Flow : Model(URLHitterCount) - Consists of all entities as per requirements , constructors for the entities and all getters and setters Controller(URLHittingControl) - Consists of end points for getmapping url count where path variable of username has been passed which returns the username hitted by browser Service(URLHittingService) - Consists of all business logic required to implement the control layer end points , it consists of a hashma which stores the username and count of the number of times the url has been hitted in a key value pair , every time a user name is passed by browser a new object is created where url hitting is being incremented

Project Summary - This is a simple implementation of url htting  where user passes a name from browser where path variable implementation is shown . The key value pair of username and count is being passed which returns the number of time a particular username was hitted by a url call
