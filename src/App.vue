<template>
  <v-app>
    <!-- App bar-->
    <bar/>

    <v-main class="default-margin">

    <div v-if="this.$store.state.dev === true">
        <hr>
        <p> Thread Data = {{this.$store.state.items[0]._embedded.threads}}</p>
        <p> Document State = {{this.$store.state.docState}} </p>
        <hr>
    </div>

    <!-- Search Bar -->
    <Transition>
      <search v-if="this.$store.state.searchState === true" v-on:keyup.enter="this.$store.commit('chageSearchState')"/>
    </Transition>

    <!-- Condition bar -->
    <transition>
      <div v-if="this.$store.state.docState === 'default'" class="btn-margin">
        <default-menu />
      </div>
      <div v-if="this.$store.state.docState === 'login'" class="btn-margin">
        <login />
      </div>
      <div v-if="this.$store.state.docState === 'singin'" class="btn-margin">
        <JoinMember />
      </div>
      <div v-if="this.$store.state.docState === 'logined'" class="btn-margin">
        <Logined />
      </div>
      <div v-if="this.$store.state.docState === 'add'" class="btn-margin">
        <AddThread/>
      </div>
    </transition>

    <!-- Functions-->
    <div v-if="this.$store.state.docState === 'postThread'" >
        {{
        this.$store.commit('setDocState', 'logined')
        }}
        {{
        this.$store.commit('setTitle' ,'')
        }}
        {{
        this.$store.commit('setDescription', '')}}
        }}
    </div>








        <!-- Threads -->
        <transition>
          <div v-if="this.$store.state.searchTrigger === false || this.$store.state.searchKeyword === ''">
            <MyThreads  v-if="this.$store.state.docState === 'logined'" />
            <div></div>
            <AllThreads />
          </div>
          <div v-else>
            <SearchResult/>
          </div>
        </transition>
    </v-main>


    <!-- FOOTER -->

      <Footer />
  </v-app>
</template>

<script>
  import Login from "./components/Login";
  import DefaultMenu from "./components/DefaultMenu";
  import Search from "./components/Search";
  import Bar from "./components/Bar";
  import JoinMember from "./components/JoinMember";
  import Logined from "./components/Logined";
  import AddThread from "./components/AddThread";
  import MyThreads from "./components/MyThreads";
  import AllThreads from "./components/AllThreads";
  import SearchResult from "./components/SearchResult";
  import Footer from "./components/Footer";

export default {
  name: 'App',
  components: {
      Footer,
    SearchResult,
    AllThreads,
    MyThreads,
    AddThread,
    Logined,
    JoinMember,
    Bar,
    Search,
    DefaultMenu,
    Login
  },
  data: () => ({
    docState: 'default'
  }),


};
</script>

<style>
  .btn-margin{
    margin-right: auto;
    margin-left: auto;
  }
  .default-margin{
      margin-left: 24px;
      margin-right: 24px;
  }
</style>