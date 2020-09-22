<template>
  <div>
    <!-- working in dataBase Connection -->
    <div class="container">
      <h1 > sports news </h1>
      <!-- represent imported data frpm database -->
    <table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">title</th>
      <th scope="col">des</th>
      <th scope="col">delete</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="(post,index) in postss" :key="index">
      <th scope="row">{{index}}</th>
      <td><router-link :to="`/post/sportsNews/${index}`"> {{post.title}}</router-link></td>
      <td>{{post.des}}</td>
        <td>
            <button class="btn btn-danger" @click="removePostFromDataBase(post.id)">delete</button>
        </td>
    </tr>
  </tbody>
</table>
    </div>
  </div>
</template>
<script>
import { mapState, mapActions } from 'vuex'
export default {
  name: 'Sports',
  data () {
    return {
      postss: null
    }
  },
  computed: {
    ...mapState([
      'sportsNews'
    ])
  },
  methods: {
    deletePost (post, index) {
      this.removePost({ post, index })
      console.log(this.sportsNews)
      // this.deleteDatabase(post, index)
    },
    ...mapActions([
      'removePost'
    ]),
    // to delete data from database
    removePostFromDataBase (index) {
      this.axios.delete('http://localhost:8080/api/v1/posts/' + index).then(res => {
        console.log(res)
      })
    }
  },
  created () {
    // to import data from database and represent in first table
    // eslint-disable-next-line no-unused-expressions
    this.axios.get('http://localhost:8080/api/v1/show')
      .then(response => {
        this.postss = response.data
        console.log(this.postss)
      })
  }
}
</script>
