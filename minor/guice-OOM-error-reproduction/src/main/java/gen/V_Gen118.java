
  package gen;
  public class V_Gen118 {
  		@com.google.inject.Inject
  		public V_Gen118(V_Gen119 v_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  