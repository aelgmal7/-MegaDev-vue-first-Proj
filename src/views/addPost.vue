<template>
  <div class="about">
    <div class="container">
<!-- working on static data using vuex  -->
    <h1>add post</h1>
    <form>
       <div class="form-group">
    <label for="exampleInputEmail1">id</label>
    <input type="number" class="form-control" v-model="postData.id" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">post title</label>
    <input type="text" class="form-control" v-model="postData.title" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">des</label>
    <input type="text" class="form-control" v-model="postData.des" id="exampleInputPassword1">
  </div>
 <b-form-select v-model="postData.spec" :options="['sportsNews','entertainment']" ></b-form-select>
  <button type="submit" class="btn btn-primary"  @click="submitHandler()">Submit</button>
</form>
  </div></div>
</template>

<script>
import { mapActions } from 'vuex'

export default {
  name: 'addPost',
  data () {
    return {
      id: Number,
      comment: '',
      postData: {
        comments: [],
        title: '',
        des: '',
        spec: null

      }
    }
  },
  methods: {
    ...mapActions([
      'addPost'
    ]),
    // in this form
    submitHandler () {
      const { id, title, des, spec } = this.postData
      const payload = {
        post: {
          id,
          title,
          des
        },
        spec
      }
      this.addPost(payload)
      this.postData = {
        title: '',
        des: '',
        comments: [],
        spec: null
      }
      this.sendDatabase(payload)
      console.log(payload)
    },
    sendDatabase (payload) {
      this.axios.post('http://localhost:8080/api/v1/add/', payload.post)
        .then(response => {
          this.postss = response.data
          console.log(this.postss)
        })
    }
  }
}
</script>
