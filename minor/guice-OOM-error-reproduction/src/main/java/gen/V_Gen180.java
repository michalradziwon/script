
  package gen;
  public class V_Gen180 {
  		@com.google.inject.Inject
  		public V_Gen180(V_Gen181 v_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  