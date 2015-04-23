
  package gen;
  public class V_Gen143 {
  		@com.google.inject.Inject
  		public V_Gen143(V_Gen144 v_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  