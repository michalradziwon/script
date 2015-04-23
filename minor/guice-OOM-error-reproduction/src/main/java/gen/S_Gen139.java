
  package gen;
  public class S_Gen139 {
  		@com.google.inject.Inject
  		public S_Gen139(S_Gen140 s_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  