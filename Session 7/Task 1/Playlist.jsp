<!DOCTYPE html>
<html>
<head>
    <title>Playlists</title>
</head>
<body>

    <h2>My Playlists</h2>

    <ul>
        <c:forEach var="playlist" items="${playlists}">
            <li>${playlist}</li>
        </c:forEach>
    </ul>

</body>
</html>