
  package gen;
  public class V_Gen6 {
  		@com.google.inject.Inject
  		public V_Gen6(V_Gen7 v_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  