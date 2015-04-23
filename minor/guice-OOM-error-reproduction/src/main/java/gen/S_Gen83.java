
  package gen;
  public class S_Gen83 {
  		@com.google.inject.Inject
  		public S_Gen83(S_Gen84 s_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  