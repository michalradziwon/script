
  package gen;
  public class V_Gen37 {
  		@com.google.inject.Inject
  		public V_Gen37(V_Gen38 v_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  