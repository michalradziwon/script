
  package gen;
  public class S_Gen76 {
  		@com.google.inject.Inject
  		public S_Gen76(S_Gen77 s_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  