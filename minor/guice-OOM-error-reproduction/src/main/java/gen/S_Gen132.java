
  package gen;
  public class S_Gen132 {
  		@com.google.inject.Inject
  		public S_Gen132(S_Gen133 s_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  