
  package gen;
  public class A_Gen104 {
  		@com.google.inject.Inject
  		public A_Gen104(A_Gen105 a_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  