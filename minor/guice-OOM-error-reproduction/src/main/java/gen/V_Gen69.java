
  package gen;
  public class V_Gen69 {
  		@com.google.inject.Inject
  		public V_Gen69(V_Gen70 v_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  