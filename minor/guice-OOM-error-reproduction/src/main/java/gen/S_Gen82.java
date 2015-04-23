
  package gen;
  public class S_Gen82 {
  		@com.google.inject.Inject
  		public S_Gen82(S_Gen83 s_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  