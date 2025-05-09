<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';

const alumnos = ref({});
const cargarAlumnos = async () => {
  const response = await axios.get('http://localhost:8080/alumnos/traer-alumnos')
  alumnos.value = response.data;
  console.log(alumnos.value);
}


onMounted(cargarAlumnos);
</script>

<template>
<div class="container">
  <h2>Tabla de alumnos </h2>
  <table class="table">
  <thead>
    <tr>
      <th scope="col"> Id</th>
      <th scope="col">Nombre</th>
      <th scope="col">Apellidos</th>
      <th scope="col">Carrera</th>
      <th scope="col">Telefono</th>
      <th scope="col">Imagen</th>
      <th scope="col">Acciones</th>

    </tr>
  </thead>
  <tbody>
  <tr v-for="alumno in alumnos" :key="alumno.Id">
    <td>{{ alumno.Id }}</td>
    <td>{{ alumno.Nombre }}</td>
    <td>{{ alumno.Apellidos }}</td>
    <td>{{ alumno.Carrera }}</td>
    <td>{{ alumno.Telefono }}</td>
    <td><img :src="alumno.Imagen" alt="Imagen de Alumno" width="50"></td>
    <td><button class="btn btn-danger">Eliminar</button></td>

  </tr>
  </tbody>
</table>
</div>
</template>
z
<style scoped>

</style>
