<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "myDB";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

//$sql = "INSERT INTO kitty (firstname, lastname, email)
//VALUES ('John', 'Doe', 'john@example.com')";
//$sql = "INSERT INTO kitty (firstname, lastname, email)
//VALUES ('Jo', 'Do', 'jo@example.com')";
$sql = "INSERT INTO kitty (firstname, lastname, email)
VALUES ('Jiss', 'tean', 'jiss@example.com')";

if ($conn->query($sql) === TRUE) {
  echo "New record created successfully";
} else {
  echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>