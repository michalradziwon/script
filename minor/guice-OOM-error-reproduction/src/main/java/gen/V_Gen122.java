
  package gen;
  public class V_Gen122 {
  		@com.google.inject.Inject
  		public V_Gen122(V_Gen123 v_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  