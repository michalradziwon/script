
  package gen;
  public class S_Gen140 {
  		@com.google.inject.Inject
  		public S_Gen140(S_Gen141 s_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  