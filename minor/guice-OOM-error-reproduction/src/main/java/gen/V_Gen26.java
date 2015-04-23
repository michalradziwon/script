
  package gen;
  public class V_Gen26 {
  		@com.google.inject.Inject
  		public V_Gen26(V_Gen27 v_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  