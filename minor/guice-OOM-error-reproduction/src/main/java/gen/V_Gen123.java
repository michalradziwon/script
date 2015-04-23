
  package gen;
  public class V_Gen123 {
  		@com.google.inject.Inject
  		public V_Gen123(V_Gen124 v_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  