
  package gen;
  public class A_Gen42 {
  		@com.google.inject.Inject
  		public A_Gen42(A_Gen43 a_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  