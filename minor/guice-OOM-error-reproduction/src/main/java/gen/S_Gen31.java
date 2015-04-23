
  package gen;
  public class S_Gen31 {
  		@com.google.inject.Inject
  		public S_Gen31(S_Gen32 s_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  