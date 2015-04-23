
  package gen;
  public class D_Gen10 {
  		@com.google.inject.Inject
  		public D_Gen10(D_Gen11 d_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  