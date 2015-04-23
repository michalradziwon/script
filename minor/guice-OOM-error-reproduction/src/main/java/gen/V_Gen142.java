
  package gen;
  public class V_Gen142 {
  		@com.google.inject.Inject
  		public V_Gen142(V_Gen143 v_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  