main : run

compile : clean
	javac src/*.java -d out/
	
run : compile
	clear
	java -classpath out/ Main
	
clean : 
	rm -f out/*