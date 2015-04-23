
  package gen;
  public class S_Gen71 {
  		@com.google.inject.Inject
  		public S_Gen71(S_Gen72 s_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  