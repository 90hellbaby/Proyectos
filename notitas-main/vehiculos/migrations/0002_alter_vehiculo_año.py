# Generated by Django 4.1 on 2022-11-14 23:03

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ("vehiculos", "0001_initial"),
    ]

    operations = [
        migrations.AlterField(
            model_name="vehiculo",
            name="año",
            field=models.IntegerField(null=True),
        ),
    ]
