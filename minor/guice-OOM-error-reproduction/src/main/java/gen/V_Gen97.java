
  package gen;
  public class V_Gen97 {
  		@com.google.inject.Inject
  		public V_Gen97(V_Gen98 v_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  