
  package gen;
  public class V_Gen1 {
  		@com.google.inject.Inject
  		public V_Gen1(V_Gen2 v_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  