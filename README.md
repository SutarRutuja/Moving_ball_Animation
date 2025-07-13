<h1> Moving Ball Animation Using Java AWT</h1><br>
<h3>🎯 Description</h3> <br>
This Java application demonstrates a simple 2D ball animation using the Abstract Window Toolkit (AWT). A ball moves within the boundaries of a window and bounces off the edges when it hits them. The animation is created using multithreading and basic AWT components.

<br> 
<h3>📂 Features</h3><br>
Smooth ball animation using a thread.

Collision detection with window boundaries.

Ball bounces off all sides.

Uses Java AWT Frame, Graphics, and event listeners.

Simple and beginner-friendly example of GUI + multithreading.

<br> 
<h3>🚀 How It Works</h3><br>
The Myframe class extends Frame and implements Runnable.

A separate thread continuously updates the (x, y) position of the ball.

On every update, it checks if the ball has reached any of the window’s boundaries.

If so, it reverses the direction (by changing the sign of tx or ty).

The paint() method is overridden to draw the ball at the current location.

The repaint() method refreshes the frame, creating the animation effect.

<br> <h3>
💻 Requirements</h3><br>
Java Development Kit (JDK) 8 or above

Any text editor or IDE (like VS Code, IntelliJ, Eclipse)
<br> 
<h3>🔧 How to Run</h3><br>
1. Save the code in a file named Main.java.

2. Open terminal and compile:
 javac Main.java
3.Run the program:
 java Main
A window will open showing a blue ball moving and bouncing within the window.
<br>
<h3>🧠 Key Concepts Used</h3><br>
AWT Graphics API

Multithreading with Runnable

Repainting with repaint()

Event Handling (WindowListener)
<br> 
<h3>🖼️ Demo</h3>
https://drive.google.com/drive/folders/1Qn4v8drbxYEJUqPucamBXWsW-LdLyWX4?usp=drive_link

<br> 
<h3>
📚 Further Improvements</h3>
Add keyboard controls to move the ball.

Add multiple balls or random directions.

Use DoubleBuffering for smoother animations.

Add sound effects or trail effects.
