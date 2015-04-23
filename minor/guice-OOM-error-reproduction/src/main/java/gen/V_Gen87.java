
  package gen;
  public class V_Gen87 {
  		@com.google.inject.Inject
  		public V_Gen87(V_Gen88 v_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  