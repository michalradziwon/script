
  package gen;
  public class V_Gen138 {
  		@com.google.inject.Inject
  		public V_Gen138(V_Gen139 v_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  