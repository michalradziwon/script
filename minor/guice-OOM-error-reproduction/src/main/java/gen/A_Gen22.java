
  package gen;
  public class A_Gen22 {
  		@com.google.inject.Inject
  		public A_Gen22(A_Gen23 a_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  