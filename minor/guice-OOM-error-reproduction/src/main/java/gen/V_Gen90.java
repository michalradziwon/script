
  package gen;
  public class V_Gen90 {
  		@com.google.inject.Inject
  		public V_Gen90(V_Gen91 v_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  