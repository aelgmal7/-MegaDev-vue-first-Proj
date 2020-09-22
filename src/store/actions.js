export default {
  addPost: ({ commit }, payload) => {
    commit('addPostMutations', payload)
  },
  removePost: ({ commit }, { post, index }) => {
    commit('removePostMutation', { post, index })
  }
}
