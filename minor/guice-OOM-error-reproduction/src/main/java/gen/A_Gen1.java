
  package gen;
  public class A_Gen1 {
  		@com.google.inject.Inject
  		public A_Gen1(A_Gen2 a_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  