import 'package:flutter/material.dart';

class ColumnWidget extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Widget Column'),
      ),
      body: Column(
        children: [
          Text('Kolom 1'),
          Text('Kolom 2'),
          Text('Kolom 3'),
          Text('Kolom 4'),
          Text('Kolom 5'),
        ],
      ),
    );
  }
}
