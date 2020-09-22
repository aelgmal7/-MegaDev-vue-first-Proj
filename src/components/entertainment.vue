<template>
  <div>
    <div class="container">
    <table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">title</th>
      <th scope="col">des</th>
      <th scope="col">comments</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="(post,index) in entertainment" :key="index">
      <th scope="row">{{index}}</th>
      <td><router-link :to="`/post/entertainment/${post.id}`"> {{post.title}}</router-link></td>
      <td>{{post.des}}</td>
      <td><ul v-for="(comment,i) in post.comments" :key="i">
        <li>{{comment}}</li></ul></td>
    </tr>
  </tbody>
</table>    </div>
  </div>
</template>
<script>
import { mapState } from 'vuex'
export default {
  name: 'entertainment',
  computed: {
    ...mapState([
      'entertainment'
    ])
  }
}
</script>
