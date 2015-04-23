
  package gen;
  public class A_Gen73 {
  		@com.google.inject.Inject
  		public A_Gen73(A_Gen74 a_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  