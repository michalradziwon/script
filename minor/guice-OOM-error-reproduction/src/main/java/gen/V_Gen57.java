
  package gen;
  public class V_Gen57 {
  		@com.google.inject.Inject
  		public V_Gen57(V_Gen58 v_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  