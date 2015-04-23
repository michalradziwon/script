
  package gen;
  public class V_Gen177 {
  		@com.google.inject.Inject
  		public V_Gen177(V_Gen178 v_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  