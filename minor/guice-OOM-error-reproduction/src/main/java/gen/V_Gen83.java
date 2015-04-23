
  package gen;
  public class V_Gen83 {
  		@com.google.inject.Inject
  		public V_Gen83(V_Gen84 v_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  