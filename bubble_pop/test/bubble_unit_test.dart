// test/bubble_unit_test.dart
import 'package:flutter_test/flutter_test.dart';
import 'dart:math';

import 'package:bubble_pop/bubble.dart';

void main() {
  test('Bubble pops correctly', () {
    final b = Bubble(x: 10, y: 20, radius: 30, color: 0xFF29B6F6);
    final score = b.pop();
    expect(b.isPopped, isTrue);
    expect(score, equals(10));
  });

  test('Bubble area calculation', () {
    final b = Bubble(x: 0, y: 0, radius: 2, color: 0);
    expect(b.area, closeTo(pi * 4, 0.001));
  });

  test('Distance between bubbles', () {
    final a = Bubble(x: 0, y: 0, radius: 1, color: 0);
    final b = Bubble(x: 3, y: 4, radius: 1, color: 0);
    expect(a.distanceTo(b), closeTo(5.0, 0.001));
  });
}
