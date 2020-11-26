const express = require("express");
const app = express();
let port = process.env.PORT || 3000;

app.get("/",(req, res) => {
    res.send("NUDES");
});

app.listen(port, () => {
    console.log(`Example app listening at http://localhost:${port}`);
});