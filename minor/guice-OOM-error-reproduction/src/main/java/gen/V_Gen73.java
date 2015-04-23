
  package gen;
  public class V_Gen73 {
  		@com.google.inject.Inject
  		public V_Gen73(V_Gen74 v_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  