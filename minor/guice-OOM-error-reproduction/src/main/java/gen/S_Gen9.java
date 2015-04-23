
  package gen;
  public class S_Gen9 {
  		@com.google.inject.Inject
  		public S_Gen9(S_Gen10 s_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  