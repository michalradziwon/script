
  package gen;
  public class V_Gen56 {
  		@com.google.inject.Inject
  		public V_Gen56(V_Gen57 v_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  