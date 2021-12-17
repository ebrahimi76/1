<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Library</title>
    <style>
        body {
            background: lightblue;
        }

        body > * {
            padding: 1%;
        }

        header {
            margin-top: 8%;
            margin-right: 8%;
            margin-left: 8%;
            margin-bottom: 1%;
            background: blue;
            text-align: center;
            color: lightblue;
            font-family: Trebuchet MS, serif;
        }

        header h1 {
            font-size: xx-large;
        }

        header p {
            font-size: small;
        }

        main {
            margin-right: 8%;
            margin-left: 8%;
            padding-left: 5%;
            padding-right: 5%;
            background: blue;
        }

        main a > * {
            margin: 2%;
            align-items: center;
        }

        main button {
            width: 45%;
            text-align: center;
            color: blue;
            font-size: medium;
            font-weight: bolder;
            padding: 3%;
            margin: 2%;
            border: none;
            background: lightblue;
            border-radius: 10px;
            font-family: Trebuchet MS, serif;
            cursor: pointer;
        }

        footer {
            margin-left: 7%;
        }

        footer button {
            width: 15%;
            padding: 1%;
            font-family: Trebuchet MS, serif;
            text-align: center;
            color: lightblue;
            font-weight: bold;
            border: none;
            background: blue;
            cursor: pointer;
        }
    </style>
</head>

<body>
<header>
    <h1>My Library</h1>
    <p>Please select an item!</p>
</header>
<main>
    <a href="book/book.html">
        <button>BOOK</button>
    </a>
    <a href="author/author.html">
        <button>AUTHOR</button>
    </a>
</main>
<footer>
    <a href="https://github.com/ebrahimi76/maktab/tree/master/hw18/hw18q4" target="_blank" title="My Github!">
        <button>Contact Me</button>
    </a>
</footer>
</body>

</html>