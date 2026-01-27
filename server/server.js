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
  const startIndex = req.query.startIndex;
  const limit = req.query.limit;

  let message = Array.from(data);
  if (!startIndex) {
    message = message.slice(startIndex, data.length);
  }
  if (!limit) {
    message = message.slice(0, limit);
  }

  res.send(message);
})

app.listen(port, () => {
  console.log(`App listening on port ${port}`);
})