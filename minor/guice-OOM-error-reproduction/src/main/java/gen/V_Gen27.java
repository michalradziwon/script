
  package gen;
  public class V_Gen27 {
  		@com.google.inject.Inject
  		public V_Gen27(V_Gen28 v_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  