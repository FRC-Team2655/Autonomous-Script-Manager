<html>
	<body>
		<h1>About:</h1>
		<p>This is an Autonomous script manager built in java to allow anyone to create autonomous routines for a robot. The LabVIEW code for the robot side is here:</p>
		<a href="https://github.com/FRC-Team2655/Flying-Platypi-2016-Robot-Code">https://github.com/FRC-Team2655/Flying-Platypi-2016-Robot-Code</a>
		<p>The dashboard project is here:</p>
		<a href="https://github.com/FRC-Team2655/Flying-Platypi-2016-Dashboard-Code">https://github.com/FRC-Team2655/Flying-Platypi-2016-Dashboard-Code</a>
		<h1>Running:</h1>
		<h3>Download and run from zip file(Easy Recommended):</h3>
		<a href="https://drive.google.com/open?id=0B0zdjaI9neLbeFZKa29id1ZGNVU">Built zip and exe (may not be newest)</a>
		<p>The zip has a JRE and bat script to run the JAR on windows (as the FRC Driver station software is windows only). You can run the jar on a Linux(with Java installed) or OSX system (open a terminal in the directory of the extracted zip) and type <code>
		<pre>java -jar ./Manager.jar</pre></code>In windows extract the zip and double click the start.bat file. The manager will run with the JRE with it comes with.</p>
		<h3>In Eclipse(Intermediate):</h2>
		<p>The repository is an eclipse project. To open it in eclipse <pre>
1.)Clone the Repository
2.)Open Eclipse
3.)File>Import>General>Existing Projects into Workspace
4.)Open gui.Manager.java
5.)Press the run button</pre></p>
		<h3>Compile and run(Advanced: JDK needed):</h3>
		<p>This is mainly if you want to run the program without eclipse:</h3>
		<pre>1.)Clone the Repository and open that directory in a file explorer then go to the src directory
2.)Open a command window or terminal emulator in that directory
3.)Type the following:

javac ./gui/*
java gui.Manager

NOTE: Only the second line is needed pulled you have just pulled from the repository.</pre>