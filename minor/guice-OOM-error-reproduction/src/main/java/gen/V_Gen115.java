
  package gen;
  public class V_Gen115 {
  		@com.google.inject.Inject
  		public V_Gen115(V_Gen116 v_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  