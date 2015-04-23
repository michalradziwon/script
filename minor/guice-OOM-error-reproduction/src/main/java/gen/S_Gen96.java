
  package gen;
  public class S_Gen96 {
  		@com.google.inject.Inject
  		public S_Gen96(S_Gen97 s_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  