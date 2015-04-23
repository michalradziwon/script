
  package gen;
  public class V_Gen11 {
  		@com.google.inject.Inject
  		public V_Gen11(V_Gen12 v_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  