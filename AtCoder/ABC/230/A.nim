from strutils import parseInt

let input = readLine(stdin)
var count = parseInt(input)

if count <= 9:
  echo("AGC00", count)
elif count <= 41:
  echo("AGC0", count)
elif count <= 42:
  echo("AGC0", count+1)
elif count <= 98:
  echo("AGC0", count+1)
elif count <= 99:
  echo("AGC", count+1)
else:
  echo("AGC", count+1)
