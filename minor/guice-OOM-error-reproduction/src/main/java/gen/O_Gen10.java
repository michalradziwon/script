
  package gen;
  public class O_Gen10 {
  		@com.google.inject.Inject
  		public O_Gen10(O_Gen11 o_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  