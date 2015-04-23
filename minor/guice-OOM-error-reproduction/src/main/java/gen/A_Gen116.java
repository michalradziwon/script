
  package gen;
  public class A_Gen116 {
  		@com.google.inject.Inject
  		public A_Gen116(A_Gen117 a_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  