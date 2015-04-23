
  package gen;
  public class S_Gen190 {
  		@com.google.inject.Inject
  		public S_Gen190(S_Gen191 s_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  