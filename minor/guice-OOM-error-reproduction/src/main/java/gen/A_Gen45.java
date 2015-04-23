
  package gen;
  public class A_Gen45 {
  		@com.google.inject.Inject
  		public A_Gen45(A_Gen46 a_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  