
  package gen;
  public class S_Gen10 {
  		@com.google.inject.Inject
  		public S_Gen10(S_Gen11 s_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  