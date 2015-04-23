
  package gen;
  public class A_Gen14 {
  		@com.google.inject.Inject
  		public A_Gen14(A_Gen15 a_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  