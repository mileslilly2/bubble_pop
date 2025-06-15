// test/bubble_unit_test.dart
import 'package:flutter_test/flutter_test.dart';
import 'package:bubble_pop/bubble.dart';

void main() {
  test('Bubble pops correctly', () {
    final b = Bubble(x: 10, y: 20, radius: 30, color: 0xFF29B6F6);
    final score = b.pop();
    expect(b.isPopped, isTrue);
    expect(score, equals(10));
  });
}
