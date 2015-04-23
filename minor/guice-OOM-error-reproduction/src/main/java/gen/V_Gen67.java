
  package gen;
  public class V_Gen67 {
  		@com.google.inject.Inject
  		public V_Gen67(V_Gen68 v_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  