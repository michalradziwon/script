
  package gen;
  public class V_Gen135 {
  		@com.google.inject.Inject
  		public V_Gen135(V_Gen136 v_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  