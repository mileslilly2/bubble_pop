// test/bubble_test.dart
import 'package:flutter_test/flutter_test.dart';
import 'package:bubble_pop/bubble.dart';

void main() {
  test('Bubble pops correctly', () {
    final bubble = Bubble(x: 0, y: 0, radius: 10, color: 0xFFFFFF);
    final score = bubble.pop();
    expect(bubble.isPopped, isTrue);
    expect(score, equals(10));
  });
}
