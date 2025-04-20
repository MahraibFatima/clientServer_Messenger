# Simple Client-Server Chat Application

This project demonstrates a basic client-server communication model using Java socket programming. The client sends a message to the server, which responds with an acknowledgment.

## Components

1. **Client (`clientChat.java`)**: Sends a message to the server and displays the response.
2. **Server (`serverChat.java`)**: Receives the client’s message and responds.

---

## Features

- **Bidirectional Communication**: Client sends a message; server acknowledges it.
- **Socket Programming**: Uses `Socket` and `ServerSocket` classes for communication.
- **Buffered I/O**: Efficient data transfer using `BufferedReader` and `PrintWriter`.

---

## How to Run

### Prerequisites
- Java Development Kit (JDK) installed.

### Steps
1. Compile the files:
   ```bash
   javac clientChat.java serverChat.java
   ```
2. Start the server:
   ```bash
   java serverChat
   ```
3. Start the client in another terminal:
   ```bash
   java clientChat
   ```
4. Enter a message in the client terminal and observe the interaction.

---

## Example

### Server Output
```
Server is working...
Connection Established!
Client says: Hello, Server!
```

### Client Output
```
Client is waiting...
Enter your message:
Hello, Server!
Server says: Hello, Server!
```

---

## Notes

- **Port**: Ensure port `9806` is free.
- **Same Network**: Client and server should run on the same machine or accessible network.

---


This project serves as a straightforward introduction to Java socket programming.
