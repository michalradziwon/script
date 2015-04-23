
  package gen;
  public class V_Gen93 {
  		@com.google.inject.Inject
  		public V_Gen93(V_Gen94 v_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  