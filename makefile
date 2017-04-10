driver: 
	javac Employee.java Technician.java SeniorTechnician.java Pharmacist.java PharmacyManager.java Driver.java

clean: 
	rm -f *.class

run: 
	java Driver
