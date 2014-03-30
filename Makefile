compile:
	mkdir -p classes
	find zoo/ -name "*.java" | xargs javac -Xlint -d classes
	javac -cp "classes" -Xlint Main.java

run: compile
	java -cp ".:classes" Main

clean:
	rm -rf classes/ Main.class
