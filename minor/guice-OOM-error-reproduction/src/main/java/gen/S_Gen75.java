
  package gen;
  public class S_Gen75 {
  		@com.google.inject.Inject
  		public S_Gen75(S_Gen76 s_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  