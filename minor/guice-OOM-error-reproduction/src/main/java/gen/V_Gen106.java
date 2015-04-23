
  package gen;
  public class V_Gen106 {
  		@com.google.inject.Inject
  		public V_Gen106(V_Gen107 v_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  