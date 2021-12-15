import "dart:io";
import "dart:math" as math;

Function readIntList = () => (stdin.readLineSync() ?? "").split(" ").map((x) => int.parse(x)).toList();
Function readList = () => (stdin.readLineSync() ?? "").split(" ").toList();
Function read = () => (stdin.readLineSync() ?? "");

Function out = (Object s) => print(s);

void main() {
  out(read());
}