
  package gen;
  public class H_Gen10 {
  		@com.google.inject.Inject
  		public H_Gen10(H_Gen11 h_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  