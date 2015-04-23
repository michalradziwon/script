
  package gen;
  public class A_Gen175 {
  		@com.google.inject.Inject
  		public A_Gen175(A_Gen176 a_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  