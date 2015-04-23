
  package gen;
  public class S_Gen104 {
  		@com.google.inject.Inject
  		public S_Gen104(S_Gen105 s_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  