
  package gen;
  public class V_Gen159 {
  		@com.google.inject.Inject
  		public V_Gen159(V_Gen160 v_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  