
  package gen;
  public class V_Gen15 {
  		@com.google.inject.Inject
  		public V_Gen15(V_Gen16 v_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  