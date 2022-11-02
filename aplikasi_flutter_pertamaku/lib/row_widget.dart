import 'package:flutter/material.dart';

class WidgetRow extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text('WidgetRow'),
        ),
        body: Row(
          children: [
            Text('Row 1'),
            Text('Row 2'),
            Text('Row 3'),
            Text('Row 4'),
          ],
        ));
  }
}
