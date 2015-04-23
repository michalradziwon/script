
  package gen;
  public class A_Gen55 {
  		@com.google.inject.Inject
  		public A_Gen55(A_Gen56 a_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  