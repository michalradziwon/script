
  package gen;
  public class V_Gen61 {
  		@com.google.inject.Inject
  		public V_Gen61(V_Gen62 v_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  