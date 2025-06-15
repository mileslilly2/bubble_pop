// lib/bubble.dart
import 'dart:math';

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

  /// Area covered by the bubble on screen.
  double get area => pi * radius * radius;

  /// Distance to another bubble's center.
  double distanceTo(Bubble other) {
    final dx = x - other.x;
    final dy = y - other.y;
    return sqrt(dx * dx + dy * dy);
  }
}
