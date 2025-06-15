// lib/main.dart
import 'package:flutter/material.dart';
import 'package:bubble_pop/game_screen.dart'; // assumes you’ll make this next

void main() {
  runApp(const BubblePopApp());
}

class BubblePopApp extends StatelessWidget {
  const BubblePopApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Bubble Pop',
      home: const GameScreen(),     // your custom UI
      debugShowCheckedModeBanner: false,
    );
  }
}
