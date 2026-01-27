const express = require('express')
const app = express()
const port = 3000

const data = [
    'a',
    'b',
    'c',
    'd',
    'e',
    'f'
]

app.get('/data', (req, res) => {
  res.send(data);
})

app.listen(port, () => {
  console.log(`App listening on port ${port}`);
})