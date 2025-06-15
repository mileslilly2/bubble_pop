// test/app_golden_test.dart
import 'package:flutter_test/flutter_test.dart';
import 'package:flutter/material.dart';
import 'package:bubble_pop/main.dart';

void main() {
  testWidgets('first frame matches golden', (WidgetTester tester) async {
    await tester.pumpWidget(const BubblePopApp());

    // Wait for first animation tick so bubbles appear
    await tester.pump(const Duration(milliseconds: 16));

    // Take a screenshot and compare to golden file in /goldens/baseline.png
    await expectLater(
      find.byType(BubblePopApp),
      matchesGoldenFile('goldens/baseline.png'),
    );
  });
}
// This test checks that the first frame of the BubblePopApp matches the golden file.