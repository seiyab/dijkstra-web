const express = require('express')
const app = express()

app.use(express.static('stub', {extensions: ['json']}))

app.listen(8888, () => console.log('Example app listening on port 8888!'))
