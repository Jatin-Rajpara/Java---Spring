<!DOCTYPE html>
<html>
<head>
    <title>Add Playlist</title>
</head>
<body>

    <h2>Add New Playlist</h2>

    <form action="savePlaylist" method="post">

        Playlist Name:
        <input type="text" name="name">
        <br><br>

        Description:
        <textarea name="description"></textarea>
        <br><br>

        <input type="submit" value="Add Playlist">

    </form>

</body>
</html>