
  package gen;
  public class V_Gen65 {
  		@com.google.inject.Inject
  		public V_Gen65(V_Gen66 v_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  