// lib/bubble.dart
class Bubble {
  Bubble({required this.x, required this.y, required this.radius, required this.color});

  final double x, y, radius;
  final int color;
  bool isPopped = false;

  /// Pops the bubble and returns the score.
  int pop() {
    if (isPopped) return 0;   // idempotent
    isPopped = true;
    return 10;
  }
}
