
  package gen;
  public class V_Gen128 {
  		@com.google.inject.Inject
  		public V_Gen128(V_Gen129 v_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  