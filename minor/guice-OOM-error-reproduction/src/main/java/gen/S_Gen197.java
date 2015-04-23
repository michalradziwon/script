
  package gen;
  public class S_Gen197 {
  		@com.google.inject.Inject
  		public S_Gen197(S_Gen198 s_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  