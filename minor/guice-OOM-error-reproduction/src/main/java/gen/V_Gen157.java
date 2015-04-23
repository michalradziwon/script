
  package gen;
  public class V_Gen157 {
  		@com.google.inject.Inject
  		public V_Gen157(V_Gen158 v_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  