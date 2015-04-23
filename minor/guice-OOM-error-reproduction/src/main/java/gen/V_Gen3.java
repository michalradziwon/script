
  package gen;
  public class V_Gen3 {
  		@com.google.inject.Inject
  		public V_Gen3(V_Gen4 v_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  