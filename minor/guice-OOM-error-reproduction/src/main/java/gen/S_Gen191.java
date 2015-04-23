
  package gen;
  public class S_Gen191 {
  		@com.google.inject.Inject
  		public S_Gen191(S_Gen192 s_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  