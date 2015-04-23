
  package gen;
  public class V_Gen107 {
  		@com.google.inject.Inject
  		public V_Gen107(V_Gen108 v_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  