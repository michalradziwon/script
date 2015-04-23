
  package gen;
  public class S_Gen27 {
  		@com.google.inject.Inject
  		public S_Gen27(S_Gen28 s_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  