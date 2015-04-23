
  package gen;
  public class A_Gen82 {
  		@com.google.inject.Inject
  		public A_Gen82(A_Gen83 a_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  