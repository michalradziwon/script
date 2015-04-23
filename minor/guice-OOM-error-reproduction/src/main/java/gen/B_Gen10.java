
  package gen;
  public class B_Gen10 {
  		@com.google.inject.Inject
  		public B_Gen10(B_Gen11 b_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  