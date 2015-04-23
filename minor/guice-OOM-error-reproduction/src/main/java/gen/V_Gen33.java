
  package gen;
  public class V_Gen33 {
  		@com.google.inject.Inject
  		public V_Gen33(V_Gen34 v_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  