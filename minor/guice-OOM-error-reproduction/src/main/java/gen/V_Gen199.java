
  package gen;
  public class V_Gen199 {
  		@com.google.inject.Inject
  		public V_Gen199(V_Gen200 v_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  