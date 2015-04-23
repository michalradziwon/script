
  package gen;
  public class V_Gen136 {
  		@com.google.inject.Inject
  		public V_Gen136(V_Gen137 v_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  