// lib/game_screen.dart
import 'package:flutter/material.dart';
import 'package:bubble_pop/bubble.dart';

class GameScreen extends StatelessWidget {
  const GameScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    // Draw a single Bubble at the center
    return Scaffold(
      backgroundColor: Colors.white,
      body: Center(
        child: CustomPaint(
          size: const Size(100, 100),
          painter: _BubblePainter(),
        ),
      ),
    );
  }
}

class _BubblePainter extends CustomPainter {
  @override
  void paint(Canvas canvas, Size size) {
    final bubble = Bubble(
      x: size.width/2,
      y: size.height/2,
      radius: 40,
      color: 0xFF29B6F6,
    );
    final paint = Paint()
      ..color = Color(bubble.color)
      ..style = PaintingStyle.fill;
    canvas.drawCircle(Offset(bubble.x, bubble.y), bubble.radius, paint);
  }

  @override
  bool shouldRepaint(covariant CustomPainter old) => false;
}
