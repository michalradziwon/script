
  package gen;
  public class V_Gen189 {
  		@com.google.inject.Inject
  		public V_Gen189(V_Gen190 v_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  