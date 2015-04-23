
  package gen;
  public class A_Gen188 {
  		@com.google.inject.Inject
  		public A_Gen188(A_Gen189 a_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  