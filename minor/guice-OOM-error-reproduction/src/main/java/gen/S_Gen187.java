
  package gen;
  public class S_Gen187 {
  		@com.google.inject.Inject
  		public S_Gen187(S_Gen188 s_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  