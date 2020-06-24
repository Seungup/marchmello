import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    docState: 'default'
  },
  mutations: {
    setDocState (state, stateValue) {
      state.docState = stateValue
    }
  },
  actions: {
  },
  modules: {
  }
})
