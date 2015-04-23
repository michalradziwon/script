
  package gen;
  public class V_Gen127 {
  		@com.google.inject.Inject
  		public V_Gen127(V_Gen128 v_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  