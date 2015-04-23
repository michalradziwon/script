
  package gen;
  public class A_Gen114 {
  		@com.google.inject.Inject
  		public A_Gen114(A_Gen115 a_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  