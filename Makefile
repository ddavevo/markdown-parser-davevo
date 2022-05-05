MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

MarkdownParseTest.class: MarkdownParse.java MarkdownParse.class
	javac -cp .:libs/junit-4.12.jar:libs/hamcrest-core-1.3.jar MarkdownParseTest.java

Test: MarkdownParseTest.class
	java -cp .:libs/junit-4.12.jar:libs/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest