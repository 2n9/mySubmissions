import "dart:io";
import "dart:math" as math;

void main() {
  List<int> l = (stdin.readLineSync() ?? "").split(" ").map((x) => int.parse(x)).toList();
  int a = l[0];
  int b = l[1];
  int ans = 1;
  for (int i = 0; i < (a-b).abs(); i++) {
    ans *= 32;
  }
  print(ans);
}