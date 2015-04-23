
  package gen;
  public class A_Gen100 {
  		@com.google.inject.Inject
  		public A_Gen100(A_Gen101 a_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  