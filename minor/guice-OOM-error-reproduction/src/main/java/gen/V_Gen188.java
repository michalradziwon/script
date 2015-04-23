
  package gen;
  public class V_Gen188 {
  		@com.google.inject.Inject
  		public V_Gen188(V_Gen189 v_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  