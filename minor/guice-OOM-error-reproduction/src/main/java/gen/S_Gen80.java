
  package gen;
  public class S_Gen80 {
  		@com.google.inject.Inject
  		public S_Gen80(S_Gen81 s_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  