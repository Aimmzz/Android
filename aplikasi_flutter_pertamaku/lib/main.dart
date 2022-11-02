import 'package:flutter/material.dart';
import 'package:aplikasi_flutter_pertamaku/hello_world.dart';
import 'package:aplikasi_flutter_pertamaku/column_widget.dart';
import 'package:aplikasi_flutter_pertamaku/row_widget.dart';
import 'package:aplikasi_flutter_pertamaku/ui/produk_form.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Aplikasi Flutter Pertama',
      home: ProdukForm(),
    );
  }
}
