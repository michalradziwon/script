
  package gen;
  public class A_Gen2 {
  		@com.google.inject.Inject
  		public A_Gen2(A_Gen3 a_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  