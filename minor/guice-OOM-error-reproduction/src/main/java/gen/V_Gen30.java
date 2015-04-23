
  package gen;
  public class V_Gen30 {
  		@com.google.inject.Inject
  		public V_Gen30(V_Gen31 v_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  