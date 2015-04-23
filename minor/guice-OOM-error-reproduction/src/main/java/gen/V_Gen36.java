
  package gen;
  public class V_Gen36 {
  		@com.google.inject.Inject
  		public V_Gen36(V_Gen37 v_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  