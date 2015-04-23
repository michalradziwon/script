
  package gen;
  public class V_Gen119 {
  		@com.google.inject.Inject
  		public V_Gen119(V_Gen120 v_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  